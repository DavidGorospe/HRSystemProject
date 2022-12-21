package entities;

public class Recruitee extends CompanyPersonnel{
    protected Interviewer interviewer;
    protected String status;
    protected String comment;
    public Recruitee(RecruiteeBuilder rBuilder){
        super(rBuilder);
        this.interviewer = rBuilder.interviewer;
        this.status = rBuilder.status;
        this.comment = rBuilder.comment;
    }
}
