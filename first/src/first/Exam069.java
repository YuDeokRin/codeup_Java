package first;

import java.util.Scanner;

/**
 * ����.069
 * �򰡸� ����(A, B, C, D, ...)�� �Է¹޾� ������ �ٸ��� ����غ���.
 * �� ����
 * �� : ����
 * A : best!!!
 * B : good!!
 * C : run!
 * D : slowly~
 * ������ ���ڵ� : what?
 */
public class Exam069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		sc.close();
		
		switch(a) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}
	}

}
