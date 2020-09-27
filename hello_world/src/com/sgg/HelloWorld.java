package com.sgg;


/**
 * @author lixuwei
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		//使用循环输出等腰三角形
		int num = 5;
		//循环每一行的数量
		for(int i = 1; i<=num ; i++ ){
			//每行打印多少空格
			for(int j=0;j<(num-i)+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public void methodByLixuwei() {
		
	}

}
