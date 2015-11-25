package com.delab.mju;

import java.util.ArrayList;

public interface DAO {
 
    public ArrayList<employee> getemployee();
    public void insertemployee(employee employee);
    public void updateemployee(int emp_number);
    public void deleteemployee(int emp_number);
    public employee selectidpwd(String user_id);
    
    public ArrayList<positions> getpositions();
    public void insertpositions(positions positions);
    public void updatepositions(int position_number);
    public void deletepositions(int position_number);
    
    public ArrayList<department> getdepartment();
    public void insertdepartment(department department);
    public void updatedepartment(int dept_number);
    public void deletedepartment(int dept_number);
    
    public ArrayList<retire> getretire();
    public void insertretire(retire retire);
    public void updateretire(int emp_number);
    public void deleteretire(int emp_number);
    
    public ArrayList<own_technical_content> gettech();
    public void inserttech(own_technical_content tech);
    public void updatetech(int emp_number, String tech_con_name);
    public void deletetech(int emp_number, String tech_con_name);
    
    public ArrayList<project> getproject();
    public void insertproject(project project);
    public void updateproject(int project_number);
    public void deleteproject(int project_number);
    
    public ArrayList<join_project> getjoin_project();
    public void insertjoin_project(join_project join_project);
    public void updatejoin_project(int project_number, int emp_number);
    public void deletejoin_project(int project_number, int emp_number);
 
    public ArrayList<role> getrole();
    public void insertrole(role role);
    public void updaterole(int role_number);
    public void deleterole(int role_number);
 
}
