package first;

import java.util.Scanner;

/**
 * ����.079
 * 'q'�� �Էµ� ������ �Է��� ���ڸ� ��� ����ϴ� ���α׷��� �ۼ��غ���.
 * 
 *
 */
public class Exam079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch ;
		while(true) {
			ch = sc.next().charAt(0);
			if(ch == 'q') {
				System.out.println(ch);
				break;	
			}
			System.out.println(ch);
		}
		sc.close();
	}
}
