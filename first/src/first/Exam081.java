package code_up_java;

import java.util.Scanner;

public class Exam081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner ��ü ����
		
		System.out.println("�ڿ��� 2�� �Է� : ");
		int n = sc.nextInt();
		
		if(n > 0 && n <= 10) { //n�� ���� �ȿ� �ִ� ���
			int m = sc.nextInt();
			sc.close();
			if(m > 0 && m <= 10) { //m�� ���� �ȿ� �ִ� ���
				for(int i =1; i<=n; i++) {
					for(int j =1; j <=m ; j++) {
						System.out.println(i + " " + j);
						
					}
				}
				
			}else { // m�� ���� ���� ���
				System.out.println("�Է� ������ Ȯ���ϼ���!!");
			}
		}else { //n�� ���� ���� ���
			System.out.println("�Է� ������ Ȯ���ϼ���!");
		}
				
			
	}

}
