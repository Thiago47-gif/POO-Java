package atividade11;

public class Fabrica {
	public static void main(String[] args) {
		
		Carro carro01;
		carro01 = new Carro();
		
		//Salvando informações
		carro01.setCor("Azul");
		carro01.setAno("2011");
		//Salvar as demais informações
		
		//Pegando as informações para imprimir
		System.out.println("Dados do Carro:");
		System.out.println("Cor: " + carro01.getCor());
		System.out.println("Ano: " + carro01.getAno());
		//Imprimir as demais informações
	}
}
