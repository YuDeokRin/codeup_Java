package first;

import java.util.Scanner;

/**
 * ����.060
 * �Էµ� ���� �� ���� ��Ʈ������ and ������ �� �� ����� ������ ����غ���.
 * ��Ʈ����(bitwise)������ &�� ����ϸ� �ȴ�.(and, ampersand, ���ۼ����� �д´�.)
 *
 */
public class Exam060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a&b);
		
	}

}
