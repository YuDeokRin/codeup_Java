package first;

import java.util.Scanner;

public class Exam042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true ; //while문을 제어하기 위한 변수 
		try {
			while (run) {
//				System.out.println("첫 번째 정수 입력 : ");
				int num1 =sc.nextInt();
				
//				System.out.println("두 번째 정수 입력 : ");
				int num2 = sc.nextInt();
				
				if(num2 ==0) { //num2가 0이면 
//				System.out.println("나누는 수는 0이 될 수 없다.");
				
	
				}else { //num2가 0이 아니면
					int result = num1 / num2;
					System.out.println(result);
					run = false ; //while문 종료
				}
			} //end while문
			
		} catch (Exception e) { // 범위 밖의 값 입력
			System.out.println("범위 밖의 정수를 입력했습니다.");
		}
		sc.close();
	}

}
