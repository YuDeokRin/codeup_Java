package first;

import java.util.Scanner;

public class Exam043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.print("ù ��° �Էµ� ����: ");
				int a = sc.nextInt();
				System.out.print("ù ��° �Էµ� ����: ");		
				int	b = sc.nextInt();
				
			if(b == 0 ) {
				System.out.println("b�� 0�� �ƴմϴ�.");
			}else {
				int result = a % b ;
				System.out.println(result);
				continue;
			}
				
			}
		}catch (Exception e) {
			System.out.println("���� ���� ������ �Է�");
		}
		sc.close();
	}

}
