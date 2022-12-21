package entities;

import java.time.LocalDateTime;

public class CompanyPersonnelBuilder {
    protected String name;
    protected LocalDateTime dateOfBirth;
    protected int phoneNumber;
    protected Department department;
    protected String role;
    protected String email;

    public static CompanyPersonnelBuilder makeCPBuilder(){
        return new CompanyPersonnelBuilder();
    }
    public CompanyPersonnelBuilder buildName(String name){
        this.name = name;
        return this;
    }
    public CompanyPersonnelBuilder buildDateOfBirth(LocalDateTime dateOfBirth){
        this.dateOfBirth = dateOfBirth;
        return this;
    }
    public CompanyPersonnelBuilder buildPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
    public CompanyPersonnelBuilder buildDepartment(Department department){
        this.department = department;
        return this;
    }
    public CompanyPersonnelBuilder buildRole(String role){
        this.role = role;
        return this;
    }
    public CompanyPersonnelBuilder buildEmail(String email){
        this.email = email;
        return this;
    }
}
