package first;

import java.util.Scanner;

/**
 * ����. 071
 * ������ ������� �Էµȴ�.
 * -2147483648 ~ +2147483647, �� ������ �� �� ����.
 * 0�� �ƴϸ� �Էµ� ������ ����ϰ�, 0�� �ԷµǸ� ����� �ߴ��غ���.
 * while( ), for( ), do~while( ) ���� �ݺ����� ����� �� ����.
 */
public class Exam071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num ;
		boolean check = true ;
		
		while(check) {
			num = sc.nextInt();
			
			if(num == 0) {
				check = false ;
			}else {
				System.out.println(num);
				
			}
			
		}
		sc.close();
	}

}
