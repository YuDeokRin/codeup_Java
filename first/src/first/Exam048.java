package first;

import java.util.Scanner;

public class Exam048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		double num2 = sc.nextDouble();
		sc.close();
		
		int result =   num1 * (int)Math.pow(2, num2);
		System.out.println(result);
		
	}

}
