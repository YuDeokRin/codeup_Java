package first;

import java.util.Scanner;

/**
 * � ���Ŀ� ���߾� �ð��� �Էµ� ��, �״�� ����ϴ� ������ �غ���.
 * 
 * ����
 * scanf( ) �Լ��� ������ ����(format)�� ���� �Է¹޴� �Լ��̴�.
 * ����, �Է¹ް��� �ϴ� �������� ǥ�����ָ� �ȴ�.
 * 
 * ����
 * scanf("%d:%d", &h, &m); //�ݷ�(:) ��ȣ�� �������� �� ���� �� ������ ����ȴ�.
 *
 */
public class Exam018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String clock = sc.nextLine(); //�� ���� �Է¹���
		String[] arr = clock.split(":"); // " : " �� �������� ���ڿ��� �����Ѵ�
		
		System.out.printf("%s:%s", arr[0], arr[1]); //���� ���ڿ��� ���
		sc.close();
	}

}
