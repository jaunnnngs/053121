package com.jhl.carcenterApp;

import com.jhl.carcenterApp.Controller.CarController;
import com.jhl.carcenterApp.model.Car;
import com.jhl.carcenterApp.model.CarModify;
import com.jhl.carcenterApp.model.Customer;
import com.jhl.carcenterApp.util.Admin;
import com.jhl.carcenterApp.util.RandData;
import com.jhl.carcenterApp.view.Menu;

public class CarCenterMain {
	public static void main(String[] args) {
		Menu m = new Menu(); // �ٸ� Ŭ�������� �ҷ������Ѱ���!
		RandData rand = new RandData(); // �ٸ� Ŭ�������� �ҷ������Ѱ���!
		CarController con = new CarController(); // �ٸ� Ŭ�������� �ҷ������Ѱ���!
		

		while (true) {
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_ADD:
				System.out.println("������ ���");
				while (true) {
					int menu = m.addSubMenu();
					if (menu == Menu.SUB_ADD_RAND) {
						System.out.println("�ڵ� ����");
						con.addRandCusData(m.getCount(), rand);
					} else if (menu == Menu.SUB_ADD_INS) {
						con.addCustData(m.addManualMenu());
						break;
					} else if (menu == Menu.SUB_ADD_EXIT) {
						break;
					}
				}
				break;
				
			case Menu.MAIN_MENU_VIEW:
				con.viewCustData();
				System.out.println();
				break;
				
			case Menu.MAIN_MENU_ADMIN:
				while (true) {
					String info[] = m.loginMenu();
					if (info[0].equals(Admin.ADMIN_ID)==false) {
						System.out.println("�߸��� ID�Դϴ�");
						continue;
					}
					else if (info[1].equals(Admin.ADMIN_PW)==false) {
						System.out.println("�߸��� PW�Դϴ�.");
						continue;
					}
					else
						break;
				}
				for(;;) {
					int menu = m.adminMenu();
					if(menu==1) {
						System.out.println("���� ���� �հ�");
					}
					else if(menu==2) {
						System.out.println("�������� ��������");
					}
					else if (menu==3) 
						break;
				}
				break;
				
			case Menu.MAIN_MENU_EXIT:
				System.out.println("### ���α׷� ���� ###");
				System.exit(0);
				break;

			}
		}

	}

}
