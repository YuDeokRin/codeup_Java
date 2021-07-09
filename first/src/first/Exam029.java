package first;

import java.util.Scanner;

public class Exam029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double num = sc.nextDouble();
		sc.close();
		
		
		System.out.println(String.format("%.11f", num));
//		System.out.printf("%.11f",num);
	}

}
