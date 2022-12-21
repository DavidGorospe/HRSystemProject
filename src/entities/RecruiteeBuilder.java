package entities;

public class RecruiteeBuilder extends CompanyPersonnelBuilder{
    protected Interviewer interviewer;
    protected String status;
    protected String comment;
    public static RecruiteeBuilder makeRBuilder(){
        return new RecruiteeBuilder();
    }
    public RecruiteeBuilder buildInterviewer(Interviewer interviewer){
        this.interviewer = interviewer;
        return this;
    }
    public RecruiteeBuilder buildStatus(String status){
        this.status = status;
        return this;
    }
    public RecruiteeBuilder buildComment(String comment){
        this.comment = comment;
        return this;
    }
}
