package atividade11;

import java.util.Scanner;

public class Fabrica {
	public static void main(String[] args) {
		
		Carro carro;
		carro = new Carro();
		
		//Cria��o do objeto respons�vel por ler a informa��o digitada pelo usu�rio
		Scanner scan = new Scanner(System.in);
		//Solicitando informa��es ao usu�rio
		System.out.print("Digite a cor do carro: ");
		//Lendo a informa��o e armazenando em uma vari�vel chamada cor
		String cor = scan.nextLine();
		//Setando a informa��o no objeto do tipo Carro
		carro.setCor(cor);
	}
}
