package com.sist;

public class Ex05 {

	public static void main(String[] args) {

		// 키보드로 이름과 각 과목 점수를 입력받음 ,, 아규먼트 들어가서 하는 것
		String name = args[0];
		int eng = Integer.parseInt(args[2]);
		int kor = Integer.parseInt(args[1]); //스트링형인 args에 int형 데이터를 넣는 방법
		int mat = Integer.parseInt(args[3]);
		int sum = kor + eng + mat;
		float avg = sum / 3.0f;

		System.out.println("이      름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + mat);
		System.out.println("평균점수 : " + sum);
		System.out.printf("평      균 : %.2f", avg);
		
	}

}
