package com.jhl.carcenterApp.util;

import java.text.DecimalFormat;

public class CommUtil {
	public static String getKorMoney(int money) {
		DecimalFormat dc = new DecimalFormat("###,###,###,###");
		return "£Ü" + dc.format(money)+"¿ø";
	}
	
}
