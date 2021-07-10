package first;

import java.util.Scanner;

/**
 * 문제.066
 * 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
 *
 */
public class Exam066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a%2 ==0) { //짝수 인지 홀수 인지 검사 
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		if (b%2 ==0){
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		if(c%2==0){
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}

}
