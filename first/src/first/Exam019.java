package first;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 문제
 * 년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
 *
 */
public class Exam019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String clock = sc.nextLine();
		String[] arr = clock.split("\\.");
		
		int[] arr2 = new int[arr.length]; // 문자열의 길이만큼 정수 배열 선언
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.printf("%04d.%02d.%02d", arr2[0], arr2[1], arr2[2]);
		sc.close();
		
		
	}

}
