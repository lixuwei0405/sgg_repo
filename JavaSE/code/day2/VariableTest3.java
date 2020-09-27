public class VariableTest3 {
	
	public static void main(String[] args) {
		byte b1 = 20;
		short s1 = 30;
		int i1 = 40;
		long l1 = 50;
		
		b1 = 30; // 因为右面是常量, 30是永远不变, 放在b1中不会出问题
		//b1 = s1; // 因为右面是变量, 变量中的值编译器无法确定, 放在b1中就有可能出问题.
		
		// 任意非long整数作运算, 结果总是int型
		//s1 = b1 + s1;
		s1 = (short)(b1 + s1);
		
		float f = 3.2F;
		
		i1 = s1 + i1;
		//i1 = l1 + b1; 混合运算中, 结果的数据类型取决于其中范围最大的那个.
		i1 = (int)(l1 + b1);
		i1 = (int)l1 + b1;
		
		//l1 = f + s1;
		l1 = (long)(f + s1);
	}
}