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
        //getMember()�� �޼ҵ���� mapper.mxl�� id�� �����ؾ��Ѵ�.
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
 // positions �κ�
    @Override
    public ArrayList<positions> getpositions(){
    	ArrayList<positions> result = new ArrayList<positions>();
        //sqlSession�� ���Ͽ� �����Ѵ�.
        Mapper Mapper = sqlSession.getMapper(Mapper.class);
        //getMember()�� �޼ҵ���� mapper.mxl�� id�� �����ؾ��Ѵ�.
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
        //getMember()�� �޼ҵ���� mapper.mxl�� id�� �����ؾ��Ѵ�.
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