public class Variable {
	
	public static void main(String[] args) {
		//1 дһ��Variable�࣬main������ʹ��double��������var1��var2������
		double var1 = 200;
		double var2 = 60;
		
		// 2 �����ַ�������str����str���ӵ���ʽ��ʾ����������̲���ӡ��������
		String str = "" + var1 + '/' + var2 + " = ";
		
		//Ȼ����var2����var1��var2֮�̡�
		var2 = var1 / var2;
		
		str = str + var2;
		
		System.out.println(str);
	}
}