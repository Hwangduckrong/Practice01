package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner bank =new Scanner(System.in);
		
		System.out.print("월급을 입력하세요: ");
		int money = bank.nextInt();
		System.out.println("10년동안 최대 저축액은 "+(120*money)+"원 입니다.");
	
		bank.close();	

	}

}
