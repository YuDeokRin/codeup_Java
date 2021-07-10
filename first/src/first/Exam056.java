package first;

import java.util.Scanner;

public class Exam056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if((a == 1 && b == 0  ) || (a == 0 && b== 1)) { //a와 b의 값이 다른 경우
			System.out.println(1);
		}else { //a와 b의 값이 같은 경우
			System.out.println(0);
		}
		
	}

}
