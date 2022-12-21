package entities;

import java.util.Objects;

public class InterviewerManager extends EmployeeManager{
    public InterviewerManager(){
        super();
    }
    public void addInterviewer(Interviewer interviewer){
        this.allPersonnel.add(interviewer);
    }
    public void removeInterviewer(Interviewer interviewer){
        this.allPersonnel.remove(interviewer);
    }
    public void addInterview(String name, Recruitee recruitee){
        for (CompanyPersonnel interviewer : this.allPersonnel){
            if (Objects.equals(interviewer.name, name)){
                ((Interviewer) interviewer).recruiteeInterviews.add(recruitee);
            }
        }
    }
    public void removeInterview(String name, Recruitee recruitee){
        for (CompanyPersonnel interviewer : this.allPersonnel){
            if (Objects.equals(interviewer.name, name)){
                ((Interviewer) interviewer).recruiteeInterviews.remove(recruitee);
            }
        }
    }
}
