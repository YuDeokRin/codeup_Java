package first;

import java.util.Scanner;

public class Exam038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		범위 : -1073741824 ~ 1073741824
		System.out.print("첫 번째 정수 입력: ");
		long num1 = sc.nextLong();
		long num2 = 0;
		
		if(num1 < -1073741824 || num1 >1073741824) {
			
		}else {
			System.out.print("두 번째 정수 입력: ");
			num2 = sc.nextLong();
			if(num2 < -1073741824 || num2 > 1073741824) {
				
			}else {
				sc.close();
				
				long sum = num1 + num2; // 합 
				
				System.out.println(sum);
			}
		}
	}

}
