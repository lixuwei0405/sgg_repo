//编写程序：接收四个命令行字符串并转换为整数分别存入变量num1、num2、num3, num4，对它们进行排序并且从小到大输出。
class Work12 {
	
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int num4 = Integer.parseInt(args[3]);
		
		int t = 0;
		
		if(num1>num2){
			 t = num1;
			 num1 = num2;
			 num2 = t;	
		}
		
		if(num1>num3){
			t = num1;
			num1 = num3;
			num3 = t;
		}
		
		if(num1>num4){
			t = num1;
			num1 = num4;
			num4 = t;			
		}
		
		if(num2>num3){
			t = num2;
			num2 = num3;
			num3 = t;			
		}
		
		if(num2>num4){
			t = num2;
			num2 = num4;
			num4 = t;			
		}
		
		if(num3>num4){
			t = num3;
			num3 = num4;
			num4 = t;			
		}
	}
}

class Work1 {
	
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int num4 = Integer.parseInt(args[3]);
		
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
		if (num3 > num4) {
			int tmp = num3;
			num3 = num4;
			num4 = tmp;
		}
		
		// n4中保存的是最大值
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
		
		// n3中保存的是次大值
		
		if (num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		System.out.println(num1 + "," + num2 + "," + num3 + "," + num4);
		
	}
}



/*
接收命令行参数年、月、日，判断这一天是当年的第几天
 
   注：判断一年是否是闰年的标准：
       1）可以被4整除，但不可被100整除
       2）可以被400整除
*/
class Work3 {
	
	public static void main(String[] args) {
		// 2020 9 27
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int day = Integer.parseInt(args[2]);
		
		int days = day;
		switch (month) {
			case 12 :
				days += 30;
			case 11 :
				days += 31;
			case 10 :
				days += 30;
			case 9 :
				days += 31;
			case 8 :
				days += 31;
			case 7 :
				days += 30;
			case 6 :
				days += 31;
			case 5 :
				days += 30;
			case 4 :
				days += 31;
			case 3 :
				days += 28;
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					days++;
				}
			case 2 :
				days += 31;
		}
		System.out.println("经过了" + days + "天");
	}
}

class Work2 {
	
	public static void main(String[] args) {
		// 2020 9 27
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int day = Integer.parseInt(args[2]);
		
		int days = day;
		switch (month) {
			case 2 : 
				days += 31;
				break;
			case 3 : 
				days += 31 + 28;
				break;
			case 4 : 
				days += 31 + 28 + 31;
				break;
			case 5 : 
				days += 31 + 28 + 31 + 30;
				break;
			case 6 : 
				days += 31 + 28 + 31 + 30 + 31;
				break;
			case 7 : 
				days += 31 + 28 + 31 + 30 + 31 + 30;
				break;
			case 8 : 
				days += 31 + 28 + 31 + 30 + 31 + 30 + 31;
				break;
			case 9 : 
				days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 10 : 
				days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 11 : 
				days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 12 :  
				days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
		}
		if (month > 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				days++;
			}
		}
		System.out.println("经过了" + days + "天");
	}
}
