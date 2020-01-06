package com.sist;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * 실수형 : 소숫점이 존재함 float(4byte) < double(8byte 기본형)
		 * float 자료형 선언시에는 반드시 실수 뒤에f라고 붙여 주어야한다.(생략하면 오류)
		 * 실수형 형 변환은 거의 자료형의 손실이 없는 것이 특징
		 */
		
		// float fNum = 12.457; 소수는 기본형이 double형이므로 에러 발생
		float fNum=12.457f;
		System.out.println("fNum==>" + fNum);

	}

}
