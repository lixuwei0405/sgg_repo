class SwitchTest2 {
	
	// û��break��switch�����ϸ�ķ�֧, 
	// ���û��break, ��ִ��ʱ, һ����ĳ��case������, ���������е�case��������������, ֱ������������breakΪֹ
	// ���������Ϊfall through, Ҳ��Ϊ��͸.
	public static void main(String[] args) {
		int n = 2;
		
		switch (n) {
			case 1 :
				System.out.println("1");
				//break;
			case 2 :
				System.out.println("2");
				//break;
			case 4 :
				System.out.println("4");
				break;
			case 5 :
				System.out.println("5");
				break;
			default :
				System.out.println("default");
				//break;
		}
		
		System.out.println("after switch");
	}
}

public class SwitchTest {
	
	public static void main(String[] args) {
		/*
		if (n == 1) {
			System.out.println("n == 1");
		} else if (n == 2) {
			System.out.println("n == 2");
		} else if (n == 5) {
			System.out.println("n == 5"); 
		} else if (n == 10) {
			System.out.println("n == 10");
		} else {
			System.out.println("else...");
		}
		���ϵ������ȫ����ʹ��switch������
		
		����������ٱ����еĿ��ܵ�ֵ, ���������̫��.
		switch (����) { // switch(�����Ǳ���), �������Ϳ�����byte, short, int, char, �ַ���, ö��
			case ����1 : // case ��������ǳ��� 10, 'A', "abc", 0x2F
				����1; // ��� ����==����1 ִ������1
				break; // �ƻ�����switch�ṹ.
			case ����2 :
				����2;// ��� ����==����2 ִ������2
				break;
			case ����3 :
				����3;// ��� ����==����3 ִ������3
				break;
			....
			default : // ��� �������������ϳ��� ִ������n
				����n; 
				break;
		}*/
		
		int n = 20;
		 
		switch (n) {
			case 1 :
				System.out.println("1");
				break;
			case 2 :
				System.out.println("2");
				break;
			case 4 :
				System.out.println("4");
				break;
			case 5 :
				System.out.println("5");
				break;
			default :
				System.out.println("default");
				break;
		}
		
		System.out.println("after switch");
	}
}