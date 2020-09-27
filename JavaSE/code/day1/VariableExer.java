public class VariableExer {
	
	public static void main(String[] args) {
		// 声明2个int型变量, 用前一个保存2者之和, 再用后一个保存2者之商. 打印输出. 分析内存的变化过程!!!
		int a;
		a = 35;
		
		int b;
		b = 12;
		
		System.out.println(a);
		System.out.println(b);
		
		a = a + b;
		b = a / b;
		
		System.out.println(a);
		System.out.println(b);
		
		int c;
		c = 20;
		c = 30;
		System.out.println(c);
		
		int d = 200;
		//int d = 300; 在同一范围内变量不允许重复声明.
		
		
	}
}