package Foreach2;

import java.util.Scanner;

public class ArrayForeach2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[10];
		
		
		System.out.println("Digite 10 valores:");
		
		for (int i=0; i<num.length; i++) {
			System.out.print("Valor "+(i+1)+": ");
			num[i] = scan.nextInt();
		}
		
		for (int i=0; i<num.length; i++) {
			System.out.println("Divisores de "+num[i]+" (no máximo 10 divisores): ");
			
			for (int j=1; j<=num[i]; j++) {
				if (num[j] % j == 0) {
				 System.out.println(j);
				}
			}
			
		}

	}

}
