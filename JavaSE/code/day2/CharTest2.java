public class CharTest2 {
	
	public static void main(String[] args) {
		// 无法使用字面量的字符必须使用转义 
		char c1 = '\t'; // 制表符
		char c2 = '\r'; // 回车 码值是13
		char c3 = '\n'; // 换行 码值是10
		char c4 = ' ';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		System.out.println("abc\txxx\tyyy");
		
	}
}