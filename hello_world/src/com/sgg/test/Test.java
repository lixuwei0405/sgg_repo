package com.sgg.test;

import java.util.Scanner;

public class Test {
	/**
	 * 求任意数的质数
	 * @param args
	 */
	public static void main(String[] args) {
		while(true) {
			int count = 0;
			double sum = 0.0;
			Scanner sc = new Scanner(System.in);
			System.out.print("请输入多少数之内的质数：");
			int n = sc.nextInt();
			
			l1 : for (int i = 2; i < n; i++) {
				for (int j = 2; j < i; j++) {
					if(i%j==0) {
						continue l1;
					}
				}
				sum+=i;
				count++;
				System.out.println("当前"+i+"为质数");
			}
			System.out.println("质数总和为："+sum+"平均值为："+(sum/count));
		}
	}
}
