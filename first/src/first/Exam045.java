package first;

import java.util.Scanner;

public class Exam045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				int num1 = sc.nextInt();
				
				if(num1 >= 0 && num1 <= 2147483647) {//num1이 조건에 참
				
				int num2 = sc.nextInt();
				
				if(num2 >=0 && num2 <= 2147483647 && num2 != 0) {
					int sum = num1 + num2 ;
					int sub = num1 - num2 ;
					int mul = num1 * num2 ;
					int div = num1 / num2 ;
					int mod = num1 % num2 ;
					double result = (double)num1 / num2;
					
					System.out.println(sum);
					System.out.println(sub);
					System.out.println(mul);
					System.out.println(div);
					System.out.println(mod);
					System.out.println(String.format("%.2f", result));
					continue;
				}else {
					
				}
					
				}else {
					
				}
				
			}
			
		}catch (Exception e) {
			
			
		}
		sc.close();
	}

}
