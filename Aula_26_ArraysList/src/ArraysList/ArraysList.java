package ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList {

	public static void main(String[] args) {
		
		ArrayList<String> cadastro = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		cadastro.add("Adryan");
		cadastro.add("Rua Engenho do Sol");
		cadastro.add("544");
		cadastro.add("Belo Horizonte");
		cadastro.add("Minas Gerais");
		
		System.out.println("Endereço do Cliente");
		System.out.println(cadastro);
		
		System.out.println("\nDeseja remover o endereço ? ");
		System.out.println("1 - sim");
		System.out.println("2 - não");
		System.out.print("Opção: ");
		int opcao = scan.nextInt();
		
		if (opcao == 1) {
			System.out.println("\n1 - Remever rua");
			System.out.println("2 - Remever número");
			System.out.println("3 - Remever Cidade");
			System.out.println("4 - Remever estado");
			System.out.print("Opção: ");
			int opcao2 = scan.nextInt();
			
			switch (opcao2) {
			case 1:
				System.out.println("\n"+cadastro.get(1)+" foi removido");
				cadastro.remove(1);
				break;
			case 2:
				System.out.println("\n"+cadastro.get(2)+" foi removido");
				cadastro.remove(2);
				break;
			case 3:
				System.out.println("\n"+cadastro.get(3)+" foi removido");
				cadastro.remove(3);
				break;
			case 4:
				System.out.println("\n"+cadastro.get(4)+" foi removido");
				cadastro.remove(4);
				break;
			}
			System.out.println("\nEndereço do Cliente Atualizado");
			System.out.println(cadastro);System.out.println();
			
			
		}
		
		
		
		
		
		
		
		
	}

}
