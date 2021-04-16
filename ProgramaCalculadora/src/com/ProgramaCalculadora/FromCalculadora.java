package com.ProgramaCalculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;

public class FromCalculadora  extends JFrame{
	//Declaração de componentes
	private JButton btCalcular;
	private JTextField tfNumero1;
	private JTextField tfNumero2;
	private JLabel lbNumero1;
	private JLabel lbNumero2;
	private JLabel lbResultado;
	 
	//Container para armazenar os componentes
	Container container;
	
	public FromCalculadora() {
		//configuração da janela
		this.setTitle("SENAI TDS : Calculadora soma");
	
	//Declarar modelo do layout
	this.setLayout(new FlowLayout());
	this.setVisible(true);
	this.setSize(600,150);

	
	//Construindo ocontainer
	container = this.getContentPane();
	
	//Instanciar os componentes gráficos
	btCalcular = new JButton("Calcular");
	tfNumero1 = new JTextField(10);
	tfNumero2 = new JTextField(10);
	lbNumero1 = new JLabel("Numero 1");
	lbNumero2 = new JLabel("Numero 2");
	
	//Agrupa componentes em ordem exibição
	container.add(lbNumero1);
	container.add(lbNumero2);
	container.add(tfNumero1);
	container.add(tfNumero2);
	container.add(btCalcular);
	container.add(lbResultado);
	
	}
}
