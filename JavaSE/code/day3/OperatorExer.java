class OperatorExer2 {
	
	public static void main(String[] args) {
		// 获取三个数中的较大数, 1) 先把三个数写死, 2) 用命令行参数代替死数
		int n1 = Integer.parseInt(args[0]); // 第1个命令行参数变整数
		int n2 = Integer.parseInt(args[1]); 
		int n3 = Integer.parseInt(args[2]); 
		
		// 先找出n1和n2中的最大值max
		int max = (n1 > n2) ? n1 : n2;
		// 再找出max和n3中的最大值回刷max
		max = (max > n3) ? max : n3;
		System.out.println("最大值 : " + max);
	}
}

public class OperatorExer {
	
	public static void main(String[] args) {
		// 获取三个数中的较大数, 1) 先把三个数写死, 2) 用命令行参数代替死数
		int n1 = 10;
		int n2 = 80;
		int n3 = 20;
		
		// 先找出n1和n2中的最大值max
		int max = (n1 > n2) ? n1 : n2;
		// 再找出max和n3中的最大值回刷max
		max = (max > n3) ? max : n3;
		System.out.println("最大值 : " + max);
	}
}