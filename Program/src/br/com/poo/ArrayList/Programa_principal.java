package br.com.poo.ArrayList;

import java.util.ArrayList;

public class Programa_principal {

	public static void main(String[] args) {
	
		ArrayList<Veiculo> listVeiculo = new ArrayList<>();
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setAno("2014");
		veiculo.setCor("Vermelho");
		veiculo.setModelo("Chevrolet Onix");
		veiculo.setPlaca("IPY2515");
		listVeiculo.add(veiculo);
		
		mostrar(listVeiculo);
	
		listVeiculo.remove(veiculo);
	}
	public static void mostrar(ArrayList<Veiculo> listVeiculo) {
		for(Veiculo item: listVeiculo) {
			System.out.printf("%s\n", item.toString());
		}
		
	}
}
