package first;

import java.util.Scanner;

public class Exam010 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);// Scanner 객체 생성
		
		int number = sc.nextInt(); //사용자로부터 입력받기
		System.out.println(number); // 입력받은 값 출력
		sc.close();
	}

}
