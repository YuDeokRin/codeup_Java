package first;

import java.util.Scanner;

/**
 * ����.62
 * �Էµ� ���� �� ���� ��Ʈ������ xor ������ �� �� ����� ������ ����غ���.
 * ��Ʈ����(bitwise) ������ ^(xor, circumflex/caret, �����÷���/ī��)�� ����ϸ� �ȴ�.
 */
public class Exam062 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a^b);
	}

}
