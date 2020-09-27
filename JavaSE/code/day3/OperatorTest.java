public class OperatorTest {
	
	public static void main(String[] args) {
		System.out.println(-5%-2);
		
		int a = 8;
		//a = a++;
		a = ++a;
		System.out.println("a : " + a);
		
		for (int i = 0; i < 10; i++) {}
		for (int i = 0; i != 10; ++i) {}
		
		System.out.println(a = 30); // a = 30这个表达式的值就是30
		
		int b, c, d;
		b = c = d = 20;
		
		
		System.out.println(a != b);
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a < b);
		
	}
}