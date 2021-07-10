package first;

import java.util.Scanner;

/**
 * 문제. 078
 * 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
 * 
 *
 */
public class Exam078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum= 0 ;
		sc.close();
		for(int i=0; i<=n; i++) {
			if(i%2 == 0) {
				sum = sum + i; 
				
			}
			
		}
		System.out.println(sum);
	}

}
