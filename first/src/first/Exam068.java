package first;

import java.util.Scanner;

/**
 * ����.068
 * ����(����, 0 ~ 100)�� �Է¹޾� �򰡸� ����غ���.
 *
 */
public class Exam068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		if(a >= 90) {
			System.out.println("A");
		}else if(a >= 70){
			System.out.println("B");
		}else if(a >= 40){
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}

}
