// 注释 : 解释性文字, 不参与程序的执行, 作用就是说明程序的含义和作用及注意点. 编译时编译器会把注释全部丢弃
// 这是单行注释, 只注释当前行
/* 
	这也是注释, 这是多行注释
	可以随便写
	再来一行
	又一行
	多行注释不可以嵌套
 */

/*
	public是公共的 形容类
	class 是类
	Hello 是类的名称 
	{}用于表示一个范围, 也称为一个块.
	类名后面的一对{}及其中的内容称为类体(body)
	public class Hello称为类签名(类头Head)
	
	类 : java程序的基本单位.
	
	主类 : 包含入口方法的类
	公共类 : 被public修饰的类
*/
public class Hello {
	
	/*
		static是静态的
		void是空的, 表示无返回值
		main是方法名
		(String[] args) 称为方法的参数.
		
		参数后面一对{}及其中的内容称为方法体(body)
		public static void main(String[] args) 称为方法签名
		方法 = 方法签名 + 方法体
		
		方法 : java程序中的独立的功能单位, 方法不可以嵌套.
	*/
	public static void main(String[] args) { // 称为主方法, 也称为入口方法
		// println是在屏幕上打印一行内容, 称为语句
		// 语句 : java程序中的最小执行单位. 语句必须以;结尾
		System.out.println("只有这里面可以随便写, 你好, 我来了, 准备受死吧......");
		System.out.println("我也是语句"); 
		System.out.println("我是语句3");
		System.out.println("我是语句4");
		System.out.println("我是语句5");
		System.out.println("我是语句6");
		System.out.println("我是语句7");
	}
	
	public static void test() { // 这是普通方法, 不是入口
		System.out.println("我是test方法的语句");
	}
	
	/* 方法不可以重复定义声明
	public static void main(String[] args) {
		System.out.println("main 2");
	}*/
	
}

// 非主类, 非主类不能执行, 因为它没有入口.
// 非公共类
class Hello2 {
	
	public static void test2() {
		System.out.println("hello2 test2....");
	}
	
}

// 主类
// 非公共类
class Hello3 {
	
	public static void main(String[] args) {
		System.out.println("Hello3 main....");
	}
}