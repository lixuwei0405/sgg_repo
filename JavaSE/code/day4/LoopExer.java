// 打印20*8的矩形, n*m的矩形.
class LoopExer9 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class LoopExer8 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	
// 求1000以内所有能被7整除的数的平均值.
class LoopExer7 {
	
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				sum += i;
				count++;	
			}	
		}
		int avg = sum / count;
		System.out.println("能被7整除的数的平均值 : " + avg);
	}	
}

// 使用for打印20*8的矩形和n*8的矩形.
class LoopExer6 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int i = 0; i < n; i++) {
			System.out.println("********");
		}
	}
}

class LoopExer5 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println("********");
		}
	}
}
	
// 打印n*8的矩形.
class LoopExer4 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i = 0;
		do {
			System.out.println("********");
			i++;
		} while (i < n);
	}
	
}

// 打印20*8的矩形
class LoopExer3 {
	
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println("********");
			i++;
		} while (i < 20);
	}
	
}

class LoopExer2 {
	
	public static void main(String[] args) {
		// 打印n*8的矩形.
		int n = Integer.parseInt(args[0]);
		
		int i = 0; // 初始语句
		while (i < n) { // 循环条件
			System.out.println("********"); // 循环体
			i++; // 迭代语句
		}
	}
}

public class LoopExer {
	
	public static void main(String[] args) {
		// 打印20*8的矩形
		int i = 0; // 初始语句
		while (i < 20) { // 循环条件
			System.out.println("********"); // 循环体
			i++; // 迭代语句
		}
	}
}