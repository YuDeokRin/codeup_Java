package first;

import java.util.Scanner;

/**
 * ����.066
 * �� ���� a, b, c�� �ԷµǾ��� ��, ¦(even)/Ȧ(odd)�� ����غ���.
 *
 */
public class Exam066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a%2 ==0) { //¦�� ���� Ȧ�� ���� �˻� 
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		if (b%2 ==0){
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		if(c%2==0){
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}

}
