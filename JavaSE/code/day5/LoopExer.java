class LoopExer2 {	
	
	// ��ϰ : ��ӡ100�����ܱ�7��������. ����ʹ��continue����.
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
		// �������в�����ȡһ������, ʹ��һ������Ӧ��ѭ��100�ε�ѭ��, ʵ��ѭ��n��.
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