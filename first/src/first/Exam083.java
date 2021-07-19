package code_up_java;

import java.util.Scanner;

public class Exam083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 按眉 积己
		
		System.out.println("伙腊备 伙腊备 ~! : ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i =1; i <= num ; i++ ) {
			if(i%3==0) {
				System.out.println("X");
			}else {
				System.out.printf(i + " ");
			}
		}
				
	}

}
