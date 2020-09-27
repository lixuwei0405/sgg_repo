class SwitchTest2 {
	
	// 没有break的switch不是严格的分支, 
	// 如果没有break, 在执行时, 一旦有某个case进入了, 则下面所有的case都将无条件进入, 直到结束或遇到break为止
	// 这种现象称为fall through, 也称为穿透.
	public static void main(String[] args) {
		int n = 2;
		
		switch (n) {
			case 1 :
				System.out.println("1");
				//break;
			case 2 :
				System.out.println("2");
				//break;
			case 4 :
				System.out.println("4");
				break;
			case 5 :
				System.out.println("5");
				break;
			default :
				System.out.println("default");
				//break;
		}
		
		System.out.println("after switch");
	}
}

public class SwitchTest {
	
	public static void main(String[] args) {
		/*
		if (n == 1) {
			System.out.println("n == 1");
		} else if (n == 2) {
			System.out.println("n == 2");
		} else if (n == 5) {
			System.out.println("n == 5"); 
		} else if (n == 10) {
			System.out.println("n == 10");
		} else {
			System.out.println("else...");
		}
		以上的语句完全可以使用switch来代替
		
		作用用于穷举变量中的可能的值, 不可能情况太多.
		switch (变量) { // switch(必须是变量), 数据类型可以是byte, short, int, char, 字符串, 枚举
			case 常量1 : // case 后面必须是常量 10, 'A', "abc", 0x2F
				语句块1; // 如果 变量==常量1 执行语句块1
				break; // 破坏整个switch结构.
			case 常量2 :
				语句块2;// 如果 变量==常量2 执行语句块2
				break;
			case 常量3 :
				语句块3;// 如果 变量==常量3 执行语句块3
				break;
			....
			default : // 如果 变量不等于以上常量 执行语句块n
				语句块n; 
				break;
		}*/
		
		int n = 20;
		 
		switch (n) {
			case 1 :
				System.out.println("1");
				break;
			case 2 :
				System.out.println("2");
				break;
			case 4 :
				System.out.println("4");
				break;
			case 5 :
				System.out.println("5");
				break;
			default :
				System.out.println("default");
				break;
		}
		
		System.out.println("after switch");
	}
}