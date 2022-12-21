package entities;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Objects;

public class CompanyPersonnelManager {
    protected ArrayList<CompanyPersonnel> allPersonnel;
    public CompanyPersonnelManager(){
        this.allPersonnel = new ArrayList<CompanyPersonnel>();
    }
    public ArrayList<CompanyPersonnel> getAllPersonnel(){
        return this.allPersonnel;
    }
    public void addPersonnel(CompanyPersonnel personnel){
        this.allPersonnel.add(personnel);
    }
    public void removePersonnel(CompanyPersonnel personnel){
        this.allPersonnel.remove(personnel);
    }
    public CompanyPersonnel getPersonnel(String name){
        for (CompanyPersonnel personnel: this.allPersonnel){
            if (Objects.equals(personnel.name, name)){
                return personnel;
            }

        }
        return null;

    }
}
