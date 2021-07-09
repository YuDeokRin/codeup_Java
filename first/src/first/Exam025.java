package first;

import java.util.Scanner;

/**
 * 문제.
 * 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
 *
 */
public class Exam025 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		int first = (num / 10000) * 10000;
		System.out.println("["+first+"]");
		int second = (num - first) / 1000 * 1000;
		System.out.println("["+second+"]");
		int third = (num - first - second) / 100 * 100;
		System.out.println("["+third+"]");				
		int forth = (num - first - second - third) / 10 * 10;
		System.out.println("["+forth+"]");
		int fifth = (num - first - second - third - forth );
		System.out.println("["+fifth+"]");
		
	}

}

