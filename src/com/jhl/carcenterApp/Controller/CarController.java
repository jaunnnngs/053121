package com.jhl.carcenterApp.Controller;

import java.util.ArrayList;

import com.jhl.carcenterApp.model.Car;
import com.jhl.carcenterApp.model.CarModify;
import com.jhl.carcenterApp.model.Customer;
import com.jhl.carcenterApp.util.RandData;

public class CarController {
	// ���׸� + �÷���
	ArrayList<Customer> custList =
			new ArrayList<Customer>();
	
	public void addRandCusData(Customer cust) { //��������
		custList.add(cust);
	}
	
	public void addRandCusData(int size, RandData rand) { //��������
		for (int i=0; i<size; i++) {
		custList.add(new Customer(rand.getName(), rand.getTel(), rand.getmCard(),
				rand.getBirthday(), rand.getEmail(), new Car(rand.getModel(), rand.getYear()),
				new CarModify(rand.getCause(), rand.getDateIn(), rand.getDateOut(), rand.getPrice())));}
	}
	
	public void addCustData(Customer cust) {	//��������
		custList.add(cust);
	}
	
	public void viewCustData() {
		for(int i=0; i<custList.size(); i++) {
			System.out.println(custList.get(i).toString());
		}
	}
}
