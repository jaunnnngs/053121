package com.jhl.carcenterApp.Controller;

import java.util.ArrayList;

import com.jhl.carcenterApp.model.Customer;

public class CarController {
	ArrayList<Customer> custList =
			new ArrayList<Customer>();
	
	public void addRandCusData(Customer cust) { //罚待积己
		custList.add(cust);
	}
	
	public void addCustData(Customer cust) {					//荐悼积己
		custList.add(cust);
	}
	
	public void viewCustData() {
		for(int i=0; i<custList.size(); i++) {
			System.out.println(custList.get(i).toString());
		}
	}
}
