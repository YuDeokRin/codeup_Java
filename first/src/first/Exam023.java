package first;

import java.util.Scanner;

public class Exam023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		sc.close();
		
		String[] arr = String.valueOf(num).split("\\.");
		
		for(String a : arr) {
			System.out.println(a);
		}
		
	}

}
