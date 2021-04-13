package TesteFile;

import java.io.File;

public class DeleteFolder {

	public static void main(String[] args) {
		
		File myObj = new File("C:\\Users\\Thiago\\Test");
		if (myObj.delete()) {
			System.out.println("Exclua o arquivo: "+ myObj.getName());
		}
		else {
			System.out.println("Falha ao excluir o arquivo.");
		}

	}

}
