public class StringTest {
	
	public static void main(String[] args) {
		// String是字符串 -> 像羊肉串, 是引用类型
		String s1 = null; // 空, 表示没有对象
		String s2 = "abc";
		String s3 = ""; // 空串, 表示有对象, 但是没有内容.
		// 字符串 可以和 任意数据用+号连接, 结果是产生一个新的字符串, 内容是连接后的结果.
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
		String s5 = "" + 582; // 把基本数据值变成字符串最简单的办法
		System.out.println(s5);
		
		String s6 = "";
		s6 = s6 + "张三" + 200 + 5.8 + "李四" + false;
		System.out.println(s6);
		
		//String str1 = 4;        //判断对错：
		String str2 = 3.5f + "";             //判断str2对错：
		System.out.println(str2);        //输出：
		System.out.println(3+4+"Hello!");      //输出：
		System.out.println("Hello!"+3+4);      //输出：
		System.out.println('a'+1+"Hello!");    //输出：
		System.out.println("Hello"+('a'+1));            //输出：

		
	}
}