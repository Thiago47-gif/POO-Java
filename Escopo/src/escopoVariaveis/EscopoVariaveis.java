package escopoVariaveis;

public class EscopoVariaveis {
	public static void main(String[] args) {
		
		EscopoVariaveis escopo = new EscopoVariaveis();
		escopo.setValor(10);
		
		System.out.println(escopo.getValor());
		System.out.println(escopo.calculaValor(20));
		System.out.println(escopo.getValor());
		
	}

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int calculaValor(int valor) {
		
		valor = valor + 10;
		return valor;
	}
	
}
