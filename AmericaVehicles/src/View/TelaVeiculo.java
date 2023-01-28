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

public class TelaVeiculo implements ActionListener {
	JFrame tela = new JFrame("AmericaVehicles - Cadastrar Veiculo");
	JButton cadastrarVeiculo = new JButton("Cadastrar");
	JButton retornar = new JButton ("Retornar para Menu Inicial");


	ImageIcon fundo = new ImageIcon(getClass().getResource("PlanoFundo2.png"));
	JLabel AmericaVehicles= new JLabel(fundo);
	
	public  void placeComponents(JPanel panel) {
        Scanner in = new Scanner(System.in);
		panel.setLayout(null);
	}
	public TelaVeiculo () {
		tela.setLayout(null);
		tela.setSize(1522,2050);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		
		Scanner in = new Scanner(System.in);
		tela.setLayout(null);
	
		JLabel cadastrar = new JLabel("CADASTRAR VEICULO PARA VENDA ");
		cadastrar.setBounds(50, 270, 500, 35);
		cadastrar.setFont(new Font("Arial", Font.BOLD, 24));
		tela.add(cadastrar);
		
		JLabel nome = new JLabel("Tipo de Veículo: ");
		nome.setBounds(50, 300, 360, 100);
		nome.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nome);

		JTextField nomea= new JTextField(50);
		nomea.setBounds(200, 335, 375, 35);
		nomea.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nomea);
		
		JLabel rg = new JLabel("Marca: ");
		rg.setBounds(50, 335, 360, 100);
		rg.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(rg);

		JTextField rga= new JTextField(50);
		rga.setBounds(125, 375, 450, 35);
		rga.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(rga);
		
		JLabel cpf = new JLabel("Modelo: ");
		cpf.setBounds(50, 375, 360, 100);
		cpf.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cpf);

		JTextField cpfa= new JTextField(50);
		cpfa.setBounds(125, 415, 450, 35);
		cpfa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cpfa);

		JLabel dt = new JLabel("Ano: ");
		dt.setBounds(50, 415, 360, 100);
		dt.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(dt);

		JTextField dta= new JTextField(50);
		dta.setBounds(110, 455, 460, 35);
		dta.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(dta);
		
		JLabel ec = new JLabel("Condição: ");
		ec.setBounds(50, 455, 360, 100);
		ec.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(ec);

		JTextField eca= new JTextField(50);
		eca.setBounds(150, 495, 420, 35);
		eca.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(eca);
		
		JLabel renda = new JLabel("Valor: ");
		renda.setBounds(50, 495, 360, 100);
		renda.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(renda);

		JTextField rendaa= new JTextField(50);
		rendaa.setBounds(110, 535, 460, 35);
		rendaa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(rendaa);
		
		JLabel carro = new JLabel("CARRO ");
		carro.setBounds(800, 150, 500, 35);
		carro.setFont(new Font("Arial", Font.BOLD, 24));
		tela.add(carro);
	
		
		JLabel desc = new JLabel("Descrição: ");
		desc.setBounds(800, 170, 360, 100);
		desc.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(desc);

		JTextField descr= new JTextField(50);
		descr.setBounds(900, 205, 425, 35);
		descr.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(descr);
		
		JLabel cambio = new JLabel("Cambio: ");
		cambio.setBounds(800, 205, 360, 100);
		cambio.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cambio);

		JTextField cambioa= new JTextField(50);
		cambioa.setBounds(875, 245, 450, 35);
		cambioa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cambioa);
		
		JLabel cor = new JLabel("Cor: ");
		cor.setBounds(800, 245, 360, 100);
		cor.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cor);

		JTextField cora= new JTextField(50);
		cora.setBounds(840, 285, 485, 35);
		cora.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cora);
		
		JLabel quil = new JLabel("Quilometragem: ");
		quil.setBounds(800, 285, 360, 100);
		quil.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(quil);

		JTextField cquil= new JTextField(50);
		cquil.setBounds(950, 325, 375, 35);
		cquil.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cquil);
		
		
		JLabel moto = new JLabel("MOTO ");
		moto.setBounds(800, 375, 500, 35);
		moto.setFont(new Font("Arial", Font.BOLD, 24));
		tela.add(moto);
	
		JLabel mdesc = new JLabel("Descrição: ");
		mdesc.setBounds(800, 395, 360, 100);
		mdesc.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(mdesc);

		JTextField mdescr= new JTextField(50);
		mdescr.setBounds(900, 435, 425, 35);
		mdescr.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(mdescr);
		
		JLabel cilin = new JLabel("Cilindrada: ");
		cilin.setBounds(800, 435, 360, 100);
		cilin.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cilin);

		JTextField cilind= new JTextField(50);
		cilind.setBounds(910, 475, 415, 35);
		cilind.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cilind);
		
		JLabel tipo = new JLabel("Tipo: ");
		tipo.setBounds(800, 475, 360, 100);
		tipo.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(tipo);

		JTextField tipoa= new JTextField(50);
		tipoa.setBounds(865, 515, 460, 35);
		tipoa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(tipoa);
		
		JLabel caminhao = new JLabel("CAMINHÃO ");
		caminhao.setBounds(800, 565, 500, 35);
		caminhao.setFont(new Font("Arial", Font.BOLD, 24));
		tela.add(caminhao);
		
		
		JLabel cquilo = new JLabel("Quilometragem: ");
		cquilo.setBounds(800, 575, 360, 100);
		cquilo.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cquilo);

		JTextField quilom= new JTextField(50);
		quilom.setBounds(950, 615, 375, 35);
		quilom.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(quilom);
		
		JLabel combustivel = new JLabel("Combustivel: ");
		combustivel.setBounds(800, 615, 360, 100);
		combustivel.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(combustivel);

		JTextField combustivell= new JTextField(50);
		combustivell.setBounds(920, 655, 405, 35);
		combustivell.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(combustivell);
		
		JLabel ccor = new JLabel("Cor: ");
		ccor.setBounds(800, 655, 360, 100);
		ccor.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(ccor);

		JTextField ccorr= new JTextField(50);
		ccorr.setBounds(840, 695, 485, 35);
		ccorr.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(ccorr);

		AmericaVehicles.setSize(1532,800);
		cadastrarVeiculo.setBounds(50, 600, 450, 60);
		cadastrarVeiculo.setFont(new Font("Arial", Font.BOLD, 24));
		retornar.setBounds(50, 680, 450, 60);
		retornar.setFont(new Font("Arial", Font.BOLD, 24));


		tela.add(AmericaVehicles);
		tela.add(cadastrarVeiculo);
		tela.add(retornar);
		
		retornar.addActionListener(Retorna);
		
	}
	
	ActionListener Retorna = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TelaInicial retornaX = new TelaInicial();
		};
		};

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
