package first;

import java.util.Scanner;

public class Exam042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true ; //while���� �����ϱ� ���� ���� 
		try {
			while (run) {
//				System.out.println("ù ��° ���� �Է� : ");
				int num1 =sc.nextInt();
				
//				System.out.println("�� ��° ���� �Է� : ");
				int num2 = sc.nextInt();
				
				if(num2 ==0) { //num2�� 0�̸� 
//				System.out.println("������ ���� 0�� �� �� ����.");
				
	
				}else { //num2�� 0�� �ƴϸ�
					int result = num1 / num2;
					System.out.println(result);
					run = false ; //while�� ����
				}
			} //end while��
			
		} catch (Exception e) { // ���� ���� �� �Է�
			System.out.println("���� ���� ������ �Է��߽��ϴ�.");
		}
		sc.close();
	}

}
