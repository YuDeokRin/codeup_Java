package first;

import java.util.Scanner;

public class Exam035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(16);
		sc.close();
		
		System.out.printf("%o", num);

	}

}
