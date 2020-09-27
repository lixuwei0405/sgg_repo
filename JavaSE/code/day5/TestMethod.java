public class TestMethod {
	
	//编写程序,声明一个类TestMethod，在其中声明一个method方法，在方法中打印一个20*8的矩形，
	//在main方法中调用该方法。
	public static void method() {
		// 打印20 * 8的矩形
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//在上一个练习中的TestMethod类中再声明一个方法method1，在方法中打印一个n*m的矩形，
	//并在方法结束后返回矩形周长, 在main方法中调用该方法, 并打印周长.
	public static int method1(int n, int m) {
		// 打印n * m的矩形
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int l = 2 * (m + n);
		return l;
	}

	public static void main(String[] args) {
		method();
		
		int a = method1(5, 20);
		System.out.println("矩形周长 : " + a);
	}
}