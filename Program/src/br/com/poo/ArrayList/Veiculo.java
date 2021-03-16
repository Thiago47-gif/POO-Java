package br.com.poo.ArrayList;

public class Veiculo {

	private String Cor;
	private String Ano;
	private String Modelo;
	private String Placa;
	
	
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getAno() {
		return Ano;
	}
	public void setAno(String ano) {
		Ano = ano;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	
	//Override
	public String toString() {
		
		return String.format("Modelo: %s\n", Modelo) +
		String.format("Cor: %s\n", Cor) +
		String.format("Ano: %s\n", Ano) +
		String.format("Placa: %s\n", Placa);
	}
}
