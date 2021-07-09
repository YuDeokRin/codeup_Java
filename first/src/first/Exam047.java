package first;

import java.util.Scanner;

public class Exam047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		num = num << 1; //비트 시프트 연산자
		
		System.out.println(num);
	}

}
