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
		Menu m = new Menu(); 						// 다른 클래스에서 불러오기한거임!
		RandData rand = new RandData(); 			// 다른 클래스에서 불러오기한거임!
		CarController con = new CarController(m);	// 다른 클래스에서 불러오기한거임!
		

		while (true) {
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_ADD:
				con.doAddwork(m, rand);
				break;
				
			case Menu.MAIN_MENU_VIEW:
				con.viewCustData();
				System.out.println();
				break;
				
			case Menu.MAIN_MENU_ADMIN:
				con.doAdminLogin(m);
				con.doAdminWork(m);
				break;
				
			case Menu.MAIN_MENU_EXIT:
				System.out.println("### 프로그램 종료 ###");
				System.exit(0);
				break;

			}
		}
	}
}
