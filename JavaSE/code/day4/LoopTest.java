/**
	while 循环执行 0~N次
	do whlie 循环循环 1~N次
*/
/*
打印一个高度为5的等腰三角形

				i		空格			*
    *			0		4			1
   ***			1		3			3
  *****			2		2			5
 *******		3		1			7
*********		4		0			9 */

class LoopTest17 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		// 判断n是否是质数.质数 : 只能被1和自身整除的数.
		boolean flag = true; // 假设n是质数.
		// 再进一步论证, 只需要找反例, 如果能在2~n-1中随便找到数, n能被这个数整除, n就不是质数.
		for (int i = 2; i < n; i++) {
			// i就是用于测试的数
			if (n % i == 0) { // 说明n被某个测试值整除了. 不是质数 
				flag = false; // 推翻假设!!
			}
		}
		
		if (flag) {
			System.out.println(n + "是质数");
		}
	}
}

class LoopTest16 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}

class LoopTest15 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < -2 * i + 20; j++) { // y = -1 * x + 10
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class LoopTest14 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3 * i + 5; j++) { // y = 1 * x + 1, 当k大于0是正比, 当k小于0是反比 
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class LoopTest13 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		
		for (int i = 0; i < n; i++) { // 外循环控制行
			for (int j = 0; j < m; j++) { // 内循环控制列
				System.out.print("j : " + j + "  "); 
			}
			System.out.println(); // 外循环次数
		}
	}
}

class LoopTest12 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) { // 外循环控制行
			for (int j = 0; j < 8; j++) { // 内循环控制列
				System.out.print("j : " + j + "  "); 
			}
			System.out.println(); // 外循环次数
		}
	}
}

class LoopTest11 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("j : " + j); // 内循环次数 = 外循环次数*内循环次数
			}
			System.out.println("i : " + i); // 外循环次数
		}
	}
}

class LoopTest10 {
	
	public static void main(String[] args) {
		// 求100以内所有奇数的平均值
		int sum = 0;
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println("i : " + i);
				sum += i;
				count++;
			}
		}
		System.out.println("sum : " + sum);
		int avg = sum / count;
		System.out.println("avg : " + avg);
	}
}

class LoopTest9 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int result = 0;
		for (int i = 0; i < n; i++) { // 条件右面的值-初始值, 如果有=再加1
			result += i;
		}
		System.out.println("result : " + result);
	}
}

class LoopTest8 {
	
	public static void main(String[] args) {
		/*
		for (初始化语句A; 循环条件B; 迭代语句C) {
			循环体D;
		}
		A B D C B D C B D ... C B D .....B
		迭代语句C是每次循环的开始
		*/
		
		int result = 0;
		for (int i = 1; i <= 5; i++) { // for循环中的因子i最好声明在里面, 这样更安全.
			result += i;
		}
		System.out.println("result : " + result);
		//System.out.println("i : " + i);
		
	}
}



class LoopTest7 {
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("hello");
		}
	}
}

class LoopTest6 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int result = 0;
		int i = 0;
		do {
			result += i;
			i++;
		} while (i < n); // 执行次数是1~N次
		
		System.out.println("result : " + result);
		System.out.println("i : " + i);
	}
}

class LoopTest5 {
	
	public static void main(String[] args) {
		// 初始化语句
		/*do {
			// 循环体;
			// 迭代语句;
		} while (循环条件);
		*/
		int result = 0;
		int i = 1;
		do {
			result += i;
			i++;
		} while (i <= 5); // 循环次数 : 条件右面的值5 - 初始值1, 如果有=, 再加1
		
		System.out.println("result : " + result);
		System.out.println("i : " + i);
	}
}

class LoopTest4 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int result = 0;
		int i = 0; 
		while (i < n) { // 通常情况下初始值从0开始, 条件中没有=, 此时循环次数就是n.
			result += i; 
			i++; 
		}
		System.out.println("result : " + result); // 
		System.out.println("i : " + i);
	}
}

class LoopTest3 {
	
	public static void main(String[] args) {
		int result = 0;
		int i = 0; 
		while (i < 100) { // 通常情况下初始值从0开始, 条件中没有=.
			result += i; 
			i++; 
		}
		System.out.println("result : " + result); // 
		System.out.println("i : " + i);
	}
}

class LoopTest2 {
	
	public static void main(String[] args) {
		int result = 0;
		int i = 2; 
		while (i <= 80) { // 循环次数 = 条件右面的值 - 初始值, 如果有=再加1 
			result += i; 
			i++; 
		}
		System.out.println("result : " + result);
		System.out.println("i : " + i);
	}
}

public class LoopTest {
	
	public static void main(String[] args) {
		/*
		在某些条件满足的情况下, 反复的执行某段代码的功能.
		组成 
		1) 初始化语句 : 为循环开始作准备
		2) 循环条件 : 控制循环生死
		3) 循环体 : 被多次执行的代码
		4) 迭代语句 : 让循环趋于结束(循环条件趋于假)
		
		
		初始语句;
		while (循环条件布尔) {
			循环体;// 只要循环布尔为真就一直执行此循环体
			迭代语句; 
		}
		
		*/
	
		int result = 0;
		int i = 1; // 循环因子, 初始语句
		while (i <= 5) { // 循环条件 
			result += i; // 循环体
			i++; // 迭代语句
		}
		System.out.println("result : " + result);
		System.out.println("i : " + i);
	}
}