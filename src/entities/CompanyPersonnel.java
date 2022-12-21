package entities;

import java.time.LocalDateTime;

public class CompanyPersonnel {
    protected String name;
    protected LocalDateTime dateOfBirth;
    protected int phoneNumber;
    protected Department department;
    protected String role;
    protected String email;

    public CompanyPersonnel(CompanyPersonnelBuilder builder){
        this.name = builder.name;
        this.dateOfBirth = builder.dateOfBirth;
        this.phoneNumber = builder.phoneNumber;
        this.department = builder.department;
        this.role = builder.role;
        this.email = builder.email;
    }

}
