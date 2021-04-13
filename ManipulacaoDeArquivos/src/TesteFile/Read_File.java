package TesteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Read_File {

	public static void main(String[] args) {
		
		try {
			File myObj = new File("Ativ_File.txt");
			Scanner myReader = new Scanner(myObj);
			
			while(myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
		}catch(FileNotFoundException e) {
			System.out.println("Um erro ocorreu.");
			e.printStackTrace();
		}
		
		
	}

}
