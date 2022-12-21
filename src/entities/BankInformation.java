package entities;

public class BankInformation {
    private final String nameInstitution;
    private final int bankAccountNum;
    private final int bankTransitNum;
    private final int companyBankAccountNum;


    public BankInformation(String nameInstitution, int bankAccountNum, int bankTransitNum, int companyBankAccountNum) {
        this.nameInstitution = nameInstitution;
        this.bankAccountNum = bankAccountNum;
        this.bankTransitNum = bankTransitNum;
        this.companyBankAccountNum = companyBankAccountNum;
    }
}
