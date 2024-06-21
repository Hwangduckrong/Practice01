package com.javaex.practice;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner ai = new Scanner(System.in);
		System.out.print("500원 개수: ");
		int A = ai.nextInt();
		System.out.print("100원 개수: ");
		int B = ai.nextInt();
		System.out.print("50원 개수: ");
		int C = ai.nextInt();
		System.out.print("10원 개수: " );
		int D = ai.nextInt();
		System.out.println("동전의 총합은 "+(A*500+B*100+C*50+D*10)+" 원입니다.");
	
		ai.close();
		

	}

}
