package com.jhl.carcenterApp.model;

public class CarModify {
	private String cause;	// Cause
	private int dateIn;	// 입고날짜
	private int dateOut;	// 출고 날짜
	private int price;		// 가격
	
	
	
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public int getDateIn() {
		return dateIn;
	}
	public void setDateIn(int dateIn) {
		this.dateIn = dateIn;
	}
	public int getDateOut() {
		return dateOut;
	}
	public void setDateOut(int dateOut) {
		this.dateOut = dateOut;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public CarModify(String cause, int dateIn, int dateOut, int price) {
		super();
		this.cause = cause;
		this.dateIn = dateIn;
		this.dateOut = dateOut;
		this.price = price;
	}
	@Override
	public String toString() {
		String str = "수리내역: " + cause + "\n";
		str += "접수날짜: " + dateIn + "\n";
		str += "수리완료날짜: " + dateOut + "\n";
		str += "수리비: " + price + "\n";
		return str;
		
	}
	
	
	
}
