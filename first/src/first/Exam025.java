package first;

import java.util.Scanner;

/**
 * ����.
 * �ټ� �ڸ��� ���� 1���� �Է¹޾� �� �ڸ����� ������ ����Ѵ�.
 *
 */
public class Exam025 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		int first = (num / 10000) * 10000;
		System.out.println("["+first+"]");
		int second = (num - first) / 1000 * 1000;
		System.out.println("["+second+"]");
		int third = (num - first - second) / 100 * 100;
		System.out.println("["+third+"]");				
		int forth = (num - first - second - third) / 10 * 10;
		System.out.println("["+forth+"]");
		int fifth = (num - first - second - third - forth );
		System.out.println("["+fifth+"]");
		
	}

}

