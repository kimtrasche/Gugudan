import java.util.Scanner;


public class Gugudan {

	

	
	public static int[] calculate(int times) {
		
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		
		return result;
	}
	
	
	
	
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	/*
	public static void main(String[] args) {

		
		for (int i = 2; i < 10; i++) {
			System.out.println(i+"단 시작.............");
			int[] dan2 = calculate(i);
			print(dan2);
		}
		
		
		int[] result = new int[9];
		
		
		for (int j = 2; j < 10; j++) {
			System.out.println("=="+j+"단 시작..");
			
			for (int i = 0; i < result.length; i++) {
				result[i] = j * (i + 1);
				
			}
			
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("구구단 입력 쿠다사이: " );
//		int number = sc.nextInt();
//		
//		System.out.println("사용자가 입력한 값 : " + number);
//		
//		if (number < 2 || number > 9) {
//			System.out.println("값을 잘못 입력");
//		}else {
//			for(int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//			}	
//		}
		
//		// 6단
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i = i + 1;
//		}
//		
//		// 7단
//		for(int j=0;j<10;j++) {
//			System.out.println(6 * j);
//		}
		
		
		
		
		
//		// 2단
//		System.out.println("2단");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
//		
//		// 3단
//		System.out.println("3단");
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
//
//		// 4단
//		System.out.println("4단");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
//
//		
//		System.out.print("구구단 출력할 값은?");
//
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
	}*/
}
