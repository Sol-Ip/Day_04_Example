package com.kh.example;

import java.util.Scanner;

public class Exam_If1 {

	public void showIfExample() {
		//양수,0,음수 인지 판별하여 출력하시오
		Scanner sc = new Scanner (System.in);
		System.out.print("정수 하나 입력해주세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}

	}	
}
