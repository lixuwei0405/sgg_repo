class IfTest3 {
	
		
	
	public static void main(String[] args) {
		/*
		if (��������1) {
			����1;
		} else if (��������2) {
			����2; // ����1Ϊ�ٲ�������2Ϊ��ʱ
		} else if (��������3) {
			����3; // ����1Ϊ�ٲ�������2ҲΪ��, ��������3Ϊ��
		} else if (��������n) {
			����n; // ǰ������������Ϊ��, ������������nΪ��
		}
		��������֮�以��
		*/
		
		int n = 10;


		if (n == 1) {
			System.out.println("n == 1");
		} else if (n >= 2) {
			System.out.println("n >= 2");
			if (n >= 10) {
				System.out.println("n >= 10");
			}
		} else if (n == 5) {
			System.out.println("n == 5"); 
		} else if (n == 10) {
			System.out.println("n == 10");
		} else {
			System.out.println("else...");
		}
		
		System.out.println("after if else if else if ....");
	}
}

class IfTest2 {
	
	public static void main(String[] args) {
		/*
		if (��������) {
			����1; // �����������Ϊ��ʱִ������1
		} else {
			����2; // �����������Ϊ��ʱִ������2
		}
		����1��2�ǻ����. �����ܶ�ִ��, Ҳ�����ܶ���ִ��.
		*/
		
		int n = 2;
		
		if (n == 2) {
			System.out.println("n == 2"); 
		} else {
			System.out.println("n != 2");
		}
		
		System.out.println("after if else");
	}
 }
 
public class IfTest {
	
	public static void main(String[] args) {
		/*
			if (��������) {
				����; // �����������Ϊ��ʱ, ִ������, Ϊ��ʱ��ִ��
			}
		*/
		
		int n = 20;
		
		if (n == 10) {
			System.out.println("n == 10"); // ������ִ�����
		}
		
		System.out.println("after if ");  // ������ִ�����
	}
}