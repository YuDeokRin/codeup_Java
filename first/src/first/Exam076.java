package first;

import java.util.Scanner;

/**
 * ����.076
 * ������(a ~ z) 1���� �ԷµǾ��� �� �� ���ڱ����� ���ĺ��� ������� ����غ���.
 * 
 *
 */
public class Exam076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch  = sc.next().charAt(0);
		char first = 'a';
		do {
			System.out.println(first);
			first++;
			
		}while(first <= ch);
		
		sc.close();
	}

}
