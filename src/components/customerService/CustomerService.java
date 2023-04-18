package components.customerService;

import components.mall.Contact;
import components.mall.Employee;
import components.mall.Mall;
import components.mall.Person;
import java.util.Random;

public class CustomerService extends Employee{

    public static int customerServiceCounter = 200000;
	public CustomerService() {
    }

    // TODO: defineGiftToken
    public static boolean defineGiftToken(int id) {

        return false;
    }
    // TODO: addCustomer
  public void addCustomer(Customer tempCu){
      Customer temp = customerSearch(tempCu.getInfo().getPhoneNumber());
      if (temp != null) return;
      Customer.customerCount++;
      Mall.getCustomers().add(tempCu);
        
    }
    // TODO: deleteCustomer
    public Customer deleteCustomer(int ID){
            Customer temp = null;
            for (Customer element : Mall.getCustomers()){
                if (element.getID() == ID){
                    temp = element;
                    break;
                }
            }
            Mall.getCustomers().remove(temp);
            return null;
    }
    public int idGenerator() {
       
        Random rnd = new Random();
        while (true){
             int id =400000 + rnd.nextInt(99999);
             Customer c = customerSearch(id);
             if (c!= null) continue;
             else return id;
             
        }
    }
}

