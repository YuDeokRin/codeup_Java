package first;

import java.util.Scanner;

public class Exam080 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt() ;
		int sum = 0; //i�� ���� ������ ����
		int	i = 0; // i : 1, 2, 3, .....ó�� ������ ����
		
		while(sum < num) { //�Է¹��� �������� ���� ���� ���
			i++;
			sum += i;
			
		} 
		System.out.println(i);
		sc.close();
		
	}

}
