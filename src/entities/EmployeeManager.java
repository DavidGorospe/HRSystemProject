package entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class EmployeeManager extends CompanyPersonnelManager{
    public EmployeeManager(){
        super();
    }
    public boolean changeRole(String name, String role){
        for (CompanyPersonnel employee: this.allPersonnel){
            if (Objects.equals(name, employee.name)){
                employee.role = role;
                return true;
            }
        }
        return false;
    }
    public boolean changeDepartment(String name, Department department){
        for (CompanyPersonnel employee: this.allPersonnel){
            if (Objects.equals(name, employee.name)){
                employee.department = department;
                return true;
            }
        }
        return false;
    }
    public boolean changeHourlySalary(String name, int hourlySalary){
        for (CompanyPersonnel employee: this.allPersonnel){
            if (Objects.equals(name, employee.name)){
                ((Employee) employee).hourlySalary = hourlySalary;
                return true;
            }
        }
        return false;
    }
    public boolean changeBankInfo(String name, BankInformation bankInfo){
        for (CompanyPersonnel employee: this.allPersonnel){
            if (Objects.equals(name, employee.name)){
                ((Employee) employee).bankInfo = bankInfo;
                return true;
            }
        }
        return false;
    }
    public boolean changeShift(String name, LocalDateTime shift){
        for (CompanyPersonnel employee: this.allPersonnel){
            if (Objects.equals(name, employee.name)){
                ((Employee) employee).shift = shift;
                return true;
            }
        }
        return false;
    }
    public boolean changePhoneNumber(String name, int phoneNumber){
        for (CompanyPersonnel employee: this.allPersonnel){
            if (Objects.equals(name, employee.name)){
                ((Employee) employee).phoneNumber = phoneNumber;
                return true;
            }
        }
        return false;
    }
    public boolean changeEmail(String name, String email){
        for (CompanyPersonnel employee: this.allPersonnel){
            if (Objects.equals(name, employee.name)){
                ((Employee) employee).email = email;
                return true;
            }
        }
        return false;
    }
}
