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
		
		System.out.println("Endere�o do Cliente");
		System.out.println(cadastro);
		
		System.out.println("\nDeseja remover o endere�o ? ");
		System.out.println("1 - sim");
		System.out.println("2 - n�o");
		System.out.print("Op��o: ");
		int opcao = scan.nextInt();
		
		if (opcao == 1) {
			System.out.println("\n1 - Remever rua");
			System.out.println("2 - Remever n�mero");
			System.out.println("3 - Remever Cidade");
			System.out.println("4 - Remever estado");
			System.out.print("Op��o: ");
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
			System.out.println("\nEndere�o do Cliente Atualizado");
			System.out.println(cadastro);System.out.println();
			
			
		}
		
		
		
		
		
		
		
		
	}

}
