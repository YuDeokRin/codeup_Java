package first;

import java.util.Scanner;

/**
 * ����.061
 * �Էµ� ���� �� ���� ��Ʈ������ or ������ �� �� ����� ������ ����غ���.
 * ��Ʈ����(bitwise) ������ |(or, vertical bar, ��Ƽ�ù�)�� ����ϸ� �ȴ�.
 * 
 *
 */
public class Exam061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a|b);
	}

}
