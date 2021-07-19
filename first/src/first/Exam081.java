package code_up_java;

import java.util.Scanner;

public class Exam081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("자연수 2개 입력 : ");
		int n = sc.nextInt();
		
		if(n > 0 && n <= 10) { //n이 범위 안에 있는 경우
			int m = sc.nextInt();
			sc.close();
			if(m > 0 && m <= 10) { //m이 범위 안에 있는 경우
				for(int i =1; i<=n; i++) {
					for(int j =1; j <=m ; j++) {
						System.out.println(i + " " + j);
						
					}
				}
				
			}else { // m이 범위 밖인 경우
				System.out.println("입력 범위를 확인하세요!!");
			}
		}else { //n이 범위 밖인 경우
			System.out.println("입력 범위를 확인하세요!");
		}
				
			
	}

}
