package first;

import java.util.Scanner;

/**
 * 문제.076
 * 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
 * 
 *
 */
public class Exam076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch  = sc.next().charAt(0);
		char first = 'a';
		do {
			System.out.println(first);
			first++;
			
		}while(first <= ch);
		
		sc.close();
	}

}
