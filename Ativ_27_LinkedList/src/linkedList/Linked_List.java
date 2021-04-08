package linkedList;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		
		LinkedList<String> moto = new LinkedList<String>();
		
		moto.add("Honda"); //adicionar dados
		moto.add("R$9.550,00");
		moto.add("CG 160 Start");
		
		System.out.println("Modelo de moto :");
		System.out.println(moto); //mostrar dados
		
		moto.addFirst("Street");//adiciona item no inicio da lista
		moto.addLast("2 ano de garantia");//adiciona um item no fim da lista
		
		System.out.println("\nModelo de moto atualizado :");
		System.out.println(moto);
		
		moto.removeFirst();//remove um item no inicio da lista
		moto.removeLast();//remove um item no inicio da lista
		
		System.out.println("\nModelo de moto atualizado :");
		System.out.println(moto);
		System.out.println("\n");
		
		System.out.println("Primeiro item: "+moto.getFirst());//acessa o item no inicio da lista
		System.out.println("Ultimo item:  "+moto.getLast());//Acessa o item no final da lista
		
		
		
		
		
		
		

	}

}
