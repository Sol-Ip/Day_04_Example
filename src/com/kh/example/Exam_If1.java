package com.kh.example;

import java.util.Scanner;

public class Exam_If1 {

	public void showIfExample() {
		//���,0,���� ���� �Ǻ��Ͽ� ����Ͻÿ�
		Scanner sc = new Scanner (System.in);
		System.out.print("���� �ϳ� �Է����ּ��� : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("����Դϴ�.");
		} else if (num == 0) {
			System.out.println("0�Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}

	}	
}
