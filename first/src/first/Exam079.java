package first;

import java.util.Scanner;

/**
 * 문제.079
 * 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
 * 
 *
 */
public class Exam079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch ;
		while(true) {
			ch = sc.next().charAt(0);
			if(ch == 'q') {
				System.out.println(ch);
				break;	
			}
			System.out.println(ch);
		}
		sc.close();
	}
}
