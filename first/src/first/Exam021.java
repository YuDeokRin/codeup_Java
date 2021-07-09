package first;

import java.util.Scanner;

/**
 * 문제.
 * 1개의 단어를 입력받아 그대로 출력해보자.
 *
 */
public class Exam021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		
		System.out.println(word);
		sc.close();
	}

}
