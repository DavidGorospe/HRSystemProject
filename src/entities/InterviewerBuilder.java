package entities;

import java.util.ArrayList;

public class InterviewerBuilder extends EmployeeBuilder{
    protected ArrayList<Recruitee> recruiteeInterviews;
    public static InterviewerBuilder makeIBuilder(){
        return new InterviewerBuilder();
    }
    public InterviewerBuilder buildRecruiteeInterviews(ArrayList<Recruitee> recruiteeInterviews){
        this.recruiteeInterviews = recruiteeInterviews;
        return this;
    }
}
