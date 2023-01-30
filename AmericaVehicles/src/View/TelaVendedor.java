package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaVendedor implements ActionListener {
	
	
	JFrame tela = new JFrame("AmericaVehicles - Vendedor");
	JButton loginVendedor = new JButton("login");
	JButton cadastrarVendedor = new JButton("Cadastrar");
	JButton retornar = new JButton ("Retornar para Menu Inicial");


	ImageIcon fundo = new ImageIcon(getClass().getResource("PlanoFundo2.png"));
	JLabel AmericaVehicles= new JLabel(fundo);
	

	public TelaVendedor () {
		tela.setLayout(null);
		tela.setSize(1522,2050);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		
		tela.setLayout(null);

		JLabel cadastrado = new JLabel("ACESSO ");
		cadastrado.setBounds(50, 125, 360, 35);
		cadastrado.setFont(new Font("Arial", Font.BOLD, 24));
		tela.add(cadastrado);
		
		JLabel userLabel = new JLabel("CPF: ");
		userLabel.setBounds(50, 140, 360, 100);
		userLabel.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(userLabel);

		JTextField login = new JTextField(20);
		login.setBounds(100, 170, 360, 35);
		login.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(login );

		JLabel dtnascimento = new JLabel("Data de nascimento");
		dtnascimento.setBounds(50, 180, 360, 100);
		dtnascimento.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(dtnascimento);

		JPasswordField senha = new JPasswordField(20);
		senha.setBounds(230, 210, 360, 40);
		senha.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(senha);
		
		JLabel cadastrar = new JLabel("CRIAR CADASTRO ");
		cadastrar.setBounds(50, 270, 360, 35);
		cadastrar.setFont(new Font("Arial", Font.BOLD, 24));
		tela.add(cadastrar);
		
		JLabel nome = new JLabel("Nome: ");
		nome.setBounds(50, 300, 360, 100);
		nome.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nome);

		JTextField nomea= new JTextField(50);
		nomea.setBounds(115, 335, 460, 35);
		nomea.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nomea);
		
		JLabel rg = new JLabel("RG: ");
		rg.setBounds(50, 335, 360, 100);
		rg.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(rg);

		JTextField rga= new JTextField(50);
		rga.setBounds(115, 375, 460, 35);
		rga.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(rga);
		
		JLabel cpf = new JLabel("CPF: ");
		cpf.setBounds(50, 375, 360, 100);
		cpf.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cpf);

		JTextField cpfa= new JTextField(50);
		cpfa.setBounds(115, 415, 460, 35);
		cpfa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cpfa);

		JLabel dt = new JLabel("Data de nascimento: ");
		dt.setBounds(50, 415, 360, 100);
		dt.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(dt);

		JTextField dta= new JTextField(50);
		dta.setBounds(235, 455, 345, 35);
		dta.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(dta);
		
		JLabel ec = new JLabel("Email: ");
		ec.setBounds(50, 455, 360, 100);
		ec.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(ec);

		JTextField eca= new JTextField(50);
		eca.setBounds(110, 495, 460, 35);
		eca.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(eca);
		
		JLabel renda = new JLabel("Nacionalidade: ");
		renda.setBounds(50, 495, 360, 100);
		renda.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(renda);

		JTextField rendaa= new JTextField(50);
		rendaa.setBounds(185, 535, 395, 35);
		rendaa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(rendaa);
		
		
		JLabel nc = new JLabel("Naturalidade: ");
		nc.setBounds(50, 535, 360, 100);
		nc.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nc);

		JTextField nca= new JTextField(50);
		nca.setBounds(185, 575, 395, 35);
		nca.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nca);
		
		
		JLabel pais = new JLabel("País: ");
		pais.setBounds(800, 300, 360, 100);
		pais.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(pais);

		JTextField paisa= new JTextField(50);
		paisa.setBounds(865, 335, 460, 35);
		paisa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(paisa);
		
		JLabel estado = new JLabel("Estado: ");
		estado.setBounds(800, 335, 360, 100);
		estado.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(estado);

		JTextField estadoa= new JTextField(50);
		estadoa.setBounds(875, 375, 450, 35);
		estadoa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(estadoa);
		
		JLabel cep = new JLabel("CEP: ");
		cep.setBounds(800, 375, 360, 100);
		cep.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cep);

		JTextField cepa= new JTextField(50);
		cepa.setBounds(865, 415, 460, 35);
		cepa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cepa);

		JLabel cidade = new JLabel("Cidade: ");
		cidade.setBounds(800, 415, 360, 100);
		cidade.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cidade);

		JTextField cidadea= new JTextField(50);
		cidadea.setBounds(875, 455, 455, 35);
		cidadea.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cidadea);
		
		JLabel bairro = new JLabel("Bairro: ");
		bairro.setBounds(800, 455, 360, 100);
		bairro.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(bairro);

		JTextField bairroa= new JTextField(50);
		bairroa.setBounds(865, 495, 460, 35);
		bairroa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(bairroa);
		
		JLabel comp = new JLabel("Complemento: ");
		comp.setBounds(800, 495, 360, 100);
		comp.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(comp);

		JTextField compl= new JTextField(50);
		compl.setBounds(940, 535, 385, 35);
		compl.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(compl);
		
		JLabel ddd = new JLabel("DDD: ");
		ddd.setBounds(800, 535, 360, 100);
		ddd.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(ddd);

		JTextField ddda= new JTextField(50);
		ddda.setBounds(865, 575, 460, 35);
		ddda.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(ddda);
		
		JLabel telefone = new JLabel("Telefone ");
		telefone.setBounds(800, 575, 360, 100);
		telefone.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(telefone);

		JTextField tele= new JTextField(50);
		tele.setBounds(885, 615, 410, 35);
		tele.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(tele);

		AmericaVehicles.setSize(1532,800);
		loginVendedor.setBounds(470,170,115,35);
		loginVendedor.setFont(new Font("Arial", Font.BOLD, 18));
		cadastrarVendedor.setBounds(50, 680, 450, 60);
		cadastrarVendedor.setFont(new Font("Arial", Font.BOLD, 24));
		retornar.setBounds(1020, 680, 450, 60);
		retornar.setFont(new Font("Arial", Font.BOLD, 24));


		tela.add(AmericaVehicles);
		tela.add(loginVendedor);
		tela.add(cadastrarVendedor);
		tela.add(retornar);
		
		retornar.addActionListener(Retorna);
		cadastrarVendedor.addActionListener(CadastrarVeiculo);
		loginVendedor.addActionListener(CadastrarVeiculo);
		
	}
	
	ActionListener Retorna = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TelaInicial retornaX = new TelaInicial();
		};
		};
		
		ActionListener CadastrarVeiculo = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVeiculo cadastrar = new TelaVeiculo();
			};
			};

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

			
}
