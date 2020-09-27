public class BinaryTest {
	
	public static void main(String[] args) {
		int n = 0x3F;
		System.out.println(n << 2); // 0000 0000 0000 0000 0000 0000 1111 1100
		
		System.out.println(n >> 1); // 0001 1111 => 0x1F => 31
		
		System.out.println(n >>> 1);
		
		System.out.println(-1 >> 3);
		System.out.println(-1 >>> 1);
		
		int v1 = 0x9C;
		int v2 = 0x7A;
		
		// 1001 1100&
		// 0111 1010=
		// 0001 1000 => 0x18 => 24
		System.out.println(v1 & v2);
		// 1001 1100|
		// 0111 1010=
		// 1111 1110 => 0xFE => 15*16+14
		System.out.println(v1 | v2);
		
		// 1001 1100^
		// 0111 1010=
		// 1110 0110 => 0xE6 => 14*16+6 => 230
		System.out.println(v1 ^ v2);
		
		// 0000 0000 0000 0000 0000 0000 1001 1100
		// 1111 1111 1111 1111 1111 1111 0110 0011=> 是一个负数, 负多少?
		// -1 	1111 1111 1111 1111 1111 1111 0110 0010
		// 取反 	0000 0000 0000 0000 0000 0000 1001 1101 => 0x9D => 16*9 + 13 => 157
		System.out.println(~v1); // 单目运行. -157
		
	}
	
}