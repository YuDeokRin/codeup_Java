package first;

import java.util.Scanner;

public class Exam056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if((a == 1 && b == 0  ) || (a == 0 && b== 1)) { //a�� b�� ���� �ٸ� ���
			System.out.println(1);
		}else { //a�� b�� ���� ���� ���
			System.out.println(0);
		}
		
	}

}
