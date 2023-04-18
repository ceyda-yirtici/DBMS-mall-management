package components.mall;

import components.businessPartnerService.BusinessPartner;
import components.businessPartnerService.Contract;
import components.customerService.Customer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Employee extends Person{

	
	private String password;
        private  ArrayList <Todo> todoList = new ArrayList<>();

	public Employee(int ID, Contact info) {
        super(ID, info);
    }
        public Employee(){
            super();
        }
public  ArrayList<Todo> getTodo() {
		return todoList;
	}
public Employee employeeSearch(int id){
        for (Employee element : Mall.getEmployees()){
            if(element.getID() == id){
                return element;
            }
        }
        return null;
    }

    // TODO: customerSearch Method 1
    public Customer customerSearch(String name, String surname){
    	for (Customer element : Mall.getCustomers()){
    		Contact info = element.getInfo();
            if (info.getName().equalsIgnoreCase(name) && info.getSurname().equalsIgnoreCase(surname)){
                  return element;
            }
         }
        return null;
    }

    // TODO: customerSearch Method 2
    public Customer customerSearch(String phoneNumber){
    	for (Customer element : Mall.getCustomers()){
            if (element.getInfo().getPhoneNumber().equalsIgnoreCase(phoneNumber)){
                  return element;
            }
         }
        return null;
    }
    
    public Customer customerSearch(int id){
    	for (Customer element : Mall.getCustomers()){
            if (element.getID() == id){
                  return element;
            }
         }
        return null;
    }
 public static String dateToString(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");  
        String strDate = dateFormat.format(date);  
    	return strDate;
    }
    // TODO: businessPartnerSearch Method
    public BusinessPartner businessPartnerSearch(String companyName){
    	for (BusinessPartner element : Mall.getBusinessPartners()){
            if (element.getName().equalsIgnoreCase(companyName)){
                  return element;
            }
         }
        return null;
    }
    public Event eventSearch(int id) {
        for (Event element : Mall.getEvents()){
            if (element.getID() == id){
                  return element;
            }
         }
        return null;
    }
    public Contract contractSearch(String storeID) {
        for (Contract element : Mall.getContracts()){
            if (element.getStore().equals(storeID)){
                  return element;
            }
         }
        return null;
    }
    public static Date stringToDate(String date){
        Date newDate = null;
        SimpleDateFormat format = new SimpleDateFormat("mm-dd-yyyy",Locale.ENGLISH);
        try {
            newDate = format.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
                return newDate;
    }

    // TODO: businessPartnerSearch Method
    public Store storeSearch(String name){
    	for (Store element : Mall.getStores()){
            if (element.getStoreID().equalsIgnoreCase(name)){
                  return element;
            }
         }
        return null;
    }
    

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
