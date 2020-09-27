class IfTest3 {
	
		
	
	public static void main(String[] args) {
		/*
		if (条件布尔1) {
			语句块1;
		} else if (条件布尔2) {
			语句块2; // 条件1为假并且条件2为真时
		} else if (条件布尔3) {
			语句块3; // 条件1为假并且条件2也为假, 并且条件3为真
		} else if (条件布尔n) {
			语句块n; // 前面所有条件都为假, 并且条件布尔n为真
		}
		各个语句块之间互斥
		*/
		
		int n = 10;


		if (n == 1) {
			System.out.println("n == 1");
		} else if (n >= 2) {
			System.out.println("n >= 2");
			if (n >= 10) {
				System.out.println("n >= 10");
			}
		} else if (n == 5) {
			System.out.println("n == 5"); 
		} else if (n == 10) {
			System.out.println("n == 10");
		} else {
			System.out.println("else...");
		}
		
		System.out.println("after if else if else if ....");
	}
}

class IfTest2 {
	
	public static void main(String[] args) {
		/*
		if (条件布尔) {
			语句块1; // 如果条件布尔为真时执行语句块1
		} else {
			语句块2; // 如果条件布尔为假时执行语句块2
		}
		语句块1和2是互斥的. 不可能都执行, 也不可能都不执行.
		*/
		
		int n = 2;
		
		if (n == 2) {
			System.out.println("n == 2"); 
		} else {
			System.out.println("n != 2");
		}
		
		System.out.println("after if else");
	}
 }
 
public class IfTest {
	
	public static void main(String[] args) {
		/*
			if (条件布尔) {
				语句块; // 如果条件布尔为真时, 执行语句块, 为假时不执行
			}
		*/
		
		int n = 20;
		
		if (n == 10) {
			System.out.println("n == 10"); // 有条件执行语句
		}
		
		System.out.println("after if ");  // 无条件执行语句
	}
}