class OperatorExer2 {
	
	public static void main(String[] args) {
		// ��ȡ�������еĽϴ���, 1) �Ȱ�������д��, 2) �������в�����������
		int n1 = Integer.parseInt(args[0]); // ��1�������в���������
		int n2 = Integer.parseInt(args[1]); 
		int n3 = Integer.parseInt(args[2]); 
		
		// ���ҳ�n1��n2�е����ֵmax
		int max = (n1 > n2) ? n1 : n2;
		// ���ҳ�max��n3�е����ֵ��ˢmax
		max = (max > n3) ? max : n3;
		System.out.println("���ֵ : " + max);
	}
}

public class OperatorExer {
	
	public static void main(String[] args) {
		// ��ȡ�������еĽϴ���, 1) �Ȱ�������д��, 2) �������в�����������
		int n1 = 10;
		int n2 = 80;
		int n3 = 20;
		
		// ���ҳ�n1��n2�е����ֵmax
		int max = (n1 > n2) ? n1 : n2;
		// ���ҳ�max��n3�е����ֵ��ˢmax
		max = (max > n3) ? max : n3;
		System.out.println("���ֵ : " + max);
	}
}