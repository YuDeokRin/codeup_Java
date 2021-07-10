package first;

import java.util.Scanner;

public class Exam046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			sc.close();
			
			int sum = num1+num2+num3;
			double avg = (double)sum/3;
			
			System.out.println(sum);
			System.out.println(String.format("%.1f", avg));
		}catch (Exception e) { //int 형 범위 밖 
//			System.out.println("범위 안의 정수를 입력 : "+e.toString());
		}
	}

}
