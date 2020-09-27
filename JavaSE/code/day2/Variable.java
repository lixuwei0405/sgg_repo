public class Variable {
	
	public static void main(String[] args) {
		//1 写一个Variable类，main方法中使用double类型声明var1和var2变量，
		double var1 = 200;
		double var2 = 60;
		
		// 2 声明字符串变量str，用str串接的形式表示上述计算过程并打印输出结果。
		String str = "" + var1 + '/' + var2 + " = ";
		
		//然后用var2保存var1与var2之商。
		var2 = var1 / var2;
		
		str = str + var2;
		
		System.out.println(str);
	}
}