package com.delab.mju;
import java.util.ArrayList;

import com.delab.mju.employee;
import com.delab.mju.positions;
import com.delab.mju.department;
import com.delab.mju.retire;
import com.delab.mju.own_technical_content;
import com.delab.mju.project;
import com.delab.mju.role;
import com.delab.mju.join_project;
 
public interface Mapper {
    ArrayList<employee> getemployee();
    void insertemployee(employee employee);
    void updateemployee(int emp_number);
    void deleteemployee(int emp_number);
    employee selectidpwd(String user_id);
    
    ArrayList<positions> getpositions();
    void insertpositions(positions positions);
    void updatepositions(int position_number);
    void deletepositions(int position_number);
    positions selectposition(int position_number);
    
    public ArrayList<department> getdepartment();
    public void insertdepartment(department department);
    public void updatedepartment(int dept_number);
    public void deletedepartment(int dept_number);
    department selectdepartment(int dept_number);
    
    public ArrayList<retire> getretire();
    public void insertretire(retire retire);
    public void updateretire(int emp_number);
    public void deleteretire(int emp_number);
    
    public ArrayList<own_technical_content> gettech();
    public void inserttech(own_technical_content tech);
    public void updatetech(int emp_number, String tech_con_name);
    public void deletetech(int emp_number, String tech_con_name);
    
    public ArrayList<project> getproject();
    void insertproject(project project);
    void updateproject(int project_number);
    void deleteproject(int project_number);
    
    public ArrayList<join_project> getjoin_project();
    void insertjoin_project(join_project join_project);
    void updatejoin_project(int project_number, int emp_number);
    void deletejoin_project(int project_number, int emp_number);
    
    public ArrayList<role> getrole();
    void insertrole(role role);
    void updaterole(int role_number);
    void deleterole(int role_number);
}

