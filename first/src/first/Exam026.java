package first;

import java.util.Scanner;

public class Exam026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String date = sc.nextLine();
		sc.close();
		
		String[] arr = date.split(":");
		
		for(int i = 0 ; i < arr.length; i++) {
			String a = arr[i];
			if(i == 1) {
				System.out.println(a);
			}
		}
	}

	
}
