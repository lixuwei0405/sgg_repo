package com.sgg.test;

import java.util.Scanner;

public class Test {
	/**
	 * ��������������
	 * @param args
	 */
	public static void main(String[] args) {
		while(true) {
			int count = 0;
			double sum = 0.0;
			Scanner sc = new Scanner(System.in);
			System.out.print("�����������֮�ڵ�������");
			int n = sc.nextInt();
			
			l1 : for (int i = 2; i < n; i++) {
				for (int j = 2; j < i; j++) {
					if(i%j==0) {
						continue l1;
					}
				}
				sum+=i;
				count++;
				System.out.println("��ǰ"+i+"Ϊ����");
			}
			System.out.println("�����ܺ�Ϊ��"+sum+"ƽ��ֵΪ��"+(sum/count));
		}
	}
}
