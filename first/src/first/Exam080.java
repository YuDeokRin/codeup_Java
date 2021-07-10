package first;

import java.util.Scanner;

/**
 * 문제080.
 * 1, 2, 3 ... 을 계속 더해 나갈 때,
 * 그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
 * 계속 더하는 프로그램을 작성해보자.
 * 
 * 즉, 1부터 n까지 정수를 계속 더한다고 할 때,
 * 어디까지 더해야 입력한 수보다 같거나 커지는지 알아보고자 하는 문제이다.

 */
public class Exam080 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt() ;
		int sum = 0; //i의 합을 저장할 변수
		int	i = 0; // i : 1, 2, 3, .....처럼 증가할 변수
		
		while(sum < num) { //입력받은 정수보다 합이 작을 경우
			i++;
			sum += i;
			
		} 
		System.out.println(i);
		sc.close();
		
	}

}
