// ע�� : ����������, ����������ִ��, ���þ���˵������ĺ�������ü�ע���. ����ʱ���������ע��ȫ������
// ���ǵ���ע��, ֻע�͵�ǰ��
/* 
	��Ҳ��ע��, ���Ƕ���ע��
	�������д
	����һ��
	��һ��
	����ע�Ͳ�����Ƕ��
 */

/*
	public�ǹ����� ������
	class ����
	Hello ��������� 
	{}���ڱ�ʾһ����Χ, Ҳ��Ϊһ����.
	���������һ��{}�����е����ݳ�Ϊ����(body)
	public class Hello��Ϊ��ǩ��(��ͷHead)
	
	�� : java����Ļ�����λ.
	
	���� : ������ڷ�������
	������ : ��public���ε���
*/
public class Hello {
	
	/*
		static�Ǿ�̬��
		void�ǿյ�, ��ʾ�޷���ֵ
		main�Ƿ�����
		(String[] args) ��Ϊ�����Ĳ���.
		
		��������һ��{}�����е����ݳ�Ϊ������(body)
		public static void main(String[] args) ��Ϊ����ǩ��
		���� = ����ǩ�� + ������
		
		���� : java�����еĶ����Ĺ��ܵ�λ, ����������Ƕ��.
	*/
	public static void main(String[] args) { // ��Ϊ������, Ҳ��Ϊ��ڷ���
		// println������Ļ�ϴ�ӡһ������, ��Ϊ���
		// ��� : java�����е���Сִ�е�λ. ��������;��β
		System.out.println("ֻ��������������д, ���, ������, ׼��������......");
		System.out.println("��Ҳ�����"); 
		System.out.println("�������3");
		System.out.println("�������4");
		System.out.println("�������5");
		System.out.println("�������6");
		System.out.println("�������7");
	}
	
	public static void test() { // ������ͨ����, �������
		System.out.println("����test���������");
	}
	
	/* �����������ظ���������
	public static void main(String[] args) {
		System.out.println("main 2");
	}*/
	
}

// ������, �����಻��ִ��, ��Ϊ��û�����.
// �ǹ�����
class Hello2 {
	
	public static void test2() {
		System.out.println("hello2 test2....");
	}
	
}

// ����
// �ǹ�����
class Hello3 {
	
	public static void main(String[] args) {
		System.out.println("Hello3 main....");
	}
}