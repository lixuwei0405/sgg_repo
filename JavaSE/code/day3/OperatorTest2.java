class OperatorTest4 {
	
	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]); // �������в����еĵ�1���ַ���ת�������int����.
		int n2 = Integer.parseInt(args[1]); // �������в����еĵ�2���ַ���ת�������int����.
		
		//System.out.println(n1 + n2);
		int max = (n1 > n2) ? n1 : n2;
		System.out.println("max : " + max);
		
	}
}

class OperatorTest3 {
	
	public static void main(String[] args) {
		// args�������������в���.
		System.out.println(args[0]); // ��1�������в���
		System.out.println(args[1]); // ��2�������в���
		System.out.println(args[2]); // ��3�������в���
	}
}

public class OperatorTest2 {
	
	public static void main(String[] args) {
		// ���� = (��������) ? ���ʽ1 : ���ʽ2;
		//��ȡ�������еĽϴ���
		int a = 30;
		int b = 30;
		
		int max = (a > b) ? a : b;
		System.out.println("max : " + max);
	}
}