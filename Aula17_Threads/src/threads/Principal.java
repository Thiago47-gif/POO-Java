package threads;

public class Principal {

	public static void main(String[] args) {
		
		Sistema sis = new Sistema();
		sis.setNome("Maria");
		new Thread(sis);
		
		Sistema sis2 = new Sistema();
		sis2.setNome("Jo�o");
		new Thread(sis2);

		Sistema sis3 = new Sistema();
		sis3.setNome("Pedro");
		new Thread(sis3);
		
		Sistema sis4 = new Sistema();
		sis4.setNome("Julia");
		new Thread(sis4);
	}

}
