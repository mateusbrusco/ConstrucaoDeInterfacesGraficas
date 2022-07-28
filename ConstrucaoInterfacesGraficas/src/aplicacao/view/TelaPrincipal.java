package aplicacao.view;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

public class TelaPrincipal extends JFrame {
	
	private JLabel lblTela;
	private Image imgReciclagem;
	static JMenuBar barraMenu;
	static JMenu interessado, catador, rota;
	static JMenuItem cadastraInteressado, alteraInteressado, buscaInteressado, removeInteressado;
	
	
	public TelaPrincipal () {
		criarComponentes();
		configurarComponentes();
		adicionarComponentes();
		configurarListeners();
	}
	
	private void criarComponentes() {
		barraMenu = new JMenuBar();
		lblTela = new JLabel();
		interessado = new JMenu("Interessado(a)");
		catador = new JMenu("Catador(a)");
		rota = new JMenu("Rota");
		cadastraInteressado = new JMenuItem("Cadastro de interessado(a)");
		alteraInteressado = new JMenuItem("Alteração de cadastro de interessado(a)");
		buscaInteressado = new JMenuItem("Busca de interessado(a) cadastrado");
		removeInteressado = new JMenuItem("Exclusão de cadastro de interessado(a)");
		
	}
	
	private void configurarComponentes() {
		getContentPane().setLayout(null);
		imgReciclagem = new ImageIcon(this.getClass().getResource("/reciclagem.png")).getImage().getScaledInstance(630, 630, Image.SCALE_DEFAULT);
		lblTela.setIcon(new ImageIcon(imgReciclagem));
		lblTela.setBounds(75, 5, 630, 630);
		this.setSize(800, 700);
		this.setResizable(false);
		this.setTitle("Tela Inicial");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void adicionarComponentes() {
		
		getContentPane().add(lblTela);
		
		interessado.add(cadastraInteressado);
		interessado.add(alteraInteressado);
		interessado.add(buscaInteressado);
		interessado.add(removeInteressado);
		
		barraMenu.add(interessado);
		barraMenu.add(catador);
		barraMenu.add(rota);
		
		this.setJMenuBar(barraMenu);

		
		
	}
	
	private void configurarListeners() {
		
		cadastraInteressado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroInteressado cadastroInteressado = new TelaCadastroInteressado();
				cadastroInteressado.setVisible(true);
				dispose();
			}
		});
		
	}

}
