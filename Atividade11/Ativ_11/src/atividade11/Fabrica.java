package atividade11;

import java.util.Scanner;

public class Fabrica {
	public static void main(String[] args) {
		
		Carro carro;
		carro = new Carro();
		
		//Criação do objeto responsável por ler a informação digitada pelo usuário
		Scanner scan = new Scanner(System.in);
		//Solicitando informações ao usuário
		System.out.print("Digite a cor do carro: ");
		//Lendo a informação e armazenando em uma variável chamada cor
		String cor = scan.nextLine();
		//Setando a informação no objeto do tipo Carro
		carro.setCor(cor);
	}
}
