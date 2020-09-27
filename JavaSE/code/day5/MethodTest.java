/*
	方法 : 隶属于类, 某个独立的功能体, 也称为函数. 
	函数 y = f(x), 其中f是某种运算或处理, x是输入的参数, y是输出的结果.
	x的作用是接收参数值, 在方法中参数值x会经过某种处理产生结果值y, 并返回给使用者.
	
	修饰符 返回值类型 方法名(数据类型1 形参1, 数据类型2 形参2, 数据类型3 形参3,......) {
		语句;
		return 返回值;
	}
	方法 = 方法签名(使用说明书API) + 方法体(实际执行的);
	
	形式参数 : 方法的功能中需要某些数据, 没有数据绝对不行, 不过数据值的大小和功能性无关. 在方法声明时是没有实际值.
	实际参数 : 方法在被调用者调用时, 由调用者传递的实际的数据.
	
	方法调用 : 方法名(实际参数列表); // 实参列表必须和说明书中的形参一致.
	返回值 : 方法调用本身, 返回值接收只有仅有的一次机会. 就是在调用的同时. 错过了就真的错过了.
	
	如果方法没有返回值, 用void表示返回值.
	
	方法和方法之间只允许并列, 不允许嵌套.
	
*/
public class MethodTest {
	
	// 完成两个整数求和
	public static int add(int a, int b) {
		System.out.println("add(int a, int b)...");
		int c = a + b;
		return c;
	}
	
	// 此方法无参无返回
	public static void test() {
		System.out.println("test()....");
	}
	
	public static void main(String[] args) {
		System.out.println("main begin");
		
		int x = add(10, 20); // 10, 20在这里是实参.
		System.out.println(x);
		System.out.println(add(90, 300));
		test(); // 即使是无参方法, 也必须要有()
		//System.out.println(test()); 没有返回值的方法, 不允许打印.
		
		System.out.println("main end");
	}
}