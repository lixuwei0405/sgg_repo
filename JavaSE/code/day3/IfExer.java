public class IfExer {
	
	public static void main(String[] args) {
		/*�������в�������С������ĩ�ɼ���
		���ɼ�Ϊ100��ʱ������һ��BMW��
		���ɼ�Ϊ(80��99]ʱ������һ̨iphone12��
		���ɼ�Ϊ[60,80]ʱ������һ���ο��飻
		����ʱ��ʲô����Ҳû�С�
		��ʾ: �������в�����ȡ�����Ĵ���:
		int score = Integer.parseInt(args[0]);*/
		
		int score = Integer.parseInt(args[0]); 
		if (score < 0 || score > 100) {
			System.out.println("������ķ������Ϸ�!");
		} else {
			if (score == 100) {
				System.out.println("����һ��BMW");
			} else if (score > 80 && score <= 99) {
				System.out.println("����һ̨iphone12");
			} else if (score >= 60 && score <= 80) {
				System.out.println("����һ���ο���");
			} else {
				System.out.println("ʲô����Ҳû��");
			}
		}
	}
	
}