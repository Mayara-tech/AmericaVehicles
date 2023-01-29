package View;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.*;

import Controller.ControleDados;
import View.*;


public class TelaInicial implements ActionListener{

	private static ControleDados d = new ControleDados();
	private static ControleDados m = new ControleDados();
	private static ControleDados c = new ControleDados();
	private static JFrame tela = new JFrame("AmericaVehicles");
	private static JButton cliente = new JButton("Comprar");
	private static JButton vendedor = new JButton("Vender");
	private static JButton anuncio = new JButton ("Anuncios");


	ImageIcon logomarca = new ImageIcon(getClass().getResource("PaginaInicial.png"));
	JLabel AmericaVehicles= new JLabel(logomarca);

	public TelaInicial () {
		tela.setLayout(null);
		tela.setSize(1522,2050);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);

		AmericaVehicles.setSize(1532,800);
		cliente.setBounds(50,490,450,60);
		cliente.setFont(new Font("Arial", Font.BOLD, 24));
		vendedor.setBounds(50, 570, 450, 60);
		vendedor.setFont(new Font("Arial", Font.BOLD, 24));
		anuncio.setBounds(50, 650, 450, 60);
		anuncio.setFont(new Font("Arial", Font.BOLD, 24));


		tela.add(AmericaVehicles);
		tela.add(cliente);
		tela.add(vendedor);
		tela.add(anuncio);

		cliente.addActionListener(Cliente);
		vendedor.addActionListener(Vendedor);
		anuncio.addActionListener(Anuncio);



	}

	ActionListener Cliente = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TelaCliente cliente = new TelaCliente();
		};
	};

	ActionListener Vendedor = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TelaVendedor vendedor = new TelaVendedor();

		};
	};
	ActionListener Anuncio = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TelaAnuncios anuncio = new TelaAnuncios(d,m,c);
		};
	};

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
