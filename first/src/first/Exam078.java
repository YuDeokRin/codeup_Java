package first;

import java.util.Scanner;

/**
 * ����. 078
 * ����(1 ~ 100) 1���� �Է¹޾� 1���� �� ������ ¦���� ���� ���غ���.
 * 
 *
 */
public class Exam078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum= 0 ;
		sc.close();
		for(int i=0; i<=n; i++) {
			if(i%2 == 0) {
				sum = sum + i; 
				
			}
			
		}
		System.out.println(sum);
	}

}
