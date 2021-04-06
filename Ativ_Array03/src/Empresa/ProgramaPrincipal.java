package Empresa;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		System.out.print("    Digite o limite Clientes para ser adicionados: ");
    	int limiteCliente = scan.nextInt();
    	
    	Cliente[] cliente = new Cliente[limiteCliente];
    	ClienteEspecial[] clientesEspeciais = new ClienteEspecial[limiteCliente];
    	ClienteDevedor[] clienteDevedor = new ClienteDevedor[limiteCliente];
		
		do
        {
			
			System.out.println("\n\n\n    *****************************************************");
			System.out.println("    *                   MENU PRINCIPAL                  *");
			System.out.println("    *                                                   *");
			System.out.println("    *                1 - MANTER CLIENTE                 *");
			System.out.println("    *                2 - MANTER CLIENTE ESPECIAIS       *");
			System.out.println("    *                3 - CLIENTES DEVEDORES             *");
			System.out.println("    *                4 - CLIENTES CADASTRADOS           *");
			System.out.println("    *                5 - CLIENTES ESPECIAIS CADASTRADOS *");
			System.out.println("    *                6 - LISTA DE CLIENTES DEVEDORES    *");
			System.out.println("    *****************************************************\n\n");
			
			
			
			System.out.print("\n    Digite a opção desejada no menu:  ");
            int respostaMenu = scan.nextInt();
			
            switch (respostaMenu)
            {
            
            	
            
                case 1:
                	
                	System.out.println("\n\n    ==================================");
                	System.out.println("    ******** CADASTRAR CLIENTE *******");
                	System.out.println("    ==================================\n\n\n");
                	
           
                	
                	
                	for (int i = 0; i < limiteCliente; i++) {
                		
                		cliente[i] = new Cliente();
                		
                		System.out.print("\n    Cadastro: "+i);
						
						System.out.print("\n    Nome: ");
						cliente[i].setNome(scan.nextLine());
						
						System.out.print("\n    CPF: ");
						cliente[i].setCpf(scan.nextInt());
						 
						System.out.print("\n    Telefone: ");
						cliente[i].setTelefone(scan.nextInt());
						 
						
						System.out.println("\n\n    Insira seu Endereço.");
						
						System.out.print("\n    Rua: ");
						cliente[i].setRua(scan.nextLine());
						
						System.out.print("    Bairro: ");
						cliente[i].setBairro(scan.nextLine());
						
						System.out.print("    Número: ");
						cliente[i].setNumero(scan.nextInt());
						
						System.out.print("    Cidade: ");
						cliente[i].setCidade(scan.nextLine());
						
						System.out.print("    Estado: ");
						cliente[i].setEstado(scan.nextLine());
						
						System.out.print("\n    E-mail: ");
						cliente[i].setEmail(scan.nextLine());
						
						System.out.println("\n\n    ******CADASTRO FEITO COM SUCESSO******\n\n\n");
                		
                		
                	}
                	
                	
                	
                	break;
                	
                case 2:
                	
                	System.out.println("\n\n    ============================================");
                	System.out.println("    ******** CADASTRAR CLIENTE ESPECIAIS *******");
                	System.out.println("    ============================================\n\n\n");
                	
                	
                	
                	for (int i = 0; i < limiteCliente; i++) {
                		
                		clientesEspeciais[i] = new ClienteEspecial();
                		
                		System.out.print("\n    Cadastro: "+i);
						
						System.out.print("\n    Nome: ");
						clientesEspeciais[i].setNome(scan.nextLine());
						
						System.out.print("\n    CNPJ: ");
						clientesEspeciais[i].setCnpj(scan.nextInt());
						 
						System.out.print("\n    Telefone: ");
						clientesEspeciais[i].setTelefone(scan.nextInt());
						 
						
						System.out.println("\n\n    Insira seu Endereço.");
						
						System.out.print("\n    Rua: ");
						clientesEspeciais[i].setRua(scan.nextLine());
						
						System.out.print("    Bairro: ");
						clientesEspeciais[i].setBairro(scan.nextLine());
						
						System.out.print("    Número: ");
						clientesEspeciais[i].setNumero(scan.nextInt());
						
						System.out.print("    Cidade: ");
						clientesEspeciais[i].setCidade(scan.nextLine());
						
						System.out.print("    Estado: ");
						clientesEspeciais[i].setEstado(scan.nextLine());
						
						System.out.print("\n    E-mail: ");
						clientesEspeciais[i].setEmail(scan.nextLine());
						
						System.out.println("\n\n    ******CADASTRO FEITO COM SUCESSO******\n\n\n");
                		
                		
                	}
                	
                	
                	
                	break;
                
                	
                case 3:
                	
                	System.out.println("\n\n    ============================================");
                	System.out.println("    ******** CADASTRAR CLIENTE DEVEDORES *******");
                	System.out.println("    ============================================\n\n\n");
                	
                	 	
                	
                	for (int i = 0; i < limiteCliente; i++) {
                		
                		clienteDevedor[i] = new ClienteDevedor();
                		
                		System.out.print("\n    Cadastro: "+i);
						
						System.out.print("\n    Nome: ");
						clienteDevedor[i].setNome(scan.nextLine());
						
						System.out.print("\n    CPF: ");
						clienteDevedor[i].setCpf(scan.nextInt());
						 
						System.out.print("\n    Telefone: ");
						clienteDevedor[i].setTelefone(scan.nextInt());
						 
						
						System.out.println("\n\n    Insira seu Endereço.");
						
						System.out.print("\n    Rua: ");
						clienteDevedor[i].setRua(scan.nextLine());
						
						System.out.print("    Bairro: ");
						clienteDevedor[i].setBairro(scan.nextLine());
						
						System.out.print("    Número: ");
						clienteDevedor[i].setNumero(scan.nextInt());
						
						System.out.print("    Cidade: ");
						clienteDevedor[i].setCidade(scan.nextLine());
						
						System.out.print("    Estado: ");
						clienteDevedor[i].setEstado(scan.nextLine());
						
						System.out.print("\n    E-mail: ");
						clienteDevedor[i].setEmail(scan.nextLine());
						
						System.out.println("\n\n    ******CADASTRO FEITO COM SUCESSO******\n\n\n");
                		
                		
                	}
                	
                	
                	
                	break;
                	
                case 4:
                	
                	System.out.println("\n\n    =====================================");
                	System.out.println("    ******** CLIENTES CADASTRADOS *******");
                	System.out.println("    =====================================\n\n\n");
                	
                	
                	for (int i = 0; i < cliente.length; i++) {
                        System.out.println("\n    Cadastro " + i + "\n");
                        System.out.println("    Nome: " + cliente[i].getNome());
                        System.out.println("    CPF: " + cliente[i].getCpf());
                        System.out.println("    Email: " + cliente[i].getEmail());
                        System.out.println("    Telefone: " + cliente[i].getTelefone());
                        System.out.println("    Endereço.");
                        System.out.println("    Rua: " + cliente[i].getRua());
						System.out.println("    Bairro: " + cliente[i].getBairro());
						System.out.println("    Número: " + cliente[i].getNumero());
						System.out.println("    Cidade: " + cliente[i].getCidade());
						System.out.println("    Estado: " + cliente[i].getEstado());
                    }
                	
                	
                	
                	
                	break;                	
                	
                case 5:
                	
                	System.out.println("\n\n    ===============================================");
                	System.out.println("    ******** CLIENTES ESPECIAIS CADASTRADOS *******");
                	System.out.println("    ===============================================\n\n\n");
                	
                	
                	for (int i = 0; i < cliente.length; i++) {
                        System.out.println("\n    Cadastro " + i + "\n");
                        System.out.println("    Nome: " + clientesEspeciais[i].getNome());
                        System.out.println("    CPF: " + clientesEspeciais[i].getCnpj());
                        System.out.println("    Email: " + clientesEspeciais[i].getEmail());
                        System.out.println("    Telefone: " + clientesEspeciais[i].getTelefone());
                        System.out.println("    Endereço.");
                        System.out.println("    Rua: " + clientesEspeciais[i].getRua());
						System.out.println("    Bairro: " + clientesEspeciais[i].getBairro());
						System.out.println("    Número: " + clientesEspeciais[i].getNumero());
						System.out.println("    Cidade: " + clientesEspeciais[i].getCidade());
						System.out.println("    Estado: " + clientesEspeciais[i].getEstado());
                    }
                	
                	break;                	
                	
                case 6:
                	
                	System.out.println("\n\n    ============================================");
                	System.out.println("    ******** LISTA DE CLIENTES DEVEDORES *******");
                	System.out.println("    ============================================\n\n\n");
                	
                	for (int i = 0; i < cliente.length; i++) {
                        System.out.println("\n    Cadastro " + i + "\n");
                        System.out.println("    Nome: " + cliente[i].getNome());
                        System.out.println("    CPF: " + cliente[i].getCpf());
                        System.out.println("    Email: " + cliente[i].getEmail());
                        System.out.println("    Telefone: " + cliente[i].getTelefone());
                        System.out.println("    Endereço.");
                        System.out.println("    Rua: " + clienteDevedor[i].getRua());
						System.out.println("    Bairro: " + clienteDevedor[i].getBairro());
						System.out.println("    Número: " + clienteDevedor[i].getNumero());
						System.out.println("    Cidade: " + clienteDevedor[i].getCidade());
						System.out.println("    Estado: " + clienteDevedor[i].getEstado());
                    }
                	
                	
                	break;
		
		
		
		
		
		
		
		
            }
		
            System.out.print("\n\n  Digite '1' para voltar ao Menu Principal ou '2' para sair do programa: ");
            menu = scan.nextInt();
        }
        while (menu == 1);
		

	}

}
