package aplicacao.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import aplicacao.controller.InteressadoController;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroInteressado extends JFrame {
	
	private JLabel lblTitulo;
	private JLabel lblNome;
	private JLabel lblEndereco;
	private JLabel lblNumero;
	private JLabel lblComplemento;
	private JLabel lblEmail;
	private JLabel lblTelefone;
	private JLabel lblTipoResiduo;
	private JLabel lblDiaSemana;
	private JLabel lblLatitude;
	private JLabel lblLongitude;
	
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtLatitude;
	private JTextField txtLongitude;
	
	private JCheckBox chckbxPapel;
	private JCheckBox chckbxPlastico;
	private JCheckBox chckbxVidro;
	private JCheckBox chckbxMetal;
	private JCheckBox chckbxOrganico;
	private JCheckBox chckbxSegunda;
	private JCheckBox chckbxTerca;
	private JCheckBox chckbxQuarta;
	private JCheckBox chckbxQuinta;
	private JCheckBox chckbxSexta;
	private JCheckBox chckbxSabado;
	
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JButton btnVoltar;
	
	private InteressadoController interessado;
	
	
	public TelaCadastroInteressado() {
		
		criarComponentes();
		configurarComponentes();
		adicionarComponentes();
		configurarListeners();
		
	}
	
	private void criarComponentes() {
		interessado = new InteressadoController();
		lblTitulo = new JLabel("CADASTRO DE INTERESSADO(A)");
		lblNome = new JLabel("Nome: ");
		lblEndereco = new JLabel("Endere�o: ");
		lblNumero = new JLabel("N�mero: ");
		lblComplemento = new JLabel("Complemento: ");
		lblEmail = new JLabel("E-mail: ");
		lblTelefone = new JLabel("Telefone: ");
		lblTipoResiduo = new JLabel("<html>Tipos de\n Res�duos:</html>");
		lblDiaSemana = new JLabel("<html>Dias da\n Semana:</html>");
		lblLatitude = new JLabel("Latitude: ");
		lblLongitude = new JLabel("Longitude: ");
		
		txtNome = new JTextField(20);
		txtEndereco = new JTextField(50);
		txtNumero = new JTextField(10);
		txtComplemento = new JTextField(20);
		txtEmail = new JTextField(20);
		txtTelefone = new JTextField(10);
		txtLatitude = new JTextField(20);
		txtLongitude = new JTextField(20);
		
		chckbxPapel = new JCheckBox("Papel");
		chckbxPlastico = new JCheckBox("Pl�stico");
		chckbxVidro = new JCheckBox("Vidro");
		chckbxMetal = new JCheckBox("Metal");
		chckbxOrganico = new JCheckBox("Org�nico");
		chckbxSegunda = new JCheckBox("Segunda-feira");
		chckbxTerca = new JCheckBox("Ter�a-feira");
		chckbxQuarta = new JCheckBox("Quarta-feira");
		chckbxQuinta = new JCheckBox("Quinta-feira");
		chckbxSexta = new JCheckBox("Sexta-feira");
		chckbxSabado = new JCheckBox("S�bado");
		
		btnCadastrar = new JButton("Cadastrar");
		btnLimpar = new JButton("Limpar");
		btnVoltar = new JButton("Voltar");
		
	}
	
	private void configurarComponentes() {
		
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
		lblTipoResiduo.setBounds(10, 322, 69, 43);
		
		lblDiaSemana.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDiaSemana.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiaSemana.setBounds(247, 322, 69, 43);
		
		lblLatitude.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLatitude.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLatitude.setBounds(10, 265, 69, 20);
		
		lblLongitude.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLongitude.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLongitude.setBounds(214, 260, 83, 30);
		
		
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
		
		txtLatitude.setFont(new Font("Arial", Font.PLAIN, 14));
		txtLatitude.setBounds(89, 265, 115, 20);
		
		txtLongitude.setFont(new Font("Arial", Font.PLAIN, 14));
		txtLongitude.setBounds(307, 265, 130, 20);
		
		chckbxPapel.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxPapel.setBounds(89, 325, 75, 20);
		
		chckbxPlastico.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxPlastico.setBounds(89, 345, 75, 20);
		
		chckbxVidro.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxVidro.setBounds(89, 365, 75, 20);
		
		chckbxMetal.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxMetal.setBounds(89, 385, 75, 20);
		
		chckbxOrganico.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxOrganico.setBounds(89, 405, 95, 20);
		
		chckbxSegunda.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxSegunda.setBounds(322, 325, 115, 20);
		
		chckbxTerca.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxTerca.setBounds(322, 345, 115, 20);
		
		chckbxQuarta.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxQuarta.setBounds(322, 365, 115, 20);
		
		chckbxQuinta.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxQuinta.setBounds(322, 385, 115, 20);
		
		chckbxSexta.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxSexta.setBounds(322, 405, 115, 20);
		
		chckbxSabado.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxSabado.setBounds(322, 425, 115, 20);
		
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCadastrar.setBounds(10, 540, 100, 37);
		
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCadastrar.setBounds(10, 468, 100, 37);
		
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.setBounds(171, 468, 100, 37);
		
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnVoltar.setBounds(337, 468, 100, 37);
		
	}
	
	private void adicionarComponentes() {
		
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
		getContentPane().add(chckbxVidro);
		getContentPane().add(chckbxMetal);
		getContentPane().add(chckbxOrganico);
		getContentPane().add(lblDiaSemana);
		getContentPane().add(chckbxSegunda);
		getContentPane().add(chckbxTerca);
		getContentPane().add(chckbxQuarta);
		getContentPane().add(chckbxQuinta);
		getContentPane().add(chckbxSexta);
		getContentPane().add(chckbxSabado);
		getContentPane().add(btnCadastrar);
		getContentPane().add(btnLimpar);
		getContentPane().add(btnVoltar);
		getContentPane().add(lblLatitude);
		getContentPane().add(lblLongitude);
		getContentPane().add(txtLatitude);
		getContentPane().add(txtLongitude);
		
	}
	
	private void configurarListeners() {
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
				dispose();
			}
		});
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String tipoResiduo = "";
				String diaSemana = "";
				if(chckbxPapel.isSelected()) {
					tipoResiduo = "Papel; ";
				}
				if(chckbxPlastico.isSelected()) {
					tipoResiduo += "Pl�stico; ";
				}
				if(chckbxVidro.isSelected()) {
					tipoResiduo += "Vidro; ";
				}
				if(chckbxMetal.isSelected()) {
					tipoResiduo += "Metal; ";
				}
				if(chckbxOrganico.isSelected()) {
					tipoResiduo += "Org�nico; ";
				}
				if(chckbxSegunda.isSelected()) {
					diaSemana = "Segunda; ";
				}
				if(chckbxTerca.isSelected()) {
					diaSemana += "Ter�a; ";
				}
				if(chckbxQuarta.isSelected()) {
					diaSemana += "Quarta; ";
				}
				if(chckbxQuinta.isSelected()) {
					diaSemana += "Quinta; ";
				}
				if(chckbxSexta.isSelected()) {
					diaSemana += "Sexta; ";
				}
				if(chckbxSabado.isSelected()) {
					diaSemana += "S�bado; ";
				}
				
				interessado.incluir(txtNome.getText(), txtEndereco.getText(), txtNumero.getText(), txtComplemento.getText(), txtEmail.getText(), txtTelefone.getText(), tipoResiduo, diaSemana, txtLatitude.getText(), txtLongitude.getText());
				JOptionPane.showMessageDialog(TelaCadastroInteressado.this, "Interessado cadastrado com sucesso!");
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNome.setText("");
				txtEndereco.setText("");
				txtNumero.setText("");
				txtComplemento.setText("");
				txtEmail.setText("");
				txtTelefone.setText("");
				chckbxPapel.setSelected(false);
				chckbxPlastico.setSelected(false);
				chckbxVidro.setSelected(false);
				chckbxMetal.setSelected(false);
				chckbxOrganico.setSelected(false);
				chckbxSegunda.setSelected(false);
				chckbxTerca.setSelected(false);
				chckbxQuarta.setSelected(false);
				chckbxQuinta.setSelected(false);
				chckbxSexta.setSelected(false);
				chckbxSabado.setSelected(false);
			}
		});

		
	}

}
