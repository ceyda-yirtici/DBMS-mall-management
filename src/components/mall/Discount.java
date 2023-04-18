package components.mall;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Discount {

    private final Date startDate;
    private Date endDate;
    private int discountAmount = 0;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

    public Discount(String startDate, int daysForDiscount, int lowerLimit) throws ParseException {
        this.startDate = dateFormat.parse(startDate);
        Calendar c = Calendar.getInstance();
        c.setTime(this.startDate);
        c.add(Calendar.DATE, daysForDiscount);
        this.endDate = c.getTime();
        this.discountAmount = calculateDiscountAmount(lowerLimit);
    }

    public Date getStartDate() {
        return startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) throws ParseException {
        this.endDate = dateFormat.parse(endDate);
    }
    public int calculateDiscountAmount(int lowerLimit){
        int discountPercentage = 20;
        int discountAmount = (lowerLimit * discountPercentage) / 100;
        lowerLimit = 0;
        return discountAmount;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }
}
