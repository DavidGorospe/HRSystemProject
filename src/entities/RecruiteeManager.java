package entities;

import java.util.Objects;

public class RecruiteeManager extends CompanyPersonnelManager{
    public RecruiteeManager(){
        super();
    }
    public void setStatus(String name, String status){
        for (CompanyPersonnel recruitee : this.allPersonnel){
            if (Objects.equals(recruitee.name, name)){
                ((Recruitee) recruitee).status = status;
            }
        }
    }
}
