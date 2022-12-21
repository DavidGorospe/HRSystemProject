package entities;

import java.time.LocalDateTime;

public class Employee extends CompanyPersonnel{
    protected int hourlySalary;
    protected LocalDateTime shift;
    protected BankInformation bankInfo;


    public Employee(EmployeeBuilder eBuilder) {
        super(eBuilder);
        this.hourlySalary = eBuilder.hourlySalary;
        this.shift = eBuilder.shift;
        this.bankInfo = eBuilder.bankInfo;
    }
}
