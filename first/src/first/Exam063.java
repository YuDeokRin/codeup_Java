package first;

import java.util.Scanner;
/**
 * ����.063
 * �Էµ� �� ���� a, b �� ū ���� ����ϴ� ���α׷��� �ۼ��غ���.
 * ��, ���ǹ��� ������� �ʰ� 3�� ������ ? �� ����Ѵ�.
 *
 */
public class Exam063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		//a�� b�� ���� �� ���̸� a , �����̸� b�� ���
		System.out.println(a > b ? a : b);
	}

}

