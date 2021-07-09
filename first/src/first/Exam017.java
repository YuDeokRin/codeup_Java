package first;

import java.util.Scanner;

/*
 * int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
 *참고
 *printf("%d %d %d", a, a, a); 와 같은 방법으로 출력할 수 있다.
 */
public class Exam017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d %d %d", a,a,a);
		sc.close();
	}

}
