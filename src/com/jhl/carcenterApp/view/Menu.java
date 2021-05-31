package com.jhl.carcenterApp.view;

import java.util.Scanner;

public class Menu {
	public static final int MAIN_MENU_ADD = 1;
	public static final int MAIN_MENU_VIEW = 2;
	public static final int MAIN_MENU_ADMIN = 3;
	public static final int MAIN_MENU_EXIT = 4;
	
	public static final int SUB_ADD_RAND = 1;
	public static final int SUB_ADD_INS = 2;
	public static final int SUB_ADD_EXIT = 3;
	
	Scanner s = new Scanner(System.in);

	public int mainMenu() {
		System.out.println("---------------------------");
		System.out.println("카센터 관리 프로그램 v1.0");
		System.out.println("---------------------------");
		System.out.println("1. 고객정보등록");
		System.out.println("2. 고객정보보기");
		System.out.println("3. 관리자 모드");
		System.out.println("4. 프로그램 종료");
		System.out.println("---------------------------");
		System.out.println("메인 메뉴 선택:");
		return s.nextInt();
	}

	public int addSubMenu() {
		System.out.println("---------------------------");
		System.out.println("### 고객등록정보 화면 ###");
		System.out.println("---------------------------");
		System.out.println("1. 고객정보 자동생성");
		System.out.println("2. 고객정보 수동생성");
		System.out.println("3. 메인메뉴 이동");
		System.out.println("---------------------------");
		System.out.println("메인 메뉴 선택:");
		return s.nextInt();
	}

}
