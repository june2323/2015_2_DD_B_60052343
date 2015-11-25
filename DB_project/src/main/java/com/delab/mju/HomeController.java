package com.delab.mju;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.junit.runner.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
    private DAOService DAOService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	/*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws ClassNotFoundException, SQLException {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
        return "home";
	}

*/	
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(Locale locale, Model model) {
        logger.info("Welcome main.", locale);
 
        // view 화면인 main.jsp에 DB로부터 읽어온 데이터를 보여준다.
        ModelAndView result = new ModelAndView();
        //addObject view에 넘어가는 데이터
        List<employee> employeeList = DAOService.getemployee();
        result.addObject("result", employeeList);
        
        List<positions> positionsList = DAOService.getpositions();
        result.addObject("result2", positionsList);
        
        List<department> departmentList = DAOService.getdepartment();
        result.addObject("result3", departmentList);
        
        List<own_technical_content> tech = DAOService.gettech();
        result.addObject("result4", tech);
        
        List<project> projectList = DAOService.getproject();
        result.addObject("result5", projectList);
        
        List<join_project> join_projectList = DAOService.getjoin_project();
        result.addObject("result6", join_projectList);
        
        List<role> roleList = DAOService.getrole();
        result.addObject("result7", roleList);
        
        result.setViewName("home");
        return result;
    }
    
	 @RequestMapping(value = "/check", method = RequestMethod.POST)
	    public String checkID(HttpServletRequest request, RedirectAttributes redirectAttributes) {
	        String user_id = request.getParameter("userid");
	        String user_password = request.getParameter("pwd");

	        employee employee = DAOService.selectidpwd(user_id);
	      
	        
	        if(employee == null)
	        {
		        redirectAttributes.addFlashAttribute("message", "아이디가 틀렸습니다.");
		        return "redirect:/";
	        }
	        else if (user_password.equals(employee.get_user_password()))
	        {
	        	return "insa";
	        }
	        else
	        {
	        	redirectAttributes.addFlashAttribute("message", "비밀번호가 틀렸습니다.");
		        return "redirect:/";
	        
	        }
	    }
    
    
    
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
		public String printHello(ModelMap model)
		{
			model.addAttribute("message", "Hello Spring MVC Framework!");
			return "hello";
		}
	
}
