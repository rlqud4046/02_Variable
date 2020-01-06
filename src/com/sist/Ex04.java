package com.sist;

/*
 * 기본자료형은 아니지만 기본자료형처럼 사용하는  String 자료형
 * String 클래스형은 문자열을 처리하는 클래스 자료형 >>>>> 참조 자료형
 * 반드시 "~~~~~"를 사용해야 함.
 */

public class Ex04 {

	public static void main(String[] args) {

		String name = "이기병";
		System.out.println("당신의 이름은 " + name + "입니다");
		System.out.println();

		/*
		 * 성적 처리 이름, 국어, 영어, 수학 총점, 평균
		 */

		int kor, eng, mat, sum;
		double avg, avg2;

		kor = 90;
		eng = 87;
		mat = 94;
		sum = kor + eng + mat;
		avg = (double) sum / 3; 
		// 명시적 형변환을 안하면 뒤의 식을 먼저 계산하므로 90이 나오고 그게 double형 avg에 들어가서 90.0이 나옴
		avg2 = sum/3.0; //아니면 avg = sum/3.0; 으로 해주어도 된다.
		
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", mat);
		System.out.printf("총좀 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);
		System.out.printf("평균2 : %.2f\n", avg2);
		
		System.out.println("평균3 : " + sum/3.0f);
		

	}
}
