package entities;

import java.util.ArrayList;

public class DepartmentManager {
    private ArrayList<Department> departments;
    public ArrayList<Department> getDepartments(){
        return this.departments;
    }
    public void addDepartment(Department department){
        this.departments.add(department);
    }
    public void removeDepartment(Department department){
        this.departments.remove(department);
    }
}
