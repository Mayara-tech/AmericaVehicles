package View;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import Controller.*;
import Model.*;

public class TelaAnuncios implements ActionListener, ListSelectionListener {

	private JList<String> listaCarro;
	private JList<String> listaMoto;
	private JList<String> listaCaminhao;
	private static String[] tipos = {"Tudo","Carro", "Moto", "Caminhão"};
	private JComboBox<Object> valorTipo = new JComboBox<Object>(tipos);
	private JFrame janela;
	private JLabel titulo;
	private JLabel tituloCarro;
	private JLabel tituloMoto;
	private JLabel tituloCaminhao;
	private JButton retornar;
	private JButton comprar;
	private ControleDados d;
	private ControleDados m;
	private ControleDados c;
	private int posicao;
	
	public TelaAnuncios(ControleDados d, ControleDados m, ControleDados c) {
		
		ImageIcon logomarca = new ImageIcon(getClass().getResource("PaginaAnuncios.png"));
		JLabel AmericaVehicles= new JLabel(logomarca);
		
		this.d=d;
		this.m=m;
		this.c=c;
		this.posicao=posicao;
		
		String[] carro = new ControleVeiculos(d).getListaCarro();
		String[] moto = new ControleMoto(m).getListaMoto();
		String[] caminhao = new ControleCaminhao(c).getListaCaminhao();
		listaCarro = new JList<String>(carro);
		listaMoto = new JList<String>(moto);
		listaCaminhao = new JList <String> (caminhao);
		janela = new JFrame("AmericaVehicles - Anuncios");
		titulo = new JLabel("VEICULOS");
		tituloCarro= new JLabel("CARROS");
		tituloMoto = new JLabel("MOTOS");
		tituloCaminhao = new JLabel("CAMINHÕES");
		retornar = new JButton("Retornar para Menu Inicial");
		comprar = new JButton("Comprar");

		AmericaVehicles.setSize(1532,800);
		retornar.setMargin(new Insets(0,0,0,0));
		listaCarro = new JList<String>(new ControleVeiculos(d).getListaCarro());
		listaMoto = new JList<String>(new ControleMoto(m).getListaMoto());
		listaCaminhao = new JList<String>(new ControleCaminhao(c).getListaCaminhao());
		Object tipoVeiculo = d.getCarro().get(posicao).getTipoVeiculo();
		valorTipo.setSelectedItem(tipoVeiculo) ;
		
		titulo.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		titulo.setBounds(130, 20, 1500, 30);
		tituloCarro.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		tituloCarro.setBounds(50, 100, 1000, 50);
		tituloMoto.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		tituloMoto.setBounds(400, 100, 1000, 50);
		tituloCaminhao.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		tituloCaminhao.setBounds(680, 100, 1000, 50);
		valorTipo.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		valorTipo.setBounds(400, 20, 250, 50);
		valorTipo.setBackground(Color.white);
		
		
		
		
		retornar.setBounds(50, 680, 450, 60);
		retornar.setFont(new Font("Arial", Font.BOLD, 24));
		comprar.setBounds(50, 600, 450, 60);
		comprar.setFont(new Font("Arial", Font.BOLD, 24));
		
		listaCarro.setBounds(50, 200, 350, 750);
		listaCarro.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaCarro.setVisibleRowCount(10);
		listaCarro.setFont(new Font("Calibri Light", Font.PLAIN,24));
		
		listaMoto.setBounds(400, 200, 250, 750);
		listaMoto.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaMoto.setVisibleRowCount(10);
		listaMoto.setFont(new Font("Calibri Light", Font.PLAIN, 24));
		
		listaCaminhao.setBounds(680, 200, 300, 750);
		listaCaminhao.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaCaminhao.setVisibleRowCount(10);
		listaCaminhao.setFont(new Font("Calibri Light", Font.PLAIN, 24));

		listaCarro.addListSelectionListener(this);
		listaMoto.addListSelectionListener(this);
		listaCaminhao.addListSelectionListener(this);

		janela.add(titulo);
		janela.add(tituloCarro);
		janela.add(tituloMoto);
		janela.add(tituloCaminhao);
		janela.add(retornar);
		janela.add(comprar);
		janela.add(listaCarro);
		janela.add(listaMoto);
		janela.add(listaCaminhao);
		janela.add(AmericaVehicles);
		janela.add(valorTipo);
		
		
		janela.setLayout(null);
		janela.setSize(1522,2050);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

		retornar.addActionListener(Retorna);
		comprar.addActionListener(Comprar);
		
}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if(e.getValueIsAdjusting() && src == listaCarro) { // visualizacao dos dados paciente
			janela.dispose();
		}
	}
	public void valueChanged1(ListSelectionEvent e) {
		Object src = e.getSource();
		if(e.getValueIsAdjusting() && src == listaMoto) { // visualizacao dos dados paciente
			janela.dispose();
		}
	}
	public void valueChanged2(ListSelectionEvent e) {
		Object src = e.getSource();
		if(e.getValueIsAdjusting() && src == listaCaminhao) { // visualizacao dos dados paciente
			janela.dispose();
		}
	}

	ActionListener Retorna = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TelaInicial retornaX = new TelaInicial();
		};
		};
		
	ActionListener Comprar = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TelaFormaPagamento comprar = new TelaFormaPagamento();
		};
		};
		
	@Override
	public  void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

