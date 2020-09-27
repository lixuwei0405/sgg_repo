class LoopExer2 {	
	
	// 练习 : 打印100以内能被7整除的数. 必须使用continue来做.
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i % 7 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
		
}
	
class LoopExer1 {
	
	public static void main(String[] args) {
		// 从命令行参数获取一个整数, 使得一个本来应该循环100次的循环, 实际循环n次.
		int n = Integer.parseInt(args[0]); // 5
		
		int count = 100;
		if (n > count) {
			count = n;
		}
		for (int i = 0; i < count; i++) {
			System.out.println("i : " + i);
			if (i == n - 1) {
				break;
			}
		}
	}
}