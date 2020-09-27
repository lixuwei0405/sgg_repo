public class RangeTest {
	
	public static void main(String[] args) {
		byte b1 = (byte)0x7F; // 0111 1111
		byte b2 = (byte)0x80; // 1000 0000
		
		short s1 = (short)0x7FFF;
		short s2 = (short)0x8000;
		
		int i1 = 0x7FFFFFFF;
		int i2 = 0x80000000;
		
		long l1 = 0x7FFFFFFFFFFFFFFFL; // 整数字面量默认使用int型
		long l2 = 0x8000000000000000L;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(l1);
		System.out.println(l2);
		
		char c1 = 0xFFFF;
		System.out.println((int)c1);
		
		short s3 = (short)c1;
		System.out.println(s3);
	} 
}