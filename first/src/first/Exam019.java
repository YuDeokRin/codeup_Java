package first;

import java.util.Iterator;
import java.util.Scanner;

/**
 * ����
 * ��, ��, ���� �Է¹޾� ������ �������� ����ϴ� ������ �غ���.
 *
 */
public class Exam019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String clock = sc.nextLine();
		String[] arr = clock.split("\\.");
		
		int[] arr2 = new int[arr.length]; // ���ڿ��� ���̸�ŭ ���� �迭 ����
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.printf("%04d.%02d.%02d", arr2[0], arr2[1], arr2[2]);
		sc.close();
		
		
	}

}
