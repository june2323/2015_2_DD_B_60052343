package com.delab.mju;

import java.util.ArrayList;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 //Service Ŭ������ Repository�� ��������μ� ��(bean) Ŭ������ ����ϴ��ϰ��Ѵ�. 
@Repository
public class DAOService implements DAO {
 
 //Autowired�� ����Ͽ� sqlSession�� ����Ҽ� �ִ�.
    @Autowired
    private SqlSession sqlSession;
    // employee �κ�
    @Override
    public ArrayList<employee> getemployee() {
        ArrayList<employee> result = new ArrayList<employee>();
        //sqlSession�� ���Ͽ� �����Ѵ�.
        Mapper Mapper = sqlSession.getMapper(Mapper.class);
        //getMember()�� �޼ҵ��� mapper.mxl�� id�� �����ؾ��Ѵ�.
        result = Mapper.getemployee();
        
        return result;
    }
    @Override
    public void insertemployee(employee employee) {
    	Mapper Mapper = sqlSession.getMapper(Mapper.class);
    	Mapper.insertemployee(employee);
    }
 //�Ʒ��κ��� �ڵ��ϴ� ������
    @Override
    public void updateemployee(int emp_number) {
    }
    @Override
    public void deleteemployee(int emp_number) {
    
    }
    @Override
    public employee selectidpwd(String user_id)
    {
    	employee result = new employee();
        //sqlSession�� ���Ͽ� �����Ѵ�.
        Mapper Mapper = sqlSession.getMapper(Mapper.class);
        //getMember()�� �޼ҵ��� mapper.mxl�� id�� �����ؾ��Ѵ�.
        result = Mapper.selectidpwd(user_id);
        
        return result;
    }
 // positions �κ�
    @Override
    public ArrayList<positions> getpositions(){
    	ArrayList<positions> result = new ArrayList<positions>();
        //sqlSession�� ���Ͽ� �����Ѵ�.
        Mapper Mapper = sqlSession.getMapper(Mapper.class);
        //getMember()�� �޼ҵ��� mapper.mxl�� id�� �����ؾ��Ѵ�.
        result = Mapper.getpositions();
        
    	return result;
    }
    @Override
    public void insertpositions(positions positions){
    	
    }
    @Override
    public void updatepositions(int position_number){
    	
    }
    @Override
    public void deletepositions(int position_number){
    	
    }
    
    // department �κ�
    @Override
    public ArrayList<department> getdepartment(){
    	ArrayList<department> result = new ArrayList<department>();
        //sqlSession�� ���Ͽ� �����Ѵ�.
        Mapper Mapper = sqlSession.getMapper(Mapper.class);
        //getMember()�� �޼ҵ��� mapper.mxl�� id�� �����ؾ��Ѵ�.
        result = Mapper.getdepartment();
        
    	return result;
    }
    @Override
    public void insertdepartment(department department){
    	
    }
    @Override
    public void updatedepartment(int dept_number){
    	
    }
    @Override
    public void deletedepartment(int dept_number){
    	
    }
    
    // retire �κ�
    @Override
    public ArrayList<retire> getretire(){
    	ArrayList<retire> result = new ArrayList<retire>();
        //sqlSession�� ���Ͽ� �����Ѵ�.
        Mapper Mapper = sqlSession.getMapper(Mapper.class);
        //getMember()�� �޼ҵ��� mapper.mxl�� id�� �����ؾ��Ѵ�.
        result = Mapper.getretire();
        
    	return result;
    }
    @Override
    public void insertretire(retire retire){
    	
    }
    @Override
    public void updateretire(int emp_number){
    	
    }
    @Override
    public void deleteretire(int emp_number){
    	
    }
    
    // tech �κ�
    @Override
    public ArrayList<own_technical_content> gettech(){
    	ArrayList<own_technical_content> result = new ArrayList<own_technical_content>();
        //sqlSession�� ���Ͽ� �����Ѵ�.
        Mapper Mapper = sqlSession.getMapper(Mapper.class);
        //getMember()�� �޼ҵ��� mapper.mxl�� id�� �����ؾ��Ѵ�.
        result = Mapper.gettech();
        
    	return result;
    }
    @Override
    public void inserttech(own_technical_content tech){
    	
    }
    @Override
    public void updatetech(int emp_number, String tech_con_name){
    	
    }
    @Override
    public void deletetech(int emp_number, String tech_con_name){
    	
    }
    
	@Override
	public ArrayList<project> getproject() {
		
	    ArrayList<project> result = new ArrayList<project>();
        Mapper Mapper = sqlSession.getMapper(Mapper.class);
        result = Mapper.getproject();
        
        return result;
	}
	@Override
	public void insertproject(project project) {
		Mapper Mapper = sqlSession.getMapper(Mapper.class);
    	Mapper.insertproject(project);
		
	}
	@Override
	public void updateproject(int project_number) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteproject(int project_number) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<join_project> getjoin_project() {
		 ArrayList<join_project> result = new ArrayList<join_project>();
	        Mapper Mapper = sqlSession.getMapper(Mapper.class);
	        result = Mapper.getjoin_project();
	        
	        return result;
	}
	@Override
	public void insertjoin_project(join_project join_project) {
		Mapper Mapper = sqlSession.getMapper(Mapper.class);
    	Mapper.insertjoin_project(join_project);
		
	}
	@Override
	public void updatejoin_project(int project_number, int emp_number) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletejoin_project(int project_number, int emp_number) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<role> getrole() {
		 ArrayList<role> result = new ArrayList<role>();
	        Mapper Mapper = sqlSession.getMapper(Mapper.class);
	        result = Mapper.getrole();
	        
	        return result;
	}
	@Override
	public void insertrole(role role) {
		Mapper Mapper = sqlSession.getMapper(Mapper.class);
    	Mapper.insertrole(role);
		
	}
	@Override
	public void updaterole(int role_number) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleterole(int role_number) {
		// TODO Auto-generated method stub
		
	}
}