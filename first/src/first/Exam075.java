package first;

import java.util.Scanner;

/**
 * ����. 075
 * ����(1 ~ 100) 1���� �ԷµǾ��� �� ī��Ʈ�ٿ��� ����غ���.
 *
 */
public class Exam075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n!=0) {
			System.out.println(--n);
		}
		sc.close();
	}

}
