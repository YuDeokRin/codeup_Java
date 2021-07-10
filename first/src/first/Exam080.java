package first;

import java.util.Scanner;

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
