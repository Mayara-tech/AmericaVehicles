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
import javax.swing.JTextField;

public class TelaFormaPagamento  implements ActionListener {
	JFrame tela = new JFrame("AmericaVehicles - Forma de Pagamento");
	JButton comprarVeiculo = new JButton("Comprar");
	JButton retornar = new JButton ("Retornar para Menu Inicial");


	ImageIcon fundotela = new ImageIcon(getClass().getResource("PlanoFundo3.png"));
	JLabel AmericaVehicles= new JLabel(fundotela);

	public TelaFormaPagamento  () {
		tela.setLayout(null);
		tela.setSize(1522,2050);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		

		tela.setLayout(null);
	
		JLabel cadastrar = new JLabel("DADOS DO COMPRADOR ");
		cadastrar.setBounds(50, 270, 500, 35);
		cadastrar.setFont(new Font("Arial", Font.BOLD, 24));
		tela.add(cadastrar);
		
		JLabel nome = new JLabel("Nome Completo: ");
		nome.setBounds(50, 300, 360, 100);
		nome.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nome);

		JTextField nomea= new JTextField(50);
		nomea.setBounds(200, 335, 375, 35);
		nomea.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nomea);
		
		JLabel cpf = new JLabel("CPF: ");
		cpf.setBounds(50, 335, 360, 100);
		cpf.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cpf);

		JTextField cpfa= new JTextField(50);
		cpfa.setBounds(125, 375, 450, 35);
		cpfa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cpfa);
		
		JLabel veiculo = new JLabel("Veiculo: ");
		veiculo.setBounds(50, 375, 360, 100);
		veiculo.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(veiculo);

		JTextField veiculoa= new JTextField(50);
		veiculoa.setBounds(125, 415, 450, 35);
		veiculoa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(veiculoa);

		JLabel valor = new JLabel("Valor: ");
		valor.setBounds(50, 415, 360, 100);
		valor.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(valor);

		JTextField valora= new JTextField(50);
		valora.setBounds(110, 455, 460, 35);
		valora.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(valora);
		
		JLabel pg = new JLabel("Forma de Pagamento: ");
		pg.setBounds(50, 455, 360, 100);
		pg.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(pg);

		JTextField pga= new JTextField(50);
		pga.setBounds(250, 495, 320, 35);
		pga.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(pga);
		
		JLabel qtd = new JLabel("Quantidade de Parcelas: ");
		qtd.setBounds(50, 495, 360, 100);
		qtd.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(qtd);

		JTextField qtda= new JTextField(50);
		qtda.setBounds(270, 535, 300, 35);
		qtda.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(qtda);
		
		JLabel carta = new JLabel("CARTA DE CRÉDITO ");
		carta.setBounds(800, 150, 500, 35);
		carta.setFont(new Font("Arial", Font.BOLD, 24));
		tela.add(carta);
	
		
		JLabel bancoC = new JLabel("Banco: ");
		bancoC.setBounds(800, 170, 360, 100);
		bancoC.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(bancoC);

		JTextField BancoCa= new JTextField(50);
		BancoCa.setBounds(870, 205, 455, 35);
		BancoCa.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(BancoCa);
		
		JLabel nc = new JLabel("Numero da Contemplação: ");
		nc.setBounds(800, 205, 360, 100);
		nc.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nc);

		JTextField nca= new JTextField(50);
		nca.setBounds(1050, 245, 275, 35);
		nca.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nca);
		
		JLabel vc = new JLabel("Valor da Carta: ");
		vc.setBounds(800, 245, 360, 100);
		vc.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(vc);

		JTextField vca= new JTextField(50);
		vca.setBounds(950, 285, 375, 35);
		vca.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(vca);
	
		
		JLabel cartao = new JLabel("CARTÃO DE CRÉDITO ");
		cartao.setBounds(800, 355, 500, 35);
		cartao.setFont(new Font("Arial", Font.BOLD, 24));
		tela.add(cartao);
	
		JLabel nCartao = new JLabel("Numero do cartão: ");
		nCartao.setBounds(800, 375, 360, 100);
		nCartao.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nCartao);

		JTextField nCar= new JTextField(50);
		nCar.setBounds(970, 415, 355, 35);
		nCar.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(nCar);
		
		JLabel dtv = new JLabel("Data de validade: ");
		dtv.setBounds(800, 415, 360, 100);
		dtv.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(dtv);

		JTextField dtvd= new JTextField(50);
		dtvd.setBounds(960, 455, 365, 35);
		dtvd.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(dtvd);
		
		JLabel cvv = new JLabel("CVV: ");
		cvv.setBounds(800, 455, 360, 100);
		cvv.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cvv);

		JTextField cvva= new JTextField(50);
		cvva.setBounds(855, 495, 470, 35);
		cvva.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(cvva);
		
		JLabel financiamento = new JLabel("FINANCIAMENTO ");
		financiamento.setBounds(800, 545, 500, 35);
		financiamento.setFont(new Font("Arial", Font.BOLD, 24));
		tela.add(financiamento);
		
		
		JLabel ve = new JLabel("Valor de Entrada: ");
		ve.setBounds(800, 555, 360, 100);
		ve.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(ve);

		JTextField vem= new JTextField(50);
		vem.setBounds(960, 595, 365, 35);
		vem.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(vem);
		
		JLabel vf = new JLabel("Valor do Financiamento: ");
		vf.setBounds(800, 595, 360, 100);
		vf.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(vf);

		JTextField vfl= new JTextField(50);
		vfl.setBounds(1020, 635, 305, 35);
		vfl.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(vfl);
		
		JLabel bancof = new JLabel("Banco: ");
		bancof.setBounds(800, 635, 360, 100);
		bancof.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(bancof);

		JTextField bancofr= new JTextField(50);
		bancofr.setBounds(870, 675, 455, 35);
		bancofr.setFont(new Font("Arial", Font.BOLD, 18));
		tela.add(bancofr);

		AmericaVehicles.setSize(1532,800);
		comprarVeiculo.setBounds(50, 600, 450, 60);
		comprarVeiculo.setFont(new Font("Arial", Font.BOLD, 24));
		retornar.setBounds(50, 680, 450, 60);
		retornar.setFont(new Font("Arial", Font.BOLD, 24));


		tela.add(AmericaVehicles);
		tela.add(comprarVeiculo);
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
