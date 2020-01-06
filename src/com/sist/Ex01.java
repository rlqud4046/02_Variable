package com.sist;

/*
 * 변수(Variable) 
 * 		하나의 데이터를 저장할 수 있는 메모리 공간을 의미함.
 * 		변수는 여러 개의 값을 저장할 수 없고, 하나의 값 만을 저장할 수 있다. 같은 변수에 저장 시 새로운 값으로 덮어 씌워짐
 * 
 * 변수 선언 방법
 * 		자료형 변수명; 
 * 		자료형 : 기본 자료형
 * 		변수명 : 사용자가 임의로 지정
 * 
 * 변수 사용 절차
 * 		변수 선언 - 자료형 변수명;
 * 		변수 초기화 - 변수에 값을 저장
 * 		변수 이용 - 연산 및 출력 등등
 * 
 * 
 */

/*
 * 변수명 작성 규칙
 * 		변수명, 메서드명, 클래스명 등의 이름을 작성할 때 사용
 * 		예약어(키워드: 문법적으로 사용하는 단어) 사용 불가
 * 		영문자 또는 특수문자 (_ or % 두가지만 가능)로 시작
 * 		숫자로 시작하면 안됨
 * 		대소문자를 구별 함
 * 		의미있게 만드는 것이 좋음
 */


/*
 * java의 기본 자료형(8가지)
 * 		정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
 * 		실수형 : float(4byte0, double(8byte-기본형)
 * 		단일문자형 : char(2byte)
 * 		논리형 : boolean (true/false)
 * 		
 * 		나머지 자료형들은 클래스형 (후에 배움) >>>> 참조 자료형이라고 부른다.
 */
public class Ex01 {

	public static void main(String[] args) {
		
		int a;
		a = 10;
		System.out.println(a);
		
		a = a + 773;
		System.out.println(a);
		
		
		int kor = 80;
		int eng = 76;
		int mat = 76;
		System.out.println(kor+eng+mat);
		
		double sum = (kor + eng + mat) ;
		double avg = sum/3 ;
		
		System.out.println(avg);

	}

}
