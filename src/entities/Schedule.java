package entities;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Schedule {
    private HashMap<LocalDateTime, Integer> schedule;
    public Schedule(HashMap<LocalDateTime, Integer> schedule){
        this.schedule = schedule;
    }

    public HashMap<LocalDateTime, Integer> getSchedule(){
        return this.schedule;
    }

    public void addSchedule(LocalDateTime shift, int numShifts){
        this.schedule.put(shift, numShifts);
    }

    public void removeSchedule(LocalDateTime shift){
        this.schedule.remove(shift);
    }

    public boolean checkAvailability(LocalDateTime shift){
        return this.schedule.containsKey(shift) && this.schedule.get(shift) < 5;
    }
}
