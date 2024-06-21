package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner dis = new Scanner(System.in);
		System.out.print("마일을 입력하세요: ");
		double mile = dis.nextDouble();
		
		final double km = 1.609;	
		double result = mile*1.609;
		System.out.println(mile+"마일은"+" "+result+"킬로미터 입니다.");
	
		
		
		
				
	
		
		dis.close();
	}

}
