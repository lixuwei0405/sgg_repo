public class VariableTest3 {
	
	public static void main(String[] args) {
		byte b1 = 20;
		short s1 = 30;
		int i1 = 40;
		long l1 = 50;
		
		b1 = 30; // ��Ϊ�����ǳ���, 30����Զ����, ����b1�в��������
		//b1 = s1; // ��Ϊ�����Ǳ���, �����е�ֵ�������޷�ȷ��, ����b1�о��п��ܳ�����.
		
		// �����long����������, �������int��
		//s1 = b1 + s1;
		s1 = (short)(b1 + s1);
		
		float f = 3.2F;
		
		i1 = s1 + i1;
		//i1 = l1 + b1; ���������, �������������ȡ�������з�Χ�����Ǹ�.
		i1 = (int)(l1 + b1);
		i1 = (int)l1 + b1;
		
		//l1 = f + s1;
		l1 = (long)(f + s1);
	}
}