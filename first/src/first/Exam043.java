package first;

import java.util.Scanner;

public class Exam043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.print("첫 번째 입력된 정수: ");
				int a = sc.nextInt();
				System.out.print("첫 번째 입력된 정수: ");		
				int	b = sc.nextInt();
				
			if(b == 0 ) {
				System.out.println("b는 0이 아닙니다.");
			}else {
				int result = a % b ;
				System.out.println(result);
				continue;
			}
				
			}
		}catch (Exception e) {
			System.out.println("범위 밖의 정수를 입력");
		}
		sc.close();
	}

}
