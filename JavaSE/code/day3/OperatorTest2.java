class OperatorTest4 {
	
	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]); // 把命令行参数中的第1个字符串转换成真的int整数.
		int n2 = Integer.parseInt(args[1]); // 把命令行参数中的第2个字符串转换成真的int整数.
		
		//System.out.println(n1 + n2);
		int max = (n1 > n2) ? n1 : n2;
		System.out.println("max : " + max);
		
	}
}

class OperatorTest3 {
	
	public static void main(String[] args) {
		// args就是所有命令行参数.
		System.out.println(args[0]); // 第1个命令行参数
		System.out.println(args[1]); // 第2个命令行参数
		System.out.println(args[2]); // 第3个命令行参数
	}
}

public class OperatorTest2 {
	
	public static void main(String[] args) {
		// 变量 = (条件布尔) ? 表达式1 : 表达式2;
		//获取两个数中的较大数
		int a = 30;
		int b = 30;
		
		int max = (a > b) ? a : b;
		System.out.println("max : " + max);
	}
}