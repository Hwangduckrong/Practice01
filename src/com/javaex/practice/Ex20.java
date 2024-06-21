package com.javaex.practice;

public class Ex20 {

	public static void main(String[] args) {
		int i = 10;
		int n = i++%2;
		
		System.out.println(i);//11
		System.out.println(n);// i++=10, 10%2=0 정답: 0

	}

}
