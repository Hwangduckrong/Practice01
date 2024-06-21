package com.javaex.practice;

public class Ex21 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i%2;
		
		System.out.println(i);// 11
		System.out.println(n);// i++=11, 11%2= 정답: 1
// Ex20문제와 다른 점은 다음과 같다. int n의 값이 prefix로 지정되었는지, postfix로 지정되었는지에 대한 차이가 있다. prefix로 지정되었을 경우, 증가 이후의 값을 대입하여야하며, postfix로 지정되었을 경우 증가 이전의 값을 대입받는다.
		
	}

}
