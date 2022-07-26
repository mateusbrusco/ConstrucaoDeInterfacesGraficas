package aplicacao.view;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

public class TelaPrincipal extends JFrame {
	
	private FlowLayout layout;
	private JLabel lblTela;
	private Image imgReciclagem;
	static JMenuBar barraMenu;
	static JMenu interessado, catador, rota;
	static JMenuItem cadastraInteressado, alteraInteressado, buscaInteressado, removeInteressado;
	
	
	public TelaPrincipal () {
		criar();
		configurar();
		adicionar();
	}
	
	private void criar() {
		this.layout = new FlowLayout();
		barraMenu = new JMenuBar();
		lblTela = new JLabel();
		interessado = new JMenu("Interessado(a)");
		catador = new JMenu("Catador(a)");
		rota = new JMenu("Rota");
		cadastraInteressado = new JMenuItem("Cadastro de interessado(a)");
		alteraInteressado = new JMenuItem("Altera��o de cadastro de interessado(a)");
		buscaInteressado = new JMenuItem("Busca de interessado(a) cadastrado");
		removeInteressado = new JMenuItem("Exclus�o de cadastro de interessado(a)");
		
	}
	
	private void configurar() {
		getContentPane().setLayout(layout);
		imgReciclagem = new ImageIcon(this.getClass().getResource("/reciclagem.png")).getImage().getScaledInstance(630, 630, Image.SCALE_DEFAULT);
		lblTela.setIcon(new ImageIcon(imgReciclagem));
		this.setSize(800, 700);
		this.setTitle("Tela Inicial");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void adicionar() {
		
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

}