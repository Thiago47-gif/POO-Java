package TesteFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterToFile {

	public static void main(String[] args) {
		
		try {
			
			FileWriter myWriter = new FileWriter("Ativ_File.txt");
			myWriter.write("Arquivos em Java podem ser complicados, é divertido o suficiente!");
			myWriter.close();
			System.out.println("Gravado com sucesso no arquivo");
			
		}catch(IOException e) {
			System.out.println("Um erro ocorreu.");
			e.printStackTrace();
		}

	}

}
