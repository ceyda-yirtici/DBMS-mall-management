package components.mall;

import components.businessPartnerService.BusinessPartnerService;
import components.customerService.CustomerService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AdministrationEmployee extends Employee {
	
	public static int AdministrationCounter = 23600000;
public AdministrationEmployee(int ID, Contact info) {
		super(ID, info);
		// TODO Auto-generated constructor stub
	}
public AdministrationEmployee(){
    
}
public Employee addEmployee(int department, Contact newEmployee) {
        Employee e = new Employee(idGenerator(department), newEmployee);
	Mall.getEmployees().add(e);
        return e;
}
public int idGenerator(int department) {

        Random rnd = new Random();
        while (true){
             int id =department + rnd.nextInt(99999);
             Employee c = employeeSearch(id);
             if (c!= null) continue;
             else return id;

        }
    }
public int idGeneratorEvent() {

        Random rnd = new Random();
        while (true){
             int id =rnd.nextInt(100);
             Event c = eventSearch(id);
             if (c!= null) continue;
             else return id;

        }
}
public Employee deleteEmployee(int ID) {
	Employee temp = null;
            for (Employee element : Mall.getEmployees()){
                if (element.getID() == ID){
                    temp = element;
                    break;
                }
            }
            Mall.getEmployees().remove(temp);
            return null;
}
public Event deleteEvent(int ID) {
	Event temp = null;
            for (Event element : Mall.getEvents()){
                if (element.getID() == ID){
                    temp = element;
                    break;
                }
            }
            Mall.getEvents().remove(temp);
            return null;
}
public Event makeEvent(String name, String StartDate, String EndDate, String Prize) {
    
	Event evt = new Event(name,idGeneratorEvent(),StartDate,EndDate,Prize);
        Mall.getEvents().add(evt);
	return evt;
}

    
}

