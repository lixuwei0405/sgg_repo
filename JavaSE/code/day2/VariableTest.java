public class VariableTest {
	
	public static void main(String[] args) {
		//1. 先声明(declare),后使用
		//System.out.println(n1);
		//byte n1 = 200; // 超出了byte范围
		//2. 必须要有数据类型和变量名
		//3. 必须初始化, 因为内存空间中的老数据不确定, 必须写成确定的数据.
		//4. 变量有其数据范围
		//5. 变量有其作用范围, 作用范围由它的声明语句所在范围决定.
		//6. 同一范围内, 变量不能重复声明.
		//int n1 = 300;

		int n2 = 400;
		System.out.println(n2);
		
		int n3;
		{
			n3 = 500;
		}
		System.out.println(n3);// 超出范围

	}
}