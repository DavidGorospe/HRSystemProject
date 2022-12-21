package entities;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    private ArrayList<String> departmentRoles;
    private Schedule departmentSchedule;

    public Schedule getDepartmentSchedule() {
        return this.departmentSchedule;
    }

    public String getDepartmentName(){
        return this.departmentName;
    }

    public ArrayList<String> getDepartmentRoles(){
        return this.departmentRoles;
    }
}
