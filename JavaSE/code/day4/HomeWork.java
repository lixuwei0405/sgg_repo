//��д���򣺽��������������ַ�����ת��Ϊ�����ֱ�������num1��num2��num3�������ǽ�������(ʹ�� if-else if-else),
//���Ҵ�С���������
class Work12 {
	
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		if (num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		if (num2 > num3) {
			int tmp = num2;
			num2 = num3;
			num3 = tmp;
		}
		// ��ʱnum3��λ
		if (num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		// ��ʱnum2��λ
		
		System.out.println(num1 + "," + num2 + "," + num3);
	}
}

class Work1 {
	
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		if (num1 < num2) { // 1 < 2
			if (num2 < num3) { // 1 < 2, 2 < 3
				System.out.println(num1 + "," + num2 + "," + num3);
			} else if (num1 < num3) { // 1 < 2, 3 < 2, 1 < 3
				System.out.println(num1 + "," + num3 + "," + num2);
			} else { // 1 < 2, 3 < 2, 3 < 1 
				System.out.println(num3 + "," + num1 + "," + num2);
			}
		} else { // 2 < 1
			if (num1 < num3) { // 2 < 1, 1 < 3
				System.out.println(num2 + "," + num1 + "," + num3);
			} else if (num2 < num3){ // 2 < 1, 3 < 1, 2 < 3
				System.out.println(num2 + "," + num3 + "," + num1);
			} else { // 2 < 1, 3 < 1, 3 < 2
				System.out.println(num3 + "," + num2 + "," + num1);
			}
		}
	}
	
}

// ���������Ľ���
class Swap {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int t = a; // ������������Ҫ����һ����ͬ���͵���ʱ�ռ�.
		a = b;
		b = t;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}

/*
��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů����
��ȻҪ���һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
�������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
�������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
������������������㣬�򣺡����ޣ���
*/
class Work2 {
	
	public static void main(String[] args) {
		int height = Integer.parseInt(args[0]); // �ѵ�һ�������в���������� 
		int money = Integer.parseInt(args[1]); // �ѵ�һ�������в����������
		boolean handsome = Integer.parseInt(args[2]) == 1;
		if (height > 180 && money > 10000000 && handsome) {
			System.out.println("��һ��Ҫ�޸���");
		} else if (height > 180 || money > 10000000 || handsome) {
			System.out.println("�ްɣ����ϲ��㣬�������ࡣ");
		} else {
			System.out.println("���ޣ�");
		}
	}
}

/*
ʹ�� switch ��Сд���͵� char��תΪ��д��ֻת�� a, b, c, d, e. ��������� ��other����
��ʾ:���������в������ַ�����
char ch = args[0].charAt(0);
*/

class Work32 {
	
	public static void main(String[] args) {
		char ch = args[0].charAt(0);
		String str = "other"; // �����������ͳ�ʼ�����ǰ��
		switch (ch) {
			case 'a' :
			case 'b' :
			case 'c' :
			case 'd' :
			case 'e' :
				char ch2 = (char)(ch - 32);
				str = "" + ch2;
		}
		System.out.println(str);
	}
}

class Work3 {
	
	public static void main(String[] args) {
		char ch = args[0].charAt(0);
		switch (ch) {
			case 'a' :
				System.out.println("A");
				break;
			case 'b' :
				System.out.println("B");
				break;
			case 'c' :
				System.out.println("C");
				break;
			case 'd' :
				System.out.println("D");
				break;
			case 'e' :
				System.out.println("E");
				break;
			default :
				System.out.println("other");
				break;
		}
	}
}


/*
ʹ��switch����, ���ݴ������в�����ȡ���·ݣ���ӡ���·������ļ��ڡ�
3,4,5 ���� 6,7,8 �ļ�  9,10,11 �＾ 12, 1, 2 ����
*/
class Work42 {
	
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		switch (month) {
			default :
				System.out.println("������·ݴ���");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("����");
				break;
			case 3 :	
			case 4 :
			case 5 :
				System.out.println("����");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("�ļ�");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("�＾");
				break;
		}
	}	
}

class Work4 {
	
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		switch (month) {
			case 1 :
				System.out.println("����");
				break;
			case 2 :
				System.out.println("����");
				break;
			case 3 :
				System.out.println("����");
				break;
			case 4 :
				System.out.println("����");
				break;
			case 5 :
				System.out.println("����");
				break;
			case 6 :
				System.out.println("�ļ�");
				break;
			case 7 :
				System.out.println("�ļ�");
				break;
			case 8 :
				System.out.println("�ļ�");
				break;
			case 9 :
				System.out.println("�＾");
				break;
			case 10 :
				System.out.println("�＾");
				break;
			case 11 :
				System.out.println("�＾");
				break;
			case 12 :
				System.out.println("����");
				break;
			default :
				System.out.println("������·ݴ���");
				break;
		}
	}	
}
