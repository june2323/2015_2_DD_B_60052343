package com.delab.mju;

import java.util.ArrayList;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 //Service 클래스를 Repository로 등록함으로서 빈(bean) 클래스로 사용하능하게한다. 
@Repository
public class DAOService implements DAO {
 
 //Autowired를 사용하여 sqlSession을 사용할수 있다.
    @Autowired
    private SqlSession sqlSession;
    // employee 부분
    @Override
    public ArrayList<employee> getemployee() {
        ArrayList<employee> result = new ArrayList<employee>();
        //sqlSession을 통하여 매핑한다.
        Mapper Mapper = sqlSession.getMapper(Mapper.class);
        //getMember()의 메소드명과 mapper.mxl과 id는 동일해야한다.
        result = Mapper.getemployee();
        
        return result;
    }
    @Override
    public void insertemployee(employee employee) {
    	Mapper Mapper = sqlSession.getMapper(Mapper.class);
    	Mapper.insertemployee(employee);
    }
 //아래부분은 코딩하다 말았음
    @Override
    public void updateemployee(int emp_number) {
    }
    @Override
    public void deleteemployee(int emp_number) {
    
    }
 // positions 부분
    @Override
    public ArrayList<positions> getpositions(){
    	ArrayList<positions> result = new ArrayList<positions>();
        //sqlSession을 통하여 매핑한다.
        Mapper Mapper = sqlSession.getMapper(Mapper.class);
        //getMember()의 메소드명과 mapper.mxl과 id는 동일해야한다.
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
    
    // department 부분
    @Override
    public ArrayList<department> getdepartment(){
    	ArrayList<department> result = new ArrayList<department>();
        //sqlSession을 통하여 매핑한다.
        Mapper Mapper = sqlSession.getMapper(Mapper.class);
        //getMember()의 메소드명과 mapper.mxl과 id는 동일해야한다.
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
}