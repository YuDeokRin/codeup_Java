package first;

import java.util.Scanner;

public class Exam036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char num = sc.next().charAt(0); //���� �ϳ� �Է�
		sc.close();  // �Է� ���� �� ��ü �ݱ� 
		
		//��� ���Ŀ� �°� ���
		System.out.println((int)num);

	}

}
