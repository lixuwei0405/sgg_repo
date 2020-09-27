class LoopTest12 {

	public static void main(String[] args) {
		// 列出100以内的所有质数
		l1 : for (int i = 2; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue l1; // 制造麻烦, 让后面的打印不能顺利执行.
				}
			}
			System.out.println(i + "是质数");
		}
	}
}

class LoopTest11 {
	
	public static void main(String[] args) {
		l1 : for (int i = 0; i < 5; i++) {
			l2 : for (int j = 0; j < 3; j++) {
				if (j % 2 == 0) {
					//continue; // 中断的是离我最近的循环的当次循环, 直接进入离我最近的循环的下一次循环.
					continue l1;// 中断的是标签指定的循环的当次循环, 直接进入标签指定的循环的下一次循环.
				}
				System.out.println("j : " + j);
			}
			System.out.println("i : " + i);
		}
	}
	
}

class LoopTest10 {
	
	public static void main(String[] args) {
		// continue 中断循环的某些次循环, 直接进入下一次循环. 中断力度小
		// 内在逻辑, 是本来要正常执行循环的, 但是出现了小问题, 使得某些次循环出现意外,不能执行. 继续下一次.
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println("i : " + i);
		}
	}
}

class LoopTest9 {
	
	public static void main(String[] args) {
		// 列出100~200的所有质数. 要求外循环因子是i,内循环因子是j.
		for (int i = 100; i < 200; i++) {
			// 假设i是质数, 质数 : 只能被1和自身整除的数.
			boolean flag = true;
			// 尝试推翻, 从2~i-1中找出所有数来, 测试是否能整除
			for (int j = 2; j < i; j++) {
				if (i % j == 0) { // 找到某个j值, 它可以实现让i被j整除.
					flag = false; // 推翻假设
					break; // 中断的是论证过程. 因为结论是显然的, 它一定不是质数
				}
			}
			if (flag) {//if (i是质数) {
				System.out.println(i);
			}
		}
	}
	
}

class LoopTest8 {
	
	public static void main(String[] args) {
		l1 : for (int i = 0; i < 5; i++) {
			l2 : for (int j = 0; j < 3; j++) {
				System.out.println("j : " + j);
				if (j == 1) {
					//break; // 中断的是离我最近的循环.
					break l1; // 中断标签指定的循环
				}
			}
			System.out.println("i : " + i);
		}
	}
}

class LoopTest7 {
	
	public static void main(String[] args) {
		// break用于中断循环, 破坏力度大.
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i);
			if (i == 3) {
				break; // 中断,破坏循环
			}
		}
		System.out.println("after loop");
	}
}

class LoopTest6 {
	
	public static void main(String[] args) {
		/*
		while (true) {
		}*/
		
		/*
		do {
		} while (true);*/
		
		//for (int i = 0; true; i++) {}
		//for (int i = 0; i < 100; i--) {} // 不是死循环
		//for (;;) {}
		//for (int i = 0; i < 100; ) {} // 编译认为不是, 实际执行就是, 前提是不要修改i
		
		System.out.println("hello");
	}
}

class LoopTest5 {
	
	public static void main(String[] args) {
		boolean flag = true;
		while (flag) { // 循环次数不确定的情况用while, 主要用于应用程序主体.
		}
		
		for (int i = 0; i < 10; i++) { // 循环次数确定的情况下用for
		}
	}
}

class LoopTest4 {
	
	public static void main(String[] args) {
		// 列出100~200的所有质数. 要求外循环因子是i,内循环因子是j.
		for (int i = 100; i < 200; i++) {
			// 假设i是质数, 质数 : 只能被1和自身整除的数.
			boolean flag = true;
			// 尝试推翻, 从2~i-1中找出所有数来, 测试是否能整除
			for (int j = 2; j < i; j++) {
				if (i % j == 0) { // 找到某个j值, 它可以实现让i被j整除.
					flag = false; // 推翻假设
				}
			}
			if (flag) {//if (i是质数) {
				System.out.println(i);
			}
		}
	}
	
}



class LoopTest3 {
	
	public static void main(String[] args) {
		// 列出100以内的所有质数
		for (int j = 2; j < 100; j++) {
			// 判断j是否是质数 : 质数就是只能被1和自身整除的数
			boolean flag = true; // 假设j就是质数.
			// 尝试论证推翻它, 从2~j-1中找所有的数测试是否能整除j, 如果能被整除则j不是质数 
			for (int i = 2; i < j; i++) {
				if (j % i == 0) { // 说明j被某个测试值i整除了.
					flag = false; // 推翻假设, 证明j不是质数
				}
			}
			if (flag) { // flag中保存了假设, 如果它没有被刷过值, 说明真的没有找到反例. 如果被刷新过, 说明找到了反例.
				System.out.println(j + "是质数");
			}
		}
	}
}

class LoopTest2 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		// 判断n是否是质数 : 质数就是只能被1和自身整除的数
		boolean flag = true; // 假设n就是质数.
		// 尝试论证推翻它, 找一些数测试是否能整除n, 如果能被整除则n不是质数 
		for (int i = 2; i < n; i++) {
			if (n % i == 0) { // 说明n被某个测试值i整除了.
				flag = false; // 推翻假设, 证明n不是质数
			}
		}
		if (flag) { // flag中保存了假设, 如果它没有被刷过值, 说明真的没有找到反例. 如果被刷新过, 说明找到了反例.
			System.out.println(n + "是质数");
		}
	}
}

/*
打印一个高度为5的等腰三角形

				i		空格			*
    *			0		4			1
   ***			1		3			3
  *****			2		2			5
 *******		3		1			7
*********		4		0			9 
打印高度为n的等腰三角形, 做成空心的.
*/
class LoopTest {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == 2 * i) { // 第一行或最后行, 或第一列或最后一列
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}