package entities;

import java.util.ArrayList;

public class Interviewer extends Employee{
    protected ArrayList<Recruitee> recruiteeInterviews;
    public Interviewer(InterviewerBuilder iBuilder){
        super(iBuilder);
        this.recruiteeInterviews = iBuilder.recruiteeInterviews;
    }
}
