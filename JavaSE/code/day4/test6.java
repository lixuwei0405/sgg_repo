public class test6{
	public static void main(String[] args){
		//�г�100���ڵ���������
		int sum = 0;
		int count  = 0;
		l1: for(int i =2;i<11;i++){
			
			for(int j = 2 ; j<i;j++){
				if(i%j == 0){
					continue l1;
				}
				
			}
			sum += i;
			count ++;
			System.out.println("i="+i);
		}			double a = (double)sum/count;
			System.out.println("��ֵ:"+sum+"ƽ��ֵ"+a);
	}
	
}