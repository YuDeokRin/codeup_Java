package first;

import java.util.Scanner;

public class Exam054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a == 1 && b == 1) { // a와 b둘다 1인 경우 
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
	}

}
