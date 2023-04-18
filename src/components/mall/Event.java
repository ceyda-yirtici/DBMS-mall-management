
package components.mall;
import java.text.SimpleDateFormat;
import java.util.*;
public class Event {
    private String startDate;
    private String endDate;
    private String prize;
    private static int IDCounter= 0;

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Event() {

    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private int ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();  
    ArrayList <String> prizes = new ArrayList<>();
    static ArrayList <Event> events = new ArrayList<>();

    public String getStartDate() {
        return startDate;
    }
    public Event(String Name,int ID, String startDate, String endDate, String prize) {
        super();
        IDCounter++;
        this.name = Name;
        this.ID = ID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.prize = prize;
    }
    public Event(String Name, String startDate, String endDate, String prize) {
        super();
        IDCounter++;
        this.name = Name;
        this.ID = IDCounter;
        this.startDate = startDate;
        this.endDate = endDate;
        this.prize = prize;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String newDate) {
        this.endDate = newDate;
    }
    public String getPrize() {
        return prize;
    }

    
}
