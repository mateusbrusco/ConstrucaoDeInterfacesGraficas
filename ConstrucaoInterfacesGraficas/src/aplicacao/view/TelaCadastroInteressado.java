package aplicacao.view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastroInteressado extends JFrame {
	
	private FlowLayout layout;
	private JLabel lblTitulo;
	private JLabel lblNome;
	private JLabel lblEndereco;
	private JLabel lblNumero;
	private JLabel lblComplemento;
	private JLabel lblEmail;
	private JLabel lblTelefone;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JButton btnVoltar;
	
	
	public TelaCadastroInteressado() {
		
		criar();
		configurar();
		adicionar();
		
	}
	
	private void criar() {
		
		this.layout = new FlowLayout();
		lblNome = new JLabel("Nome: ");
		lblEndereco = new JLabel("Endereço: ");
		lblNumero = new JLabel("Número: ");
		lblComplemento = new JLabel("Complemento: ");
		lblEmail = new JLabel("E-mail: ");
		lblTelefone = new JLabel("Telefone: ");
		txtNome = new JTextField(20);
		txtEndereco = new JTextField(50);
		txtNumero = new JTextField(10);
		txtComplemento = new JTextField(20);
		txtEmail = new JTextField(20);
		txtTelefone = new JTextField(10);

		
	}
	
	private void configurar() {
		
		this.setLayout(layout);
		this.setSize(800, 700);
		this.setTitle("Cadastro de Interessado(a)");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void adicionar() {
		
		add(lblNome);
		add(txtNome);
		add(lblEndereco);
		add(txtEndereco);
		add(lblNumero);
		add(txtNumero);
		
	}

}
