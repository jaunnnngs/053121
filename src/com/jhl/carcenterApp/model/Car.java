package com.jhl.carcenterApp.model;

public class Car {
	private String model; 	// 차 종류
	private int year; 	// 차 연식
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}
	@Override
	public String toString() {
		String str = "수리차량: " + model + "\n";
		str += "연식: " + year + "\n";
		return super.toString();
	}
	
	
	
}
