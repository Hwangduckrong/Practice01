package com.javaex.practice;

public class Ex19 {

	public static void main(String[] args) {
		int num01 = 40;
		int num02 = 50;
		int result = (num01++) + (++num02);
	
		System.out.println(result);// num01++=40, ++num02=51, 40+51=91
		System.out.println(num01);// num01이 num01++이후로 값이 증가하였다. 그렇기 때문에 41이 출력될 것이다.
		System.out.println(num02);// num02이 ++num02이 선언된 이후 바로 값이 증가하여 51이 되었다. 그렇기 때문에 51이 출력될 것이다.
	}

}
