package FOREACH;

public class ArrayForeach {

	public static void main(String[] args) {
		
		int[] temperatura = new int[30];
		
		temperatura[0] = 30;
		temperatura[1] = 34;
		temperatura[2] = 32;
		temperatura[3] = 28;
		temperatura[4] = 25;
		temperatura[5] = 30;
		temperatura[6] = 25;
		temperatura[7] = 20;
		temperatura[8] =23;
		temperatura[9] = 19;
		temperatura[10] = 5;
		temperatura[11] = 10;
		temperatura[12] = 7;
		temperatura[13] = 15;
		temperatura[14] = 17;
		temperatura[15] = 22;
		temperatura[16] = 26;
		temperatura[17] = 22;
		temperatura[18] = 26;
		temperatura[19] = 30;
		temperatura[20] = 34;
		temperatura[21] = 33;
		temperatura[22] = 38;
		temperatura[23] = 34;
		temperatura[24] = 30;
		temperatura[25] = 24;
		temperatura[26] = 28;
		temperatura[27] = 22;
		temperatura[28] = 19;
		temperatura[29] = 15;
		
		int soma = 0;
		int media = 0;
		
		System.out.println("        Registro de temperatura dos ultimos 30 dia.\n");
		
		for (int i=0; i<temperatura.length; i++) {
			System.out.println("       "+ (i+1) +"° dia: "+ temperatura[i] +"°C");
			soma = soma + temperatura[i];
		}
		media = soma / temperatura.length;
		
		System.out.println("\n       Média de temperatura dos ultimos 30 dias: "+ (media) +"°C");
		

	}

}
