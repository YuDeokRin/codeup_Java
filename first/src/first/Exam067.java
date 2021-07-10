package first;

import java.util.Scanner;

/**
 * 문제.067
 * 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
 *
 */
public class Exam067 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		if(a < 0) { //입력된 정수가 음수이면
			System.out.println("minus");
			if(a%2 == 0) { // 음수인 정수가 짝수면
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		
			
		}else if(a > 0 ) {// 입력된 정수가 양수이면 
			System.out.println("plus");
			if(a%2 == 0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}else { //정수가 0인 경우 
			System.out.println("0이며 even도 odd도 아닙니다.");
		}
		
		
	}
}