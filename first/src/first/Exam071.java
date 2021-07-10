package first;

import java.util.Scanner;

/**
 * 문제. 071
 * 정수가 순서대로 입력된다.
 * -2147483648 ~ +2147483647, 단 개수는 알 수 없다.
 * 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
 * while( ), for( ), do~while( ) 등의 반복문을 사용할 수 없다.
 */
public class Exam071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num ;
		boolean check = true ;
		
		while(check) {
			num = sc.nextInt();
			
			if(num == 0) {
				check = false ;
			}else {
				System.out.println(num);
				
			}
			
		}
		sc.close();
	}

}
