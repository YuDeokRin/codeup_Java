package first;

import java.util.Scanner;

/**
 * �ܾ 1�� �Է¹޴´�.
 * �Է¹��� �ܾ�(����)�� �� ���ڸ�
 * ���ٿ� �� ���ھ� �и��� ����Ѵ�.
 *
 */
public class Exam024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		sc.close();
		
		char[] arr = new char[word.length()]; //���ڹ迭 ���� 
		
		for(int i = 0; i < word.length(); i++) {
			arr[i] = word.charAt(i);
			
		}
		
	for(char c : arr) {
		System.out.println("'"+ c +"'");
		}
	}

}
