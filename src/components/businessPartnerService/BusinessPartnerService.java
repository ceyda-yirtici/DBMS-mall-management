package components.businessPartnerService;

import components.customerService.Customer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import components.mall.Contact;
import components.mall.Employee;
import components.mall.Mall;
import components.mall.Store;
import components.mall.*;
import java.util.Random;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BusinessPartnerService extends Employee{
	
	
	public static int BPServiceCounter = 27700000;

   
	public BusinessPartnerService() {
		super();
	}
	
	public BusinessPartner addBusinessPartner(String name, String phoneNumber, String address, String email) {
        BusinessPartner bp = businessPartnerSearch(name);
        if(bp != null) return null;
        BusinessPartner tempBP = new BusinessPartner();
        tempBP.setName(name);
        tempBP.setPhoneNumber(phoneNumber);
        tempBP.setAddress(address);
        tempBP.setEmail(email);
        Mall.getBusinessPartners().add(tempBP);
        return tempBP;
    }
    public Contract addContract(Contract newC) {
        Store store = storeSearch(newC.getStore());
        System.out.print(newC.getStore());
        if(store == null) return null;
        System.out.print(store.isAvailability());
        if(!store.isAvailability()) return null;
        
        BusinessPartner bp = businessPartnerSearch(newC.getCompany());
        System.out.print(3);
        if(bp == null) return null; 
            store.setAvailability(false);
            store.setRentPrice(newC.getMonthlyPrice());
            store.setStoreName(newC.getCompany());
            
        Mall.getMall().fileReadingStore();
        
        Mall.getContracts().add(newC);
        return newC;
    }
  public Contract deleteContract(Contract newC) {
        Store store = storeSearch(newC.getStore());
         store.setAvailability(true);
        store.setStoreName("-");
        Mall.getMall().fileReadingStore();
        Mall.getContracts().remove(newC);
        return newC;
    }
    public BusinessPartner deleteBusinessPartner(String name) {
        BusinessPartner tempBP = null;
        for (BusinessPartner bp: Mall.getBusinessPartners()) {
            if(bp.getName().equalsIgnoreCase(name)) {
                tempBP = bp;
                break;
            }
        }
        if( tempBP != null) Mall.getBusinessPartners().remove(tempBP);
        return tempBP;
    }
}
