package first;

import java.util.Scanner;

public class Exam038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		���� : -1073741824 ~ 1073741824
		System.out.print("ù ��° ���� �Է�: ");
		long num1 = sc.nextLong();
		long num2 = 0;
		
		if(num1 < -1073741824 || num1 >1073741824) {
			
		}else {
			System.out.print("�� ��° ���� �Է�: ");
			num2 = sc.nextLong();
			if(num2 < -1073741824 || num2 > 1073741824) {
				
			}else {
				sc.close();
				
				long sum = num1 + num2; // �� 
				
				System.out.println(sum);
			}
		}
	}

}
