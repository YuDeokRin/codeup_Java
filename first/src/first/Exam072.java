package first;

import java.util.Scanner;

/**
 * ����.072
 * n���� ������ ������� �Էµȴ�.
 * -2147483648 ~ +2147483647, �� n�� �ִ� ������ �� �� ����.
 * n���� �Էµ� ������ ������� ����غ���.
 * while( ), for( ), do~while( ) ���� �ݺ����� ����� �� ����.

 */
public class Exam072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int num; 
		for(int i = 0 ; i <count; i++) {
			num = sc.nextInt();
			System.out.println(num);
		}
		sc.close();
		
	}

}
