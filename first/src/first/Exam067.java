package first;

import java.util.Scanner;

/**
 * ����.067
 * ���� 1���� �ԷµǾ��� ��, ��(minus)/��(plus)�� ¦(even)/Ȧ(odd)�� ����غ���.
 *
 */
public class Exam067 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		if(a < 0) { //�Էµ� ������ �����̸�
			System.out.println("minus");
			if(a%2 == 0) { // ������ ������ ¦����
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		
			
		}else if(a > 0 ) {// �Էµ� ������ ����̸� 
			System.out.println("plus");
			if(a%2 == 0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}else { //������ 0�� ��� 
			System.out.println("0�̸� even�� odd�� �ƴմϴ�.");
		}
		
		
	}
}