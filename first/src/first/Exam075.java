package first;

import java.util.Scanner;

/**
 * 문제. 075
 * 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
 *
 */
public class Exam075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n!=0) {
			System.out.println(--n);
		}
		sc.close();
	}

}
