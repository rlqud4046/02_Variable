package com.sist;

/*
 * 정수 자료형 연산 시 주의사항
 * 	byte + byte = int형
 * 	byte + short = int형
 *	short + short = int형
 *		자바는 정수 자료형 연산 시 최소 32bit(int) 처리를 한다.
 *	정수형 + 실수형 = 무조건 실수형
 *	
 */


public class Ex02 {

	public static void main(String[] args) {
		
		byte su1 = 127;
		
		System.out.println("su1 ==>" + su1);
		
		// byte su2 = 128; 이 경우는 -128~127 까지의 byte 표현 범위를 초과하기 때문에 에러가 발생한다.
		
		int num1 = su1; // 묵시적 형변환
		
		System.out.println(num1);
		
		int num2 = 150;
		
		//byte su2 = num2; 에러1. 바이트형 su2에 int형 num2를 집어 넣을 수 없다. num2가 1이라고 하더라도 불가능
		
		byte su2 = (byte)num2; // 명시적 형변환
		
		System.out.println(su2); // 에러2. 실제 에러가 발생하진 않지만 byte의 범위값을 초과하기 때문에 쓰레기값이 나온다.
		
		/*
		 * 형변환 ( Casting )
		 * 1. 묵시적 형변환 : 자료형의 크기가 작은 데이터를 큰 자료형의 데이터에 저장 int a; byte b; a = b;
		 * 2. 명시적 형변환 : 자료형의 크기가 큰 데이터를 작은 자료형의 데이터에 저장 int a; byte b; b = (byte)a;
		 */
		
		int num3 = 2147483647;
		int num4 = 2147483647;
		
		long sum = (long)num3 + num4;
		
		System.out.println(sum);
		System.out.printf("sum ==> %,d\n", sum); // format의 약자 %d에 sum을 출력 ,, %,d는 천단위마다 컴마
		
		float avg = (float)91.3456781234111; // 혹은 뒤에 f을 붙여도 됨
		System.out.println("avg ==> " + avg);
		System.out.printf("avg ==> %.2f\n", avg); // 소숫점 이하 2자리 까지만 출력
		
		/*
		 * 출력 양식(printf() 메서드)
		 * %d : 정수값 
		 * %f : 실수값
		 */

	}

}
