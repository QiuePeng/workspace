package com.paul.wh4;
import java .util.Scanner;

public class CheckID {
	
	public static boolean isID(String ID) {

		if (ID.length() == 10) {
			if (ID.charAt(0) >= 'A' && ID.charAt(0) <= 'Z') {
				if (ID.charAt(1) =='1' || ID.charAt(1) =='2') {
					for (int i = 3 ; i < 10 ; i++) {
						if (ID.charAt(i) >= '0' && ID.charAt(i) <= '9') {
							return true;
						}
					}
				}
				return false;
			}
			return false;
		}
		return false;
	}
	
	public static boolean check(String ID) {
		int n = (ID.charAt(0) - 'A');
		int [] az = {10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("請輸入身分證 :");
		String id = s.next();
		id = id.toUpperCase();
		
		if (isID(id) == true) {
			System.out.println("身分證正確");
		}
		else {
			System.out.println("身分證錯誤" + id);
		}
		s.close();
	}

}
