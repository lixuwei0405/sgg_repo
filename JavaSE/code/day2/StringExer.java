public class StringExer {
	
	public static void main(String[] args) {
		// ����һ���ַ���String name, int age, char gender, String phone
		// ���ñ�����ʱ��, �����ó���
		String name = "١��";
		int age = 42;
		char gender = 'Ů';
		String phone = "13234234";
		// ������һ���ַ���String info, ʹ�ô��ӵķ�ʽ�������Ϣ��������
		String info = "���� : " + name + ", ���� : " + age + ", �Ա� : " + gender + ", �绰 : " + phone;
		// "���� : xxx, ���� : x, �Ա� : x, �绰 : xxxxxx"
		System.out.println(info);
	}
}