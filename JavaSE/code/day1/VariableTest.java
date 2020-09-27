public class VariableTest {
	
	public static void main(String[] args) {
		// 变量 : 内存中的一块区域, 用于保存数据, 由数据类型决定空间大小和什么数据, 变量名作用是定位此空间.
		// 声明 : 数据类型 变量名;
		int n1;
		n1 = 20; // n1 = 20, 把20这个数据写入n1变量中
		System.out.println(n1); // "n1"
		
		// n2是被写入, n1是读取
		int n2 = n1;
		System.out.println(n1);
	
		
		n1 = n1 * n2;
		
		System.out.println(n1);
		
		
		
	}
}