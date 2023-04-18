package components.customerService;

import components.mall.Contact;
import components.mall.Discount;
import components.mall.Person;
import java.util.Random;

public class Customer extends Person{


    private int giftToken;
    private int lowerLimit;


    public void setGiftToken(int token) {
        this.giftToken = token;
    }
    public static int customerCount = 400000;
    public Customer(int ID, Contact info,int giftToken) {
        super(ID, info);
        this.giftToken = giftToken;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public int getGiftToken() {
        return giftToken;
    }
    protected void setLowerLimit(int lowerLimit) {
        if(lowerLimit >= 0)
            this.lowerLimit = lowerLimit;
    }

    // TODO: displayDiscountInfo Method
    public void displayDiscountInfo() {
    	
    }
    
    
}

