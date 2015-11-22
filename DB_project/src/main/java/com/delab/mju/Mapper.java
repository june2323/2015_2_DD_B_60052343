package com.delab.mju;
import java.util.ArrayList;

import com.delab.mju.employee;
import com.delab.mju.positions;
import com.delab.mju.department;
 
public interface Mapper {
    ArrayList<employee> getemployee();
    void insertemployee(employee employee);
    void updateemployee(int emp_number);
    void deleteemployee(int emp_number);
    
    ArrayList<positions> getpositions();
    void insertpositions(positions positions);
    void updatepositions(int position_number);
    void deletepositions(int position_number);
    
    public ArrayList<department> getdepartment();
    public void insertdepartment(department department);
    public void updatedepartment(int dept_number);
    public void deletedepartment(int dept_number);
}
