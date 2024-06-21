package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner ai = new Scanner(System.in);
		System.out.print("반지름: ");
		double r = ai.nextDouble();
		System.out.println("구의부피는: "+((double)4/3*3.14*r*r*r));
		
		ai.close();

	}

}
