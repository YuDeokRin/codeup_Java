package first;

import java.util.Scanner;

public class Exam039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		범위 : -2147483648 ~ 2147483648
//		System.out.print("첫 번째 정수 입력: ");
		long num1 = sc.nextLong();
		long num2 = 0;

		if(num1 < -2147483648L || num1 > 2147483648L) {
			
		}else {
			num2 =sc.nextLong();
			if(num2 < -2147483648L || num2 > 2147483648L) {
				
			}else {
				sc.close();
				
				long sum = num1 + num2 ;
				
				System.out.println(sum);
			}
					
		}
	}

}
