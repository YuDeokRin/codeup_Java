package first;

import java.util.Scanner;

public class Exam036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char num = sc.next().charAt(0); //문자 하나 입력
		sc.close();  // 입력 종료 후 객체 닫기 
		
		//출력 형식에 맞게 출력
		System.out.println((int)num);

	}

}
