package com.jhl.carcenterApp;

import com.jhl.carcenterApp.Controller.CarController;
import com.jhl.carcenterApp.model.Car;
import com.jhl.carcenterApp.model.CarModify;
import com.jhl.carcenterApp.model.Customer;
import com.jhl.carcenterApp.util.RandData;
import com.jhl.carcenterApp.view.Menu;

public class CarCenterMain {
	public static void main(String[] args) {
		Menu m = new Menu();								//다른 클래스에서 불러오기한거임!
		RandData rand = new RandData();						//다른 클래스에서 불러오기한거임!
		CarController con = new CarController();			//다른 클래스에서 불러오기한거임!
		
		
		while (true) {
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_ADD:
				System.out.println("고객정보 등록");
				while (true) {
					int menu = m.addSubMenu();
					if (menu == Menu.SUB_ADD_RAND) {
						System.out.println("자동 생성");
						con.addRandCusData(new Customer(rand.getName(), rand.getTel(), rand.getmCard(), 
								rand.getBirthday(), rand.getEmail(),
								new Car(rand.getModel(), rand.getYear()), new CarModify(rand.getCause(),
										rand.getDateIn(), rand.getDateOut(), rand.getPrice())));
					}
					else if (menu == Menu.SUB_ADD_INS) {
						System.out.println("수동 입력");
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
				System.out.println("관리자 모드");
				break;
			case Menu.MAIN_MENU_EXIT:
				System.out.println("### 프로그램 종료 ###");
				System.exit(0);
				break;

			}
		}

	}

}
