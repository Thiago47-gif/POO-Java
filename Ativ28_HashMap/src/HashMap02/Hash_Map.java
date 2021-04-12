package HashMap02;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map {

	public static void main(String[] args) {
		
		
				// Instanciando o Scanner para ler os dados do teclado
				Scanner scan = new Scanner(System.in);
				
				// HashMap para armazenar os dados de logins e as senhas
				HashMap<String, Integer> dadosAcesso = new HashMap<String, Integer>();
				
				// Armazendando logins e senhas no HashMap
				dadosAcesso.put("Nathan01", 123);
				dadosAcesso.put("Bianca02", 456);
				dadosAcesso.put("Glayton03", 789);
				dadosAcesso.put("Arthur04", 987);
				dadosAcesso.put("Gabriel05", 654);
				dadosAcesso.put("Yago06", 321);
				dadosAcesso.put("Thiago07", 147);
				dadosAcesso.put("Paola08", 258);
				dadosAcesso.put("Gilberto09", 963);
				dadosAcesso.put("Sophia10", 852);
				
				// Pedindo o login e senha do usuário
				System.out.println("Informe o login: ");
				String login = scan.nextLine();
				System.out.println("\nInforme a senha: ");
				int senha = scan.nextInt();
				
				// Verificando se o login e senha estão cadastrados
				if(dadosAcesso.containsKey(login) && dadosAcesso.containsValue(senha)) {
					System.out.println("\nACESSO CONCEDIDO!!!");
				}
				else {
					System.out.println("\nACESSO NEGADO!!!");
				}
		

	}

}
