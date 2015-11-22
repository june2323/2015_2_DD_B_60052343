package com.delab.mju;

import java.util.ArrayList;

public interface DAO {
 
    public ArrayList<employee> getemployee();
    public void insertemployee(employee employee);
    public void updateemployee(int emp_number);
    public void deleteemployee(int emp_number);
    
    public ArrayList<positions> getpositions();
    public void insertpositions(positions positions);
    public void updatepositions(int position_number);
    public void deletepositions(int position_number);
    
    public ArrayList<department> getdepartment();
    public void insertdepartment(department department);
    public void updatedepartment(int dept_number);
    public void deletedepartment(int dept_number);
 
}
