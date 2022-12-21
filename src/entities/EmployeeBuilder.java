package entities;

import java.time.LocalDateTime;

public class EmployeeBuilder extends CompanyPersonnelBuilder{
    protected int hourlySalary;
    protected LocalDateTime shift;
    protected BankInformation bankInfo;

    public static EmployeeBuilder makeEbuilder(){
        return new EmployeeBuilder();
    }
    public EmployeeBuilder buildHourlySalary(int hourlySalary){
        this.hourlySalary = hourlySalary;
        return this;
    }
    public EmployeeBuilder buildShift(LocalDateTime shift){
        this.shift = shift;
        return this;
    }
    public EmployeeBuilder buildBankInfo(BankInformation bankInfo){
        this.bankInfo = bankInfo;
        return this;
    }

}
