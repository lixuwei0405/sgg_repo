// ��ӡ20*8�ľ���, n*m�ľ���.
class LoopExer9 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class LoopExer8 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	
// ��1000���������ܱ�7����������ƽ��ֵ.
class LoopExer7 {
	
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				sum += i;
				count++;	
			}	
		}
		int avg = sum / count;
		System.out.println("�ܱ�7����������ƽ��ֵ : " + avg);
	}	
}

// ʹ��for��ӡ20*8�ľ��κ�n*8�ľ���.
class LoopExer6 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int i = 0; i < n; i++) {
			System.out.println("********");
		}
	}
}

class LoopExer5 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println("********");
		}
	}
}
	
// ��ӡn*8�ľ���.
class LoopExer4 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i = 0;
		do {
			System.out.println("********");
			i++;
		} while (i < n);
	}
	
}

// ��ӡ20*8�ľ���
class LoopExer3 {
	
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println("********");
			i++;
		} while (i < 20);
	}
	
}

class LoopExer2 {
	
	public static void main(String[] args) {
		// ��ӡn*8�ľ���.
		int n = Integer.parseInt(args[0]);
		
		int i = 0; // ��ʼ���
		while (i < n) { // ѭ������
			System.out.println("********"); // ѭ����
			i++; // �������
		}
	}
}

public class LoopExer {
	
	public static void main(String[] args) {
		// ��ӡ20*8�ľ���
		int i = 0; // ��ʼ���
		while (i < 20) { // ѭ������
			System.out.println("********"); // ѭ����
			i++; // �������
		}
	}
}