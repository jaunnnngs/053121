package com.jhl.carcenterApp;

import com.jhl.carcenterApp.Controller.CarController;
import com.jhl.carcenterApp.model.Car;
import com.jhl.carcenterApp.model.CarModify;
import com.jhl.carcenterApp.model.Customer;
import com.jhl.carcenterApp.util.RandData;
import com.jhl.carcenterApp.view.Menu;

public class CarCenterMain {
	public static void main(String[] args) {
		Menu m = new Menu();								//�ٸ� Ŭ�������� �ҷ������Ѱ���!
		RandData rand = new RandData();						//�ٸ� Ŭ�������� �ҷ������Ѱ���!
		CarController con = new CarController();			//�ٸ� Ŭ�������� �ҷ������Ѱ���!
		
		
		while (true) {
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_ADD:
				System.out.println("�������� ���");
				while (true) {
					int menu = m.addSubMenu();
					if (menu == Menu.SUB_ADD_RAND) {
						System.out.println("�ڵ� ����");
						con.addRandCusData(new Customer(rand.getName(), rand.getTel(), rand.getmCard(), 
								rand.getBirthday(), rand.getEmail(),
								new Car(rand.getModel(), rand.getYear()), new CarModify(rand.getCause(),
										rand.getDateIn(), rand.getDateOut(), rand.getPrice())));
					}
					else if (menu == Menu.SUB_ADD_INS) {
						System.out.println("���� �Է�");
					}
					else if (menu == Menu.SUB_ADD_EXIT) {
						break;
					}			
				}
				break;
			case Menu.MAIN_MENU_VIEW:
				con.viewCustData();
				break;
			case Menu.MAIN_MENU_ADMIN:
				System.out.println("������ ���");
				break;
			case Menu.MAIN_MENU_EXIT:
				System.out.println("### ���α׷� ���� ###");
				System.exit(0);
				break;

			}
		}

	}

}