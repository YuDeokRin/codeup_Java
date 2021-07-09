package first;

import java.util.Scanner;

/* 
 문제. 
실수(float) 1개를 입력받아 저장한 후,
저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여
소수점 이하 둘 째 자리까지 출력하시오.

참고
%.3f 와 같은 형식으로 지정하면,
소수점 이하 넷 째 자리에서 반올림하여 소수점 이하 셋 째 자리까지 출력하라는 의미이다.
*/
public class Exam015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x  = sc.nextFloat();
		
		System.out.printf("%.2f",x);
		sc.close();
	}

}
