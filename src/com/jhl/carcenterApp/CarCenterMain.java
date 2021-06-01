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
		Menu m = new Menu(); // 다른 클래스에서 불러오기한거임!
		RandData rand = new RandData(); // 다른 클래스에서 불러오기한거임!
		CarController con = new CarController(); // 다른 클래스에서 불러오기한거임!
		

		while (true) {
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_ADD:
				System.out.println("고객정보 등록");
				while (true) {
					int menu = m.addSubMenu();
					if (menu == Menu.SUB_ADD_RAND) {
						System.out.println("자동 생성");
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
						System.out.println("잘못된 ID입니다");
						continue;
					}
					else if (info[1].equals(Admin.ADMIN_PW)==false) {
						System.out.println("잘못된 PW입니다.");
						continue;
					}
					else
						break;
				}
				for(;;) {
					int menu = m.adminMenu();
					if(menu==1) {
						System.out.println("일일 매출 합계");
					}
					else if(menu==2) {
						System.out.println("차량수리 내역보기");
					}
					else if (menu==3) 
						break;
				}
				break;
				
			case Menu.MAIN_MENU_EXIT:
				System.out.println("### 프로그램 종료 ###");
				System.exit(0);
				break;

			}
		}

	}

}
