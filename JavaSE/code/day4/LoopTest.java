/**
	while ѭ��ִ�� 0~N��
	do whlie ѭ��ѭ�� 1~N��
*/
/*
��ӡһ���߶�Ϊ5�ĵ���������

				i		�ո�			*
    *			0		4			1
   ***			1		3			3
  *****			2		2			5
 *******		3		1			7
*********		4		0			9 */

class LoopTest17 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		// �ж�n�Ƿ�������.���� : ֻ�ܱ�1��������������.
		boolean flag = true; // ����n������.
		// �ٽ�һ����֤, ֻ��Ҫ�ҷ���, �������2~n-1������ҵ���, n�ܱ����������, n�Ͳ�������.
		for (int i = 2; i < n; i++) {
			// i�������ڲ��Ե���
			if (n % i == 0) { // ˵��n��ĳ������ֵ������. �������� 
				flag = false; // �Ʒ�����!!
			}
		}
		
		if (flag) {
			System.out.println(n + "������");
		}
	}
}

class LoopTest16 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}

class LoopTest15 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < -2 * i + 20; j++) { // y = -1 * x + 10
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class LoopTest14 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3 * i + 5; j++) { // y = 1 * x + 1, ��k����0������, ��kС��0�Ƿ��� 
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class LoopTest13 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		
		for (int i = 0; i < n; i++) { // ��ѭ��������
			for (int j = 0; j < m; j++) { // ��ѭ��������
				System.out.print("j : " + j + "  "); 
			}
			System.out.println(); // ��ѭ������
		}
	}
}

class LoopTest12 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) { // ��ѭ��������
			for (int j = 0; j < 8; j++) { // ��ѭ��������
				System.out.print("j : " + j + "  "); 
			}
			System.out.println(); // ��ѭ������
		}
	}
}

class LoopTest11 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("j : " + j); // ��ѭ������ = ��ѭ������*��ѭ������
			}
			System.out.println("i : " + i); // ��ѭ������
		}
	}
}

class LoopTest10 {
	
	public static void main(String[] args) {
		// ��100��������������ƽ��ֵ
		int sum = 0;
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println("i : " + i);
				sum += i;
				count++;
			}
		}
		System.out.println("sum : " + sum);
		int avg = sum / count;
		System.out.println("avg : " + avg);
	}
}

class LoopTest9 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int result = 0;
		for (int i = 0; i < n; i++) { // ���������ֵ-��ʼֵ, �����=�ټ�1
			result += i;
		}
		System.out.println("result : " + result);
	}
}

class LoopTest8 {
	
	public static void main(String[] args) {
		/*
		for (��ʼ�����A; ѭ������B; �������C) {
			ѭ����D;
		}
		A B D C B D C B D ... C B D .....B
		�������C��ÿ��ѭ���Ŀ�ʼ
		*/
		
		int result = 0;
		for (int i = 1; i <= 5; i++) { // forѭ���е�����i�������������, ��������ȫ.
			result += i;
		}
		System.out.println("result : " + result);
		//System.out.println("i : " + i);
		
	}
}



class LoopTest7 {
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("hello");
		}
	}
}

class LoopTest6 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int result = 0;
		int i = 0;
		do {
			result += i;
			i++;
		} while (i < n); // ִ�д�����1~N��
		
		System.out.println("result : " + result);
		System.out.println("i : " + i);
	}
}

class LoopTest5 {
	
	public static void main(String[] args) {
		// ��ʼ�����
		/*do {
			// ѭ����;
			// �������;
		} while (ѭ������);
		*/
		int result = 0;
		int i = 1;
		do {
			result += i;
			i++;
		} while (i <= 5); // ѭ������ : ���������ֵ5 - ��ʼֵ1, �����=, �ټ�1
		
		System.out.println("result : " + result);
		System.out.println("i : " + i);
	}
}

class LoopTest4 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int result = 0;
		int i = 0; 
		while (i < n) { // ͨ������³�ʼֵ��0��ʼ, ������û��=, ��ʱѭ����������n.
			result += i; 
			i++; 
		}
		System.out.println("result : " + result); // 
		System.out.println("i : " + i);
	}
}

class LoopTest3 {
	
	public static void main(String[] args) {
		int result = 0;
		int i = 0; 
		while (i < 100) { // ͨ������³�ʼֵ��0��ʼ, ������û��=.
			result += i; 
			i++; 
		}
		System.out.println("result : " + result); // 
		System.out.println("i : " + i);
	}
}

class LoopTest2 {
	
	public static void main(String[] args) {
		int result = 0;
		int i = 2; 
		while (i <= 80) { // ѭ������ = ���������ֵ - ��ʼֵ, �����=�ټ�1 
			result += i; 
			i++; 
		}
		System.out.println("result : " + result);
		System.out.println("i : " + i);
	}
}

public class LoopTest {
	
	public static void main(String[] args) {
		/*
		��ĳЩ��������������, ������ִ��ĳ�δ���Ĺ���.
		��� 
		1) ��ʼ����� : Ϊѭ����ʼ��׼��
		2) ѭ������ : ����ѭ������
		3) ѭ���� : �����ִ�еĴ���
		4) ������� : ��ѭ�����ڽ���(ѭ���������ڼ�)
		
		
		��ʼ���;
		while (ѭ����������) {
			ѭ����;// ֻҪѭ������Ϊ���һֱִ�д�ѭ����
			�������; 
		}
		
		*/
	
		int result = 0;
		int i = 1; // ѭ������, ��ʼ���
		while (i <= 5) { // ѭ������ 
			result += i; // ѭ����
			i++; // �������
		}
		System.out.println("result : " + result);
		System.out.println("i : " + i);
	}
}