package View;
import Controller.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.*;


public class TelaCliente implements ActionListener{
	
	int pos;
	private static ControleDados a = new ControleDados();
	private static ControleDados b = new ControleDados();
	private static ControleDados c = new ControleDados();
	JFrame tela = new JFrame("AmericaVehicles - Cliente");
	JButton loginCliente = new JButton("login");
	JButton cadastrarCliente = new JButton("Cadastrar");
	JButton retornar = new JButton ("Retornar para Menu Inicial");


	ImageIcon fundo = new ImageIcon(getClass().getResource("PlanoFundo.png"));
	JLabel AmericaVehicles= new JLabel(fundo);
	

	public TelaCliente () {
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
		//nomea = new JTextField(ControleDados.getClientes()[pos].getNome());
		nomea.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nomea);
		
		JLabel rg = new JLabel("RG: ");
		rg.setBounds(50, 335, 360, 100);
		rg.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(rg);

		JTextField rga= new JTextField(50);
		rga.setBounds(115, 375, 460, 35);
	//	rga = new JTextField(ControleDados.getClientes()[pos].getRg());
		rga.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(rga);
		
		JLabel cpf = new JLabel("CPF: ");
		cpf.setBounds(50, 375, 360, 100);
		cpf.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cpf);

		JTextField cpfa= new JTextField(50);
		cpfa.setBounds(115, 415, 460, 35);
	//	cpfa = new JTextField(ControleDados.getClientes()[pos].getCpf());
		cpfa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cpfa);

		JLabel dt = new JLabel("Data de nascimento: ");
		dt.setBounds(50, 415, 360, 100);
		dt.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(dt);

		JTextField dta= new JTextField(50);
		dta.setBounds(235, 455, 345, 35);
	//	dta = new JTextField(ControleDados.getClientes()[pos].getDataNascimento());
		dta.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(dta);
		
		JLabel ec = new JLabel("Estado Civil: ");
		ec.setBounds(50, 455, 360, 100);
		ec.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(ec);

		JTextField eca= new JTextField(50);
		eca.setBounds(170, 495, 410, 35);
	//	eca = new JTextField(ControleDados.getClientes()[pos].getEstadoCivil());
		eca.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(eca);
		
		JLabel renda = new JLabel("Renda: ");
		renda.setBounds(50, 495, 360, 100);
		renda.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(renda);

		JTextField rendaa= new JTextField(50);
		rendaa.setBounds(115, 535, 460, 35);
//		rendaa = new JTextField(ControleDados.getClientes()[pos].getRenda());
		rendaa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(rendaa);
		
		JLabel profissao = new JLabel("Profissão: ");
		profissao.setBounds(50, 535, 360, 100);
		profissao.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(profissao);

		JTextField prof= new JTextField(50);
		prof.setBounds(150, 575, 430, 35);
//		prof = new JTextField(ControleDados.getClientes()[pos].getProfissao());
		prof.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(prof);
		
		JLabel nc = new JLabel("Nome Conjugê: ");
		nc.setBounds(50, 575, 360, 100);
		nc.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nc);

		JTextField nca= new JTextField(50);
		nca.setBounds(195, 615, 385, 35);
	//	nca = new JTextField(ControleDados.getClientes()[pos].getNomeConjuge());
		nca.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nca);
		
		
		JLabel pais = new JLabel("País: ");
		pais.setBounds(800, 300, 360, 100);
		pais.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(pais);

		JTextField paisa= new JTextField(50);
		paisa.setBounds(865, 335, 460, 35);
//		paisa = new JTextField(ControleDados.getEnderecos()[pos].getPais());
		paisa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(paisa);
		
		JLabel estado = new JLabel("Estado: ");
		estado.setBounds(800, 335, 360, 100);
		estado.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(estado);

		JTextField estadoa= new JTextField(50);
		estadoa.setBounds(875, 375, 450, 35);
	//	estadoa = new JTextField(ControleDados.getEnderecos()[pos].getEstado());
		estadoa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(estadoa);
		
		JLabel cep = new JLabel("CEP: ");
		cep.setBounds(800, 375, 360, 100);
		cep.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cep);

		JTextField cepa= new JTextField(50);
		cepa.setBounds(865, 415, 460, 35);
	//	cepa = new JTextField(ControleDados.getEnderecos()[pos].getCep());
		cepa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cepa);

		JLabel cidade = new JLabel("Cidade: ");
		cidade.setBounds(800, 415, 360, 100);
		cidade.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cidade);

		JTextField cidadea= new JTextField(50);
		cidadea.setBounds(875, 455, 455, 35);
	//	cidadea = new JTextField(ControleDados.getEnderecos()[pos].getCidade());
		cidadea.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cidadea);
		
		JLabel bairro = new JLabel("Bairro: ");
		bairro.setBounds(800, 455, 360, 100);
		bairro.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(bairro);

		JTextField bairroa= new JTextField(50);
		bairroa.setBounds(865, 495, 460, 35);
	//	bairroa = new JTextField(ControleDados.getEnderecos()[pos].getBairro());
		bairroa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(bairroa);
		
		JLabel comp = new JLabel("Complemento: ");
		comp.setBounds(800, 495, 360, 100);
		comp.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(comp);

		JTextField compl= new JTextField(50);
		compl.setBounds(940, 535, 385, 35);
	//	compl = new JTextField(ControleDados.getEnderecos()[pos].getComplemento());
		compl.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(compl);
		
		JLabel ddd = new JLabel("DDD: ");
		ddd.setBounds(800, 535, 360, 100);
		ddd.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(ddd);

		JTextField ddda= new JTextField(50);
		ddda.setBounds(865, 575, 460, 35);
//		ddda = new JTextField(ControleDados.getTelefones()[pos].getDdd());
		ddda.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(ddda);
		
		JLabel telefone = new JLabel("Telefone ");
		telefone.setBounds(800, 575, 360, 100);
		telefone.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(telefone);

		JTextField tele= new JTextField(50);
		tele.setBounds(885, 615, 410, 35);
//		tele = new JTextField(ControleDados.getTelefones()[pos].getNumeroTelefone());
		tele.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(tele);

		AmericaVehicles.setSize(1532,800);
		loginCliente.setBounds(470,170,115,35);
		loginCliente.setFont(new Font("Arial", Font.BOLD, 18));
		cadastrarCliente.setBounds(50, 680, 450, 60);
		cadastrarCliente.setFont(new Font("Arial", Font.BOLD, 24));
		retornar.setBounds(1020, 680, 450, 60);
		retornar.setFont(new Font("Arial", Font.BOLD, 24));


		tela.add(AmericaVehicles);
		tela.add(loginCliente);
		tela.add(cadastrarCliente);
		tela.add(retornar);
		
		
		retornar.addActionListener(Retorna);
		loginCliente.addActionListener(sn);
		cadastrarCliente.addActionListener(sn);
		
	}
	
	ActionListener Retorna = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TelaInicial retorna = new TelaInicial();
		};
	};

	ActionListener sn = new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
		JFrame tela1 = new JFrame("AmericaVehicles - Cliente");
		JButton anuncios = new JButton("Anuncios");
		JButton editar= new JButton("Editar");
		JButton deletar= new JButton("Deletar");
		JButton retornar1 = new JButton ("Retornar para Menu Inicial");

			tela1.setLayout(null);
			tela1.setSize(1522,2050);
			tela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tela1.setVisible(true);

			tela1.setSize(1532,800);
			anuncios.setBounds(50, 410, 450, 60);
			anuncios.setFont(new Font("Arial", Font.BOLD, 24));
			editar.setBounds(50,490,450,60);
			editar.setFont(new Font("Arial", Font.BOLD, 24));
			deletar.setBounds(50, 570, 450, 60);
			deletar.setFont(new Font("Arial", Font.BOLD, 24));
			retornar.setBounds(50, 650, 450, 60);
			retornar.setFont(new Font("Arial", Font.BOLD, 24));


			tela1.add(anuncios);
			tela1.add(editar);
			tela1.add(deletar);
			tela1.add(retornar);
			tela1.add(AmericaVehicles);

			anuncios.addActionListener(anuncioss);
		};
		
	};
	
	ActionListener anuncioss = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TelaAnuncios anuncioss = new TelaAnuncios(a,b,c);
		};
	};

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
