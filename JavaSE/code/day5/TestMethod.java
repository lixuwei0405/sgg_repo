public class TestMethod {
	
	//��д����,����һ����TestMethod������������һ��method�������ڷ����д�ӡһ��20*8�ľ��Σ�
	//��main�����е��ø÷�����
	public static void method() {
		// ��ӡ20 * 8�ľ���
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//����һ����ϰ�е�TestMethod����������һ������method1���ڷ����д�ӡһ��n*m�ľ��Σ�
	//���ڷ��������󷵻ؾ����ܳ�, ��main�����е��ø÷���, ����ӡ�ܳ�.
	public static int method1(int n, int m) {
		// ��ӡn * m�ľ���
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int l = 2 * (m + n);
		return l;
	}

	public static void main(String[] args) {
		method();
		
		int a = method1(5, 20);
		System.out.println("�����ܳ� : " + a);
	}
}