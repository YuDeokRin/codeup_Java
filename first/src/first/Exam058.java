package first;

import java.util.Scanner;

public class Exam058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a == 0 && b ==0){ //a , b 둘 다 거짓일 경우 
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
