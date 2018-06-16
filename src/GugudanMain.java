import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {


		// 8   2* 1   ~~   8 * 8 까지

		// 19    2* 1   ~ 19 * 19 단까지

		// 8,7    2 * 1 ~~ 8  * 7

		
		
		System.out.print("입력값 : ");
		
		
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.next(); 
		
		String[] arry = inputValue.split(",");
		
		int inputValue1=0;
		int inputValue2=0;
		
		if(arry.length==2) {
			inputValue1 = Integer.parseInt(arry[0]);
			inputValue2 = Integer.parseInt(arry[1]);
		}else {
			inputValue1 = Integer.parseInt(arry[0]);
			inputValue2 = inputValue1;
		}
		
		
		for (int startDan = 2; startDan <= inputValue1; startDan++) {
			for (int i = 0; i < inputValue2; i++) {
				if (inputValue1 > i) {
					int d1 = startDan;
					int d2 = (i + 1);
					int result = startDan * (i + 1);
					System.out.println(d1 + " X " + d2 + " = " + result);
				}
			}
		}
		/*
		for (int i = 2; i < 10; i++) {
			System.out.println(i+"단 시작.............");
			int[] dan2 = Gugudan.calculate(i);
			Gugudan.print(dan2);
		}
		*/
		/*Gugudan.calculateEx("5,6,7");
		Gugudan.calculateEx("5,6");
		Gugudan.calculateEx("6,");
		Gugudan.calculateEx("8");
		Gugudan.calculateEx("");*/
		
	}
}
	


