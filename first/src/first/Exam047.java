package first;

import java.util.Scanner;

public class Exam047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		num = num << 1; //��Ʈ ����Ʈ ������
		
		System.out.println(num);
	}

}
