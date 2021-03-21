package br.com.poo.ArrayList;

import java.util.ArrayList;

import java.util.Scanner;

public class Fabrica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); //Capturar dados do teclado
		
	    //Lista
		ArrayList<Moto> listMoto = new ArrayList<>();
		
		ArrayList<Carro> listCarro = new ArrayList<>();
		
		//inst�nciar
		Moto moto = new Moto();
		Carro carro = new Carro();
		
		System.out.println("Qual informa��o de veiculo desejada: \n");
		System.out.println("Moto - Digite '1'\n");
		System.out.println("Carro - Digite '2'\n\n");
		System.out.print("Op��o: ");
		int opcao = leia.nextInt();
		
		//Mostrar carros e motos
		switch (opcao) {
		case 1:
		
			moto.setAno("2017");
			moto.setCor("Laranja");
			moto.setModelo("Honda CBR 1000 RR");
			moto.setPlaca("IPY2515");
			moto.setCategoria("Esportiva");
			moto.setCilindro("2");
			listMoto.add(moto);
			mostrarMoto(listMoto);
		
		case 2:
		
			carro.setAno("2014");
			carro.setCor("Vermelho");
			carro.setModelo("Chevrolet Onix");
			carro.setPlaca("IPY2515");
			carro.setChassi("BR53536387FG");
			carro.setTracao("4x4");
			listCarro.add(carro);
			mostrarCarro(listCarro);
		}
		
	}
	//M�todo de listagem de dados
	public static void mostrarMoto(ArrayList<Moto> listMoto) {
		for(Moto item1: listMoto) {
			System.out.printf("%s\n", item1.toString());
		}
	}
	
	public static void mostrarCarro(ArrayList<Carro> listCarro) {
		for(Carro item2: listCarro) {
			System.out.printf("%s\n", item2.toString());
		}
	}
}
