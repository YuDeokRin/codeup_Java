package first;

import java.util.Scanner;

/**
 * ����.064
 * �Էµ� �� ���� a, b, c �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��غ���.
 * ��, ���ǹ��� ������� �ʰ� 3�� ������ ? �� ����Ѵ�.
 *
 */
public class Exam064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		System.out.println((a<b ? a:b)<c ? (a<b ? a:b):c );
	}

}
