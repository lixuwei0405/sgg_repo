public class StringTest {
	
	public static void main(String[] args) {
		// String���ַ��� -> �����⴮, ����������
		String s1 = null; // ��, ��ʾû�ж���
		String s2 = "abc";
		String s3 = ""; // �մ�, ��ʾ�ж���, ����û������.
		// �ַ��� ���Ժ� ����������+������, ����ǲ���һ���µ��ַ���, ���������Ӻ�Ľ��.
		s2 = s2 + 100; // "abc100"
		System.out.println(s2);
		s2 = s2 + 3.22;
		System.out.println(s2);
		char ch = 'A';
		s2 = s2 + ch;
		System.out.println(s2); // "abc1003.22A"
		boolean b = false;
		s2 = s2 + b;
		System.out.println(s2);
		String s4 = s3 + 200;
		System.out.println(s4);
		//String s5 = 582; // "582"
		String s5 = "" + 582; // �ѻ�������ֵ����ַ�����򵥵İ취
		System.out.println(s5);
		
		String s6 = "";
		s6 = s6 + "����" + 200 + 5.8 + "����" + false;
		System.out.println(s6);
		
		//String str1 = 4;        //�ж϶Դ�
		String str2 = 3.5f + "";             //�ж�str2�Դ�
		System.out.println(str2);        //�����
		System.out.println(3+4+"Hello!");      //�����
		System.out.println("Hello!"+3+4);      //�����
		System.out.println('a'+1+"Hello!");    //�����
		System.out.println("Hello"+('a'+1));            //�����

		
	}
}