package TesteFile;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		File myObj = new File("Ativ_File.txt");
		if (myObj.delete()) {
			System.out.println("Exclua o arquivo: "+ myObj.getName());
		}
		else {
			System.out.println("Falha ao excluir o arquivo.");
		}
		
		
		
		
		
		

	}

}
