package first;

import java.util.Scanner;

public class Exam054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a == 1 && b == 1) { // a�� b�Ѵ� 1�� ��� 
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
	}

}
