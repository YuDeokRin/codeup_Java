package first;

import java.util.Scanner;

public class Exam011 {

	public static void main(String[] args) {	 
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		/*sc.next().charAt(0) 메소드를 이용하여 문자 하나를 입력받는다.
		 * next() : 첫번째 공백 전까지의 문자열을 입력받는다.
		 * charAt(index) : 문자열 중 index 번호에 맞는 문자 하나를 반환한다.
		 * 입력받은 문자열을 출력한다.
		 * sc.close() : Scanner 객체를 이용한 입력이 종료되었으므로 객체닫기 
		 */
		System.out.println(a);
		sc.close();
	}

}