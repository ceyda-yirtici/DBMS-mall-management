package components.businessPartnerService;

import java.util.Date;

public class Contract {
	
	 private String startDate;
	 private String endDate;
	 private int monthlyPrice;
	 private String store;
	 private String company;
         
	 public Contract(String store,String company,int monthlyPrice,String startDate, String endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.monthlyPrice = monthlyPrice;
		this.store = store;
		this.company = company;
	}

	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getMonthlyPrice() {
		return monthlyPrice;
	}
	public void setMonthlyPrice(int montlyPrice) {
		this.monthlyPrice = montlyPrice;
	}

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setCompany(String company) {
        this.company = company;
    }
        
	public String getStore() {
		return store;
	}
	public String getCompany() {
		return company;
	}
	
	public void displayContract() {
		System.out.println("");
	}
}
