public class CharTest {
	
	public static void main(String[] args) {
		// char��2���ֽڵĴ洢�ռ�, ���汣�����ַ���Unicode����ֵ.
		char c1 = 'a'; // char������������ʹ��''
		// char c2 = 'b' ���, �ҵ��ַ�'b'��Ӧ����ֵ��98, Ȼ���98д��c2
		char c2 = 'b'; 
		char c3 = 'A';
		char c4 = '0';
		char c5 = '��';
		char c6 = '��';
		
		System.out.println(c1);
		// ��ӡc2ʱ, �ᷴ����, ������ֵ98�ҵ���Ӧ���ַ�'b', �ٴ�ӡ.
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);
		System.out.println((int)c5);
		System.out.println((int)c6);
		
		c5 = (char)(c5 + 2300);
		System.out.println(c5);
		
		short s = (short)c5;
		// ��ӡ���������ֵ�Unicode
		// �������+5000, ���һ��.
	}
}