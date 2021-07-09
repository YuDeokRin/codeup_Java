package first;

import java.util.Scanner;

/**
 * 단어를 1개 입력받는다.
 * 입력받은 단어(영어)의 각 문자를
 * 한줄에 한 문자씩 분리해 출력한다.
 *
 */
public class Exam024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		sc.close();
		
		char[] arr = new char[word.length()]; //문자배열 생성 
		
		for(int i = 0; i < word.length(); i++) {
			arr[i] = word.charAt(i);
			
		}
		
	for(char c : arr) {
		System.out.println("'"+ c +"'");
		}
	}

}
