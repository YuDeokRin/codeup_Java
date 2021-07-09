package first;

import java.util.Scanner;

public class Exam027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String date = sc.nextLine();
		sc.close();
		
		String[] arr = date.split("\\.");
		int[] parsingArr = new int[arr.length];
	
		for(int i=0 ; i < arr.length; i++) {
			parsingArr[i] = Integer.parseInt(arr[i]); //정수형으로 변환
		}
		
		System.out.printf("%02d-%02d-%04d", parsingArr[2], parsingArr[1],parsingArr[0]);
	}

}
