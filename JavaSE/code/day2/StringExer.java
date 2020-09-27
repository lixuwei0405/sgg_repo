public class StringExer {
	
	public static void main(String[] args) {
		// 声明一个字符串String name, int age, char gender, String phone
		// 能用变量的时候, 绝不用常量
		String name = "佟刚";
		int age = 42;
		char gender = '女';
		String phone = "13234234";
		// 再声明一个字符串String info, 使用串接的方式把你的信息串接起来
		String info = "姓名 : " + name + ", 年龄 : " + age + ", 性别 : " + gender + ", 电话 : " + phone;
		// "姓名 : xxx, 年龄 : x, 性别 : x, 电话 : xxxxxx"
		System.out.println(info);
	}
}