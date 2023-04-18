package components.mall;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import com.opencsv.CSVWriter;
import components.businessPartnerService.BusinessPartner;
import components.businessPartnerService.Contract;
import components.customerService.Customer;
import components.businessPartnerService.BusinessPartnerService;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import components.customerService.CustomerService;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Mall {
    private static final File file = null;
    private static Mall mallInstance;
    private static ArrayList <Employee> employees= new ArrayList<>();
    private static ArrayList <Store> stores = new ArrayList<>();
    private static ArrayList <Customer> customers = new ArrayList<>();
    private static ArrayList <String> prizes = new ArrayList<>();
    private static ArrayList <Event> events = new ArrayList<Event>();
    private static ArrayList <BusinessPartner> businessPartners= new ArrayList<>();
    private static ArrayList <Contract> contracts = new ArrayList<>();
    private static HashMap<String,String> userValidation = new HashMap<>();
    private static CustomerService cs= new CustomerService();
    private static BusinessPartnerService bp = new BusinessPartnerService();
    private static AdministrationEmployee ae = new AdministrationEmployee();

    public static AdministrationEmployee getAe() {
        return ae;
    }
    public static CustomerService getCs() {
        return cs;
    }

    public static BusinessPartnerService getBp() {
        return bp;
    }
    private static boolean isCreated = false;
    public static final DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
    
    
    private Mall()  {
                readUserIDsAndPasswords();
                readEmployee();
                readCustomer();
                readContract();
                readEvent();
                readStore();
                readCompanies();
                
        
	}
     public static Mall getMall() {
        if(!isCreated){
            isCreated = true;
            return mallInstance = new Mall();
        }
        return mallInstance;
    }
        public static boolean userValidation(String username, String password) {
            if(userValidation.containsKey(username)){
                if(userValidation.get(username).equals(password)){
                    return true;
                }
            }
            return false;
    }

        public static void readEmployee(){
             File fileInput = new File("employees.csv");
            Scanner s = null;
        try {
            s = new Scanner(fileInput);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mall.class.getName()).log(Level.SEVERE, null, ex);
        }
            while(s.hasNextLine()){
                String line = s.nextLine();
                String[] split = line.split(",");
                Contact contact = new Contact(split[1],split[2],split[3],split[4],split[5]);
                Employee employee = new Employee(Integer.parseInt(split[0]),contact);
                employees.add(employee);
            }
            s.close();
        }
public static void readUserIDsAndPasswords(){
            File fileInput = new File("validation.csv");
            Scanner s = null;
            try {
            s = new Scanner(fileInput);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mall.class.getName()).log(Level.SEVERE, null, ex);
        }
                while(s.hasNextLine()){
                    String line = s.nextLine();
                    String[] split = line.split(",");
                    userValidation.put(split[0], split[1]);
                }

        s.close();
    }
        public static void readCustomer() {
            File fileInput = new File("customers.csv");
            Scanner s = null;
        try {
            s = new Scanner(fileInput);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mall.class.getName()).log(Level.SEVERE, null, ex);
        }
             while(s.hasNextLine()){
                String line = s.nextLine();
                String[] split = line.split(",");
                Contact contact = new Contact(split[1],split[2],split[3],split[4],split[5]);
                Customer customer = new Customer(Integer.parseInt(split[0]),contact,Integer.parseInt(split[6]));
                cs.addCustomer(customer);
             }
            s.close();
        }
        
        public static void readContract() {
            File fileInput = new File("contracts.csv");
            Scanner s = null;
        try {
            s = new Scanner(fileInput);
            s.useLocale(Locale.ENGLISH);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mall.class.getName()).log(Level.SEVERE, null, ex);
        }
             while(s.hasNextLine()){
                String line = s.nextLine();
                String[] split = line.split(",");
                Contract contract = new Contract(split[0],split[1],Integer.parseInt(split[2]),split[3],split[4]);
                contracts.add(contract);
                
             }
             s.close();
        }

	public static void readEvent() {
		File fileInput = new File("events.csv");
            Scanner s = null;
        try {
            s = new Scanner(fileInput);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mall.class.getName()).log(Level.SEVERE, null, ex);
        }
            while(s.hasNextLine()){
                String line = s.nextLine();
                String[] split = line.split(",");
                Event event = new Event(split[0], Integer.parseInt(split[1]), split[2],split[3],split[4]);
                events.add(event);
            
        }
            s.close();
	}

	public static void readStore()  {

                Scanner sc = null;
        try {
            sc = new Scanner(new File("stores.csv"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mall.class.getName()).log(Level.SEVERE, null, ex);
        }
                while(sc.hasNextLine()){
                String[] splitted = sc.nextLine().split(",");
                boolean availability = Boolean.parseBoolean(splitted[2]);
                Store store = new Store(splitted[0],Integer.parseInt(splitted[1]),availability,splitted[3],Integer.parseInt(splitted[4]));
                stores.add(store);
            }
                sc.close();
	}

	public static void readCompanies()  {
		File fileInput = new File("companies.csv");
        Scanner s = null;
        try {
            s = new Scanner(fileInput);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mall.class.getName()).log(Level.SEVERE, null, ex);
        }
            while(s.hasNextLine()){
                String line = s.nextLine();
                String[] split = line.split(",");
                bp.addBusinessPartner(split[0],split[1],split[3],split[2]);
            }
               s.close();
	}



public static ArrayList<Employee> getEmployees() {
		return employees;
	}



	public static void setEmployees(ArrayList<Employee> employees) {
		Mall.employees = employees;
	}


	public static ArrayList<Store> getStores() {
		return stores;
	}



	public static void setStores(ArrayList<Store> stores) {
		Mall.stores = stores;
	}



	public static ArrayList<Customer> getCustomers() {
		return customers;
	}



	public static void setCustomers(ArrayList<Customer> customers) {
		Mall.customers = customers;
	}



	public static ArrayList<String> getPrizes() {
		return prizes;
	}



	public static void setPrizes(ArrayList<String> prizes) {
		Mall.prizes = prizes;
	}



	public static ArrayList<Event> getEvents() {
		return events;
	}



	public static void setEvents(ArrayList<Event> events) {
		Mall.events = events;
	}



	public static ArrayList<BusinessPartner> getBusinessPartners() {
		return businessPartners;
	}



	public static void setBusinessPartners(ArrayList<BusinessPartner> businessPartners) {
		Mall.businessPartners= businessPartners;
	}



	public static ArrayList<Contract> getContracts() {
		return contracts;
	}



	public static void setContracts(ArrayList<Contract> contracts) {
		Mall.contracts = contracts;
	}



	public static File getFile() {
		return file;
	}
    public List<String[]> dataLines = new ArrayList<>();
    
        public void fileReadingEvent()  {
        dataLines = new ArrayList<>();
        for(int i = 0;i<Mall.getEvents().size();i++){
            dataLines.add(new String[]{Mall.getEvents().get(i).getName(),
                String.valueOf(Mall.getEvents().get(i).getID()),
                dateFormat.format(Mall.getEvents().get(i).getStartDate()),
                dateFormat.format(Mall.getEvents().get(i).getEndDate()),
                String.valueOf(Mall.getEvents().get(i).getPrize())});
        }
       
		givenDataArray_whenConvertToCSV_thenOutputCreated("events.csv") ;
        }
      public void fileReadingStore()   {
        dataLines = new ArrayList<>();
	for(int i = 0;i<Mall.getStores().size();i++){
            dataLines.add(new String[]{Mall.getStores().get(i).getStoreID(),
                String.valueOf(Mall.getStores().get(i).getArea()),
                String.valueOf(Mall.getStores().get(i).isAvailability())
                    ,Mall.getStores().get(i).getStoreName(),
                    String.valueOf(Mall.getStores().get(i).getRentPrice())});
        }
		givenDataArray_whenConvertToCSV_thenOutputCreated("stores.csv") ;
	}
      public  void fileReadingCustomer()  {
        dataLines = new ArrayList<>();
        for(int i = 0;i<Mall.getCustomers().size();i++){
            dataLines.add(new String[] {String.valueOf(Mall.getCustomers().get(i).getID()),Mall.getCustomers().get(i).getInfo().getName()
                ,Mall.getCustomers().get(i).getInfo().getSurname(),Mall.getCustomers().get(i).getInfo().getPhoneNumber(),
                Mall.getCustomers().get(i).getInfo().getEmail(),   Mall.getCustomers().get(i).getInfo().getAddress(),
                String.valueOf(Mall.getCustomers().get(i).getGiftToken())});
        }
		givenDataArray_whenConvertToCSV_thenOutputCreated("customers.csv") ;
	}
      public void fileReadingEmployee()  {
        dataLines = new ArrayList<>();
                for(int i = 0;i<Mall.getEmployees().size();i++){
                    dataLines.add(new String[] {String.valueOf(Mall.getEmployees().get(i).getID()),
                        Mall.getEmployees().get(i).getInfo().getName()
                            ,Mall.getEmployees().get(i).getInfo().getSurname()
                            ,Mall.getEmployees().get(i).getInfo().getPhoneNumber()
                            ,Mall.getEmployees().get(i).getInfo().getEmail(),
                            Mall.getEmployees().get(i).getInfo().getAddress()});
                }
		givenDataArray_whenConvertToCSV_thenOutputCreated("employees.csv") ;
	}
      public void fileReadingContract() {
        dataLines = new ArrayList<>();
	for(int i = 0;i<Mall.getContracts().size();i++){
            dataLines.add(new String[]{Mall.getContracts().get(i).getStore(),
                Mall.getContracts().get(i).getCompany(),
                String.valueOf(Mall.getContracts().get(i).getMonthlyPrice()),
                Mall.getContracts().get(i).getStartDate(),
                Mall.getContracts().get(i).getEndDate()});
        }
		givenDataArray_whenConvertToCSV_thenOutputCreated("contracts.csv") ;
	}
      public void fileReadingCompanies() {
        dataLines = new ArrayList<>();
	for(int i = 0;i<Mall.getBusinessPartners().size();i++){
            dataLines.add(new String[]{Mall.getBusinessPartners().get(i).getName()
                    ,Mall.getBusinessPartners().get(i).getPhoneNumber(),
                    Mall.getBusinessPartners().get(i).getEmail(),
                    Mall.getBusinessPartners().get(i).getAddress()});
        }
		givenDataArray_whenConvertToCSV_thenOutputCreated("companies.csv") ;
	}

	  public void givenDataArray_whenConvertToCSV_thenOutputCreated(String csv) {
        try {
            File file = new File(csv);
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile,  ',',   CSVWriter.NO_QUOTE_CHARACTER,
                                         CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                         CSVWriter.DEFAULT_LINE_END);
            writer.writeAll(dataLines);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Mall.class.getName()).log(Level.SEVERE, null, ex);}
        }
        
        
        
        
        
	
}



