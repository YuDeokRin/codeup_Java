package first;

import java.util.Scanner;

public class Exam011 {

	public static void main(String[] args) {	 
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		/*sc.next().charAt(0) �޼ҵ带 �̿��Ͽ� ���� �ϳ��� �Է¹޴´�.
		 * next() : ù��° ���� �������� ���ڿ��� �Է¹޴´�.
		 * charAt(index) : ���ڿ� �� index ��ȣ�� �´� ���� �ϳ��� ��ȯ�Ѵ�.
		 * �Է¹��� ���ڿ��� ����Ѵ�.
		 * sc.close() : Scanner ��ü�� �̿��� �Է��� ����Ǿ����Ƿ� ��ü�ݱ� 
		 */
		System.out.println(a);
		sc.close();
	}

}