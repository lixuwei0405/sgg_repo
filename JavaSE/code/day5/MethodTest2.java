public class MethodTest2 {
	
	public static int add(int a, int b) {
		System.out.println("add(int a, int b)");
		
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("main begin");
		
		add(10, 20);
		
		System.out.println("main end");
	}
}