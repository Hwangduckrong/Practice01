package com.javaex.practice;

public class Ex16 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a="+a);//a = ++x, ++x= 2*2 = 4
		System.out.println("b="+b);//b = y++, y++= 1*2 = 2
		System.out.println("x="+x);//x = 1
		System.out.println("y="+y);//y = 1
	}

}
