package code_up_java;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Exam084 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i= 0; i<r; i++) {
			for(int j =0 ; j<g; j++) {
				for(int k=0; k<b; k++) {
					
					String st = i + " " + j + " " + k;
					bf.write(st + "\n");
				}
			}
		}
		bf.write(Integer.toString(r * g * b));
		bf.close();
		
	}

}
