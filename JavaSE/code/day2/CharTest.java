public class CharTest {
	
	public static void main(String[] args) {
		// char是2个字节的存储空间, 里面保存了字符的Unicode编码值.
		char c1 = 'a'; // char型字面量必须使用''
		// char c2 = 'b' 查表, 找到字符'b'对应的码值是98, 然后把98写入c2
		char c2 = 'b'; 
		char c3 = 'A';
		char c4 = '0';
		char c5 = '我';
		char c6 = '你';
		
		System.out.println(c1);
		// 打印c2时, 会反操作, 根据码值98找到对应的字符'b', 再打印.
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
		// 打印输出你的名字的Unicode
		// 把你的姓+5000, 输出一下.
	}
}