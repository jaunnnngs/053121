package com.jhl.carcenterApp.Controller;

import java.util.ArrayList;

import com.jhl.carcenterApp.model.Car;
import com.jhl.carcenterApp.model.CarModify;
import com.jhl.carcenterApp.model.Customer;
import com.jhl.carcenterApp.util.Admin;
import com.jhl.carcenterApp.util.CommUtil;
import com.jhl.carcenterApp.util.RandData;
import com.jhl.carcenterApp.view.Menu;

public class CarController {
	Menu m;
	ArrayList<Customer> custList = new ArrayList<Customer>();

	public CarController(Menu m) {
		this.m = m;

	}

	public void addRandCusData(Customer cust) { // ��������
		custList.add(cust);
	}

	public void addRandCusData(int size, RandData rand) { // ��������
		for (int i = 0; i < size; i++) {
			custList.add(new Customer(rand.getName(), rand.getTel(), rand.getmCard(), rand.getBirthday(),
					rand.getEmail(), new Car(rand.getModel(), rand.getYear()),
					new CarModify(rand.getCause(), rand.getDateIn(), rand.getDateOut(), rand.getPrice(),rand.getFix())));
		}
	}

	public void addCustData(Customer cust) { // ��������
		custList.add(cust);
	}

	public void viewCustData() {
		for (int i = 0; i < custList.size(); i++) {
			System.out.println(custList.get(i).toString());
		}
	}

	public void doAddwork(Menu m, RandData rand) {
		while (true) {
			int menu = m.addSubMenu();
			if (menu == Menu.SUB_ADD_RAND) {
				System.out.println("�ڵ� ����");
				addRandCusData(m.getCount(), rand);
			} else if (menu == Menu.SUB_ADD_INS) {
				addCustData(m.addManualMenu());
				break;
			} else if (menu == Menu.SUB_ADD_EXIT) {
				break;
			}
		}
	}

	public void doAdminLogin(Menu m) {
		while (true) {
			String info[] = m.loginMenu();
			if (info[0].equals(Admin.ADMIN_ID) == false) {
				System.out.println("�߸��� ID�Դϴ�");
				continue;
			} else if (info[1].equals(Admin.ADMIN_PW) == false) {
				System.out.println("�߸��� PW�Դϴ�.");
				continue;
			} else
				break;
		}
	}

	public void doAdminWork(Menu m) {
		for (;;) { // ;;= infinite loop of 'For'
			int menu = m.adminMenu();
			if (menu == 1) {
				System.out.println("���� �����: " + dayOfSell());
				} 
			else if (menu == 2) {
				System.out.println("�������� ��������");
				} 
			else if (menu == 3)
				break;
		}
	}
	public String dayOfSell() {
		int sum = 0;
		for (int i = 0; i < custList.size(); i++) {
			sum += custList.get(i).getCarModify().getPrice();
		}
		return CommUtil.getKorMoney(sum);
	}
	
	public void showFixList() {
		//�̸�,��ȭ��ȣ,����,���ϷῩ��,������
		}
	}