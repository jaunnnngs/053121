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
		System.out.println("ī���� ���� ���α׷� v1.0");
		System.out.println("---------------------------");
		System.out.println("1. ���������");
		System.out.println("2. ����������");
		System.out.println("3. ������ ���");
		System.out.println("4. ���α׷� ����");
		System.out.println("---------------------------");
		System.out.println("���� �޴� ����:");
		return s.nextInt();
	}

	public int addSubMenu() {
		System.out.println("---------------------------");
		System.out.println("### ��������� ȭ�� ###");
		System.out.println("---------------------------");
		System.out.println("1. ������ �ڵ�����");
		System.out.println("2. ������ ��������");
		System.out.println("3. ���θ޴� �̵�");
		System.out.println("---------------------------");
		System.out.println("���� �޴� ����:");
		return s.nextInt();
	}

}
