package components.mall;

import components.businessPartnerService.Contract;

public class Store {
	private Contract contractInfo;
	private boolean availability;
	private int area;
	private int rentPrice;
	private String location;
	private String storeID;
	public static int numberOfStores = 0;
	private String storeName;
	
	public Store(String storeID,int area, boolean availability, String storeName, int rentPrice) {
		contractInfo = null;
		this.availability = availability;
                this.area =area;
		this.storeName = storeName;
		this.rentPrice = rentPrice;
		this.availability = availability;
		this.storeID = storeID;
		numberOfStores++;
	}
	public Contract getContractInfo() {
		return contractInfo;
	}
	
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
		if (availability) {
			contractInfo = null;
			storeName = "";
		}
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getRentPrice() {
		return rentPrice;
	}
	public void setRentPrice(int rentPrice) {
		if (rentPrice < 0 ) return;
		this.rentPrice = rentPrice;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStoreID() {
	
		return storeID;
	}
	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	
	
}
