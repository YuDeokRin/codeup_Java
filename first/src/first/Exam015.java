package first;

import java.util.Scanner;

/* 
 ����. 
�Ǽ�(float) 1���� �Է¹޾� ������ ��,
����Ǿ� �ִ� ���� �Ҽ��� �� ° �ڸ����� �ݿø��Ͽ�
�Ҽ��� ���� �� ° �ڸ����� ����Ͻÿ�.

����
%.3f �� ���� �������� �����ϸ�,
�Ҽ��� ���� �� ° �ڸ����� �ݿø��Ͽ� �Ҽ��� ���� �� ° �ڸ����� ����϶�� �ǹ��̴�.
*/
public class Exam015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x  = sc.nextFloat();
		
		System.out.printf("%.2f",x);
		sc.close();
	}

}
