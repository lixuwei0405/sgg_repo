class LoopTest12 {

	public static void main(String[] args) {
		// �г�100���ڵ���������
		l1 : for (int i = 2; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue l1; // �����鷳, �ú���Ĵ�ӡ����˳��ִ��.
				}
			}
			System.out.println(i + "������");
		}
	}
}

class LoopTest11 {
	
	public static void main(String[] args) {
		l1 : for (int i = 0; i < 5; i++) {
			l2 : for (int j = 0; j < 3; j++) {
				if (j % 2 == 0) {
					//continue; // �жϵ������������ѭ���ĵ���ѭ��, ֱ�ӽ������������ѭ������һ��ѭ��.
					continue l1;// �жϵ��Ǳ�ǩָ����ѭ���ĵ���ѭ��, ֱ�ӽ����ǩָ����ѭ������һ��ѭ��.
				}
				System.out.println("j : " + j);
			}
			System.out.println("i : " + i);
		}
	}
	
}

class LoopTest10 {
	
	public static void main(String[] args) {
		// continue �ж�ѭ����ĳЩ��ѭ��, ֱ�ӽ�����һ��ѭ��. �ж�����С
		// �����߼�, �Ǳ���Ҫ����ִ��ѭ����, ���ǳ�����С����, ʹ��ĳЩ��ѭ����������,����ִ��. ������һ��.
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println("i : " + i);
		}
	}
}

class LoopTest9 {
	
	public static void main(String[] args) {
		// �г�100~200����������. Ҫ����ѭ��������i,��ѭ��������j.
		for (int i = 100; i < 200; i++) {
			// ����i������, ���� : ֻ�ܱ�1��������������.
			boolean flag = true;
			// �����Ʒ�, ��2~i-1���ҳ���������, �����Ƿ�������
			for (int j = 2; j < i; j++) {
				if (i % j == 0) { // �ҵ�ĳ��jֵ, ������ʵ����i��j����.
					flag = false; // �Ʒ�����
					break; // �жϵ�����֤����. ��Ϊ��������Ȼ��, ��һ����������
				}
			}
			if (flag) {//if (i������) {
				System.out.println(i);
			}
		}
	}
	
}

class LoopTest8 {
	
	public static void main(String[] args) {
		l1 : for (int i = 0; i < 5; i++) {
			l2 : for (int j = 0; j < 3; j++) {
				System.out.println("j : " + j);
				if (j == 1) {
					//break; // �жϵ������������ѭ��.
					break l1; // �жϱ�ǩָ����ѭ��
				}
			}
			System.out.println("i : " + i);
		}
	}
}

class LoopTest7 {
	
	public static void main(String[] args) {
		// break�����ж�ѭ��, �ƻ����ȴ�.
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i);
			if (i == 3) {
				break; // �ж�,�ƻ�ѭ��
			}
		}
		System.out.println("after loop");
	}
}

class LoopTest6 {
	
	public static void main(String[] args) {
		/*
		while (true) {
		}*/
		
		/*
		do {
		} while (true);*/
		
		//for (int i = 0; true; i++) {}
		//for (int i = 0; i < 100; i--) {} // ������ѭ��
		//for (;;) {}
		//for (int i = 0; i < 100; ) {} // ������Ϊ����, ʵ��ִ�о���, ǰ���ǲ�Ҫ�޸�i
		
		System.out.println("hello");
	}
}

class LoopTest5 {
	
	public static void main(String[] args) {
		boolean flag = true;
		while (flag) { // ѭ��������ȷ���������while, ��Ҫ����Ӧ�ó�������.
		}
		
		for (int i = 0; i < 10; i++) { // ѭ������ȷ�����������for
		}
	}
}

class LoopTest4 {
	
	public static void main(String[] args) {
		// �г�100~200����������. Ҫ����ѭ��������i,��ѭ��������j.
		for (int i = 100; i < 200; i++) {
			// ����i������, ���� : ֻ�ܱ�1��������������.
			boolean flag = true;
			// �����Ʒ�, ��2~i-1���ҳ���������, �����Ƿ�������
			for (int j = 2; j < i; j++) {
				if (i % j == 0) { // �ҵ�ĳ��jֵ, ������ʵ����i��j����.
					flag = false; // �Ʒ�����
				}
			}
			if (flag) {//if (i������) {
				System.out.println(i);
			}
		}
	}
	
}



class LoopTest3 {
	
	public static void main(String[] args) {
		// �г�100���ڵ���������
		for (int j = 2; j < 100; j++) {
			// �ж�j�Ƿ������� : ��������ֻ�ܱ�1��������������
			boolean flag = true; // ����j��������.
			// ������֤�Ʒ���, ��2~j-1�������е��������Ƿ�������j, ����ܱ�������j�������� 
			for (int i = 2; i < j; i++) {
				if (j % i == 0) { // ˵��j��ĳ������ֵi������.
					flag = false; // �Ʒ�����, ֤��j��������
				}
			}
			if (flag) { // flag�б����˼���, �����û�б�ˢ��ֵ, ˵�����û���ҵ�����. �����ˢ�¹�, ˵���ҵ��˷���.
				System.out.println(j + "������");
			}
		}
	}
}

class LoopTest2 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		// �ж�n�Ƿ������� : ��������ֻ�ܱ�1��������������
		boolean flag = true; // ����n��������.
		// ������֤�Ʒ���, ��һЩ�������Ƿ�������n, ����ܱ�������n�������� 
		for (int i = 2; i < n; i++) {
			if (n % i == 0) { // ˵��n��ĳ������ֵi������.
				flag = false; // �Ʒ�����, ֤��n��������
			}
		}
		if (flag) { // flag�б����˼���, �����û�б�ˢ��ֵ, ˵�����û���ҵ�����. �����ˢ�¹�, ˵���ҵ��˷���.
			System.out.println(n + "������");
		}
	}
}

/*
��ӡһ���߶�Ϊ5�ĵ���������

				i		�ո�			*
    *			0		4			1
   ***			1		3			3
  *****			2		2			5
 *******		3		1			7
*********		4		0			9 
��ӡ�߶�Ϊn�ĵ���������, ���ɿ��ĵ�.
*/
class LoopTest {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == 2 * i) { // ��һ�л������, ���һ�л����һ��
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}