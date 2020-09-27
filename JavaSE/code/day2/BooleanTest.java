public class BooleanTest {
	
	public static void main(String[] args) {
		// boolean数据类型只允许两个值, true, false
		// boolean占用一个字节, false就是0, true就是1
		boolean b1 = false;;
		boolean b2 = true;
		
		boolean b3 = b2;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		// int无法强制转换为boolean
		//boolean b4 = (boolean)1;
	}
}