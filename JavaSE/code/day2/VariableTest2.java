public class VariableTest2 {
	
	public static void main(String[] args) {
		// 常量 : 不可以变化的量, 有2种 1) 字面量, 2) 被final修饰的量
		// 变量 : 可以变化的量
		int n1 = 100; // 100是常量
		int n2;
		n2 = 200; // 写操作
		
		//300 = 300; 因为300是值, 是常量, 不允许写入
		// 整数字面量默认使用的是int数据类型
		
		//long l = 3000000000; // 30亿超出了int型范围
		long l = 3000000000L; // 30亿超出了int型范围, 后缀L的作用是提醒编译器,这个整数字面量用long型8字节去保存它
		
		byte b1 = 10;
		short s1 = 20;
		
		s1 = b1;
		
		//b1 = s1;
		b1 = (byte)s1; // 可以使用强制类型转换, 强制类型转换有风险, 要小心!!!
		
		n2 = s1;
		
		//s1 = n2;
		s1 = (short)n2;
		
		l = n2;
		n2 = (short)l;
		
		double d = 0.22;
		n2 = (byte)d;
		
		//float f = 0.11; // 浮点数字面量默认的类型是double型.
		float f1 = (float)0.11; // 浮点数字面量默认的类型是double型.
		float f2 = 0.11F; // 
		double d2 = 3.2D;
		
		//l = f1; long型接不住float型. 因为float虽然空间小, 但是范围比long大
		l = (long)f1;
		f1 = l;
		
		d = f1;
		d = l;
		d = n2;
		
		// 数据范围
		// byte < short < int < long < float < double
		// 左 = 右
		// 如果右面的值的范围小于等于左面的变量的类型
		// 如果右面的值的范围大于左面的变量的类型, 必须强制类型转换.
	}
}