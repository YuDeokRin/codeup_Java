package first;

import java.util.Scanner;

/**
 * �ֹι�ȣ�� ������ ���� �����ȴ�.
 * XXXXXX-XXXXXXX
 * ���� 6�ڸ��� �������(yymmdd)�̰� �� 7�ڸ��� ����, ����, ���������ڵ��̴�.
 *
 * �ֹι�ȣ�� �Է¹޾� ���¸� �ٲ� ����غ���.
 *
 */
public class Exam020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		String[] arr = num.split("-");
		
		for(String a : arr) {
			System.out.print(a);
		}
		
		sc.close();
	}

}
