package first;

import java.util.Scanner;

public class Exam040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		if(num < -2147483647 || num > 2147483647) {
			
		}else {
			System.out.println(-num);
		}
	}

}
