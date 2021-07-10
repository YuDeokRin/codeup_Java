package first;

import java.util.Scanner;

/**
 * 문제. 077
 * 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
 *
 */
public class Exam077 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		for(int i =0; i <= n; i++ ) {
			
			System.out.println(i);
		}
	}

}
