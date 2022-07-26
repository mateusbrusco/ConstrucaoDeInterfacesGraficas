package aplicacao.view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class TelaCadastroInteressado extends JFrame {
	
	private JLabel lblTitulo;
	private JLabel lblNome;
	private JLabel lblEndereco;
	private JLabel lblNumero;
	private JLabel lblComplemento;
	private JLabel lblEmail;
	private JLabel lblTelefone;
	private JLabel lblTipoResiduo;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JCheckBox chckbxPapel;
	private JCheckBox chckbxPlastico;
	private JCheckBox chckbxVidro;
	private JCheckBox chckbxMetal;
	private JCheckBox chckbxOrganico;
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JButton btnVoltar;
	
	
	public TelaCadastroInteressado() {
		
		criar();
		configurar();
		adicionar();
		
	}
	
	private void criar() {
		
		lblTitulo = new JLabel("CADASTRO DE INTERESSADO(A)");
		lblNome = new JLabel("Nome: ");
		lblEndereco = new JLabel("Endereço: ");
		lblNumero = new JLabel("Número: ");
		lblComplemento = new JLabel("Complemento: ");
		lblEmail = new JLabel("E-mail: ");
		lblTelefone = new JLabel("Telefone: ");
		lblTipoResiduo = new JLabel("<html>Tipos de\n Resíduos:</html>");
		
		txtNome = new JTextField(20);
		txtEndereco = new JTextField(50);
		txtNumero = new JTextField(10);
		txtComplemento = new JTextField(20);
		txtEmail = new JTextField(20);
		txtTelefone = new JTextField(10);
		
		chckbxPapel = new JCheckBox("Papel");
		chckbxPlastico = new JCheckBox("Plástico");
		chckbxVidro = new JCheckBox("Vidro");
		chckbxMetal = new JCheckBox("Metal");
		chckbxOrganico = new JCheckBox("Orgânico");
		
	}
	
	private void configurar() {
		
		getContentPane().setLayout(null);
		this.setSize(800, 700);
		this.setTitle("Cadastro de Interessado(a)");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		lblTitulo.setOpaque(true);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBackground(Color.DARK_GRAY);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 28));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 11, 764, 64);
		
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(35, 99, 44, 20);
		
		lblEndereco.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereco.setBounds(10, 130, 69, 20);
		
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setBounds(10, 161, 69, 20);
		
		lblComplemento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblComplemento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComplemento.setBounds(190, 161, 95, 20);
		
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(20, 192, 59, 20);
		
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(10, 223, 69, 20);
		
		lblTipoResiduo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTipoResiduo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoResiduo.setBounds(10, 265, 69, 43);
		
		
		txtNome.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNome.setBounds(89, 99, 348, 20);
		
		txtEndereco.setFont(new Font("Arial", Font.PLAIN, 14));
		txtEndereco.setBounds(89, 130, 348, 20);
		
		txtNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNumero.setBounds(89, 161, 75, 20);
		
		txtComplemento.setFont(new Font("Arial", Font.PLAIN, 14));
		txtComplemento.setBounds(295, 161, 142, 20);
		
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		txtEmail.setBounds(89, 192, 348, 20);
		
		txtTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		txtTelefone.setBounds(89, 223, 348, 20);
		
		chckbxPapel.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxPapel.setBounds(89, 268, 75, 20);
		
		chckbxPlastico.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxPlastico.setBounds(89, 291, 75, 20);
		
	}
	
	private void adicionar() {
		
		getContentPane().add(lblTitulo);
		getContentPane().add(lblNome);
		getContentPane().add(txtNome);
		getContentPane().add(lblEndereco);
		getContentPane().add(txtEndereco);
		getContentPane().add(lblNumero);
		getContentPane().add(txtNumero);
		getContentPane().add(lblComplemento);
		getContentPane().add(txtComplemento);
		getContentPane().add(lblEmail);
		getContentPane().add(txtEmail);
		getContentPane().add(lblTelefone);
		getContentPane().add(txtTelefone);
		getContentPane().add(lblTipoResiduo);
		getContentPane().add(chckbxPapel);
		getContentPane().add(chckbxPlastico);
		
		
	}

}
