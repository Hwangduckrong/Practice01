package com.javaex.practice;

public class Ex24 {

	public static void main(String[] args) {
		double f = 80.0;
		System.out.println(5/9*(f-32.0));
		//위 코드가 0이 나오는 이유는  5/9가 int형이기 때문에 값이 0으로 출력된다. double형으로 값을 출력하면 0.55555555가 나오게 된다. 그렇기 때문에, 0이 아닌 결과값을 출력하고자 한다면 5/9를 double형으로 강제형변환 시켜줘야한다.
		
		//정답
		System.out.println((double) 5/9*(f-32.0));
	}

}
