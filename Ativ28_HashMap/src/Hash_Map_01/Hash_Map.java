package Hash_Map_01;

//Importar a classe HashMap
import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		
		// Criação de um objeto HashMap chamado pessoa
		HashMap<String, Integer> pessoa = new HashMap<String, Integer>();
		
		// Adicione chaves e valores (nome, idade)
		pessoa.put("Adriano", 70);
		pessoa.put("Maria", 41);
		pessoa.put("João", 24);
		pessoa.put("Felipe", 30);
		pessoa.put("Julia", 13);
		
		//Para acessar um item
		pessoa.get("Felipe");
		
		//Para remover um item
		pessoa.remove("Adriano", 70);
		
		//Para descobrir quantos itens existem
		System.out.println("Tamanho do HashMap: "+pessoa.size());
		
		// Imprimir chaves e valores
		for (String i : pessoa.keySet()) {
			System.out.println("Chaves: " + i + "| Valores: " + pessoa.get(i));
		}
		
		//Para remover todos os itens
		pessoa.clear();
		
		
		
		
		
		
		
	}

}
