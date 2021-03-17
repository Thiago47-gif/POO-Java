package br.com.poo.agregacao;

public class FabricaCarroMoto {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(); 
		pessoa.setNome("Alan");
		pessoa.setCpf("45847765233");
		pessoa.setTelefone("31984753515");
		pessoa.setSexo("Masculino");
		pessoa.getFuncionario().setCargo("Vendedor");
		pessoa.getFuncionario().setId("70244");
	}

}
