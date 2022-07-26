package aplicacao.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import aplicacao.controller.InteressadoController;
import aplicacao.model.InteressadoModel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaExcluiInteressado extends JFrame {
	
	private JLabel lblTitulo;
	private JLabel lblNome;
	private JLabel lblEndereco;
	private JLabel lblNumero;
	private JLabel lblComplemento;
	private JLabel lblEmail;
	private JLabel lblTelefone;
	private JLabel lblTipoResiduo;
	private JLabel lblDiaSemana;
	
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
	private JCheckBox chckbxSegunda;
	private JCheckBox chckbxTerca;
	private JCheckBox chckbxQuarta;
	private JCheckBox chckbxQuinta;
	private JCheckBox chckbxSexta;
	private JCheckBox chckbxSabado;
	
	private JButton btnExcluir;
	private JButton btnLimpar;
	private JButton btnVoltar;
	private JButton btnBuscar;
	
	private InteressadoController interessado;
	
	
	public TelaExcluiInteressado() {
		
		criarComponentes();
		configurarComponentes();
		adicionarComponentes();
		configurarListeners();
		
	}
	
	private void criarComponentes() {
		interessado = new InteressadoController();
		lblTitulo = new JLabel("EXCLUI CADASTRO DE INTERESSADO(A)");
		lblNome = new JLabel("Nome: ");
		lblEndereco = new JLabel("Endere�o: ");
		lblNumero = new JLabel("N�mero: ");
		lblComplemento = new JLabel("Complemento: ");
		lblEmail = new JLabel("E-mail: ");
		lblTelefone = new JLabel("Telefone: ");
		lblTipoResiduo = new JLabel("<html>Tipos de\n Res�duos:</html>");
		lblDiaSemana = new JLabel("<html>Dias da\n Semana:</html>");
		
		txtNome = new JTextField(20);
		txtEndereco = new JTextField(50);
		txtNumero = new JTextField(10);
		txtComplemento = new JTextField(20);
		txtEmail = new JTextField(20);
		txtTelefone = new JTextField(10);
		
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
		
		btnExcluir = new JButton("Excluir");
		btnLimpar = new JButton("Limpar");
		btnVoltar = new JButton("Voltar");
		btnBuscar = new JButton("Buscar");
	}
	
	private void configurarComponentes() {
		
		getContentPane().setLayout(null);
		this.setSize(800, 700);
		this.setTitle("Exclui Cadastro de Interessado(a)");
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
		
		lblDiaSemana.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDiaSemana.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiaSemana.setBounds(247, 265, 69, 43);
		
		
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
		chckbxPlastico.setBounds(89, 288, 75, 20);
		
		chckbxVidro.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxVidro.setBounds(89, 308, 75, 20);
		
		chckbxMetal.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxMetal.setBounds(89, 328, 75, 20);
		
		chckbxOrganico.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxOrganico.setBounds(89, 348, 95, 20);
		
		chckbxSegunda.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxSegunda.setBounds(322, 268, 115, 20);
		
		chckbxTerca.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxTerca.setBounds(322, 288, 115, 20);
		
		chckbxQuarta.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxQuarta.setBounds(322, 308, 115, 20);
		
		chckbxQuinta.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxQuinta.setBounds(322, 328, 115, 20);
		
		chckbxSexta.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxSexta.setBounds(322, 348, 115, 20);
		
		chckbxSabado.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxSabado.setBounds(322, 368, 115, 20);
		
		btnExcluir.setFont(new Font("Arial", Font.PLAIN, 14));
		btnExcluir.setBounds(10, 468, 100, 37);
				
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.setBounds(230, 468, 100, 37);
		
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnVoltar.setBounds(340, 468, 100, 37);
		
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBuscar.setBounds(120, 468, 100, 37);
		
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
		getContentPane().add(btnExcluir);
		getContentPane().add(btnLimpar);
		getContentPane().add(btnVoltar);
		getContentPane().add(btnBuscar);
		
	}
	
	private void configurarListeners() {
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
				dispose();
			}
		});
		
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				interessado.excluir(txtNome.getText());
				JOptionPane.showMessageDialog(TelaExcluiInteressado.this, "Interessado exclu�do com sucesso!");
			}
		});
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				InteressadoController interessadoController = new InteressadoController();
				
				try {
					ArrayList<InteressadoModel> interessados = interessadoController.consultar(nome);
					
					interessados.forEach((InteressadoModel interessado) -> {
						txtEndereco.setText(interessado.getEnderecoInteressado());
						txtNumero.setText(interessado.getNumeroInteressado());
						txtComplemento.setText(interessado.getComplementoInteressado());
						txtEmail.setText(interessado.getEmailInteressado());
						txtTelefone.setText(interessado.getTelefoneInteressado());
						
						if(interessado.getTipoResiduoInteressado().contains("Papel")) {
							chckbxPapel.setSelected(true);
						}
						if(interessado.getTipoResiduoInteressado().contains("Pl�stico")) {
							chckbxPlastico.setSelected(true);
						}
						if(interessado.getTipoResiduoInteressado().contains("Vidro")) {
							chckbxVidro.setSelected(true);
						}
						if(interessado.getTipoResiduoInteressado().contains("Metal")) {
							chckbxMetal.setSelected(true);
						}
						if(interessado.getTipoResiduoInteressado().contains("Org�nico")) {
							chckbxOrganico.setSelected(true);
						}
						
						if(interessado.getDiaSemanaInteressado().contains("Segunda")) {
							chckbxSegunda.setSelected(true);
						}
						if(interessado.getDiaSemanaInteressado().contains("Ter�a")) {
							chckbxTerca.setSelected(true);
						}
						if(interessado.getDiaSemanaInteressado().contains("Quarta")) {
							chckbxQuarta.setSelected(true);
						}
						if(interessado.getDiaSemanaInteressado().contains("Quinta")) {
							chckbxQuinta.setSelected(true);
						}
						if(interessado.getDiaSemanaInteressado().contains("Sexta")) {
							chckbxSexta.setSelected(true);
						}
						if(interessado.getDiaSemanaInteressado().contains("S�bado")) {
							chckbxSabado.setSelected(true);
						}
					});
					
				} catch(Exception x) {
					
					x.printStackTrace();
					
				}
				
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
