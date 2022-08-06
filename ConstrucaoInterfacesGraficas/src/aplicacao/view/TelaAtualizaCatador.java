package aplicacao.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import aplicacao.controller.CatadorController;
import aplicacao.controller.InteressadoController;
import aplicacao.model.CatadorModel;
import aplicacao.model.InteressadoModel;

public class TelaAtualizaCatador extends JFrame {
	
	private JLabel lblTitulo;
	private JLabel lblNome;
	private JLabel lblEndereco;
	private JLabel lblNumero;
	private JLabel lblComplemento;
	private JLabel lblEmail;
	private JLabel lblTelefone;
	private JLabel lblTipoResiduo;
	private JLabel lblDiaSemana;
	private JLabel lblRota;
	
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
	private JCheckBox chckbxRota1;
	private JCheckBox chckbxRota2;
	private JCheckBox chckbxRota3;
	private JCheckBox chckbxRota4;
	private JCheckBox chckbxRota5;
	private JCheckBox chckbxRota6;
	private JCheckBox chckbxRota7;
	private JCheckBox chckbxRota8;
	private JCheckBox chckbxRota9;
	private JCheckBox chckbxRota10;
	private JCheckBox chckbxRota11;
	private JCheckBox chckbxRota12;
	private JCheckBox chckbxRota13;
	private JCheckBox chckbxRota14;
	private JCheckBox chckbxRota15;
	
	private CatadorController catador;
	
	
	private JButton btnAtualizar;
	private JButton btnLimpar;
	private JButton btnVoltar;
	private JButton btnBuscar;
	
	
	public TelaAtualizaCatador() {
		
		criarComponentes();
		configurarComponentes();
		adicionarComponentes();
		configurarListeners();
		
	}
	
	private void criarComponentes() {
		catador = new CatadorController();
		lblTitulo = new JLabel("ATUALIZA CADASTRO DE CATADOR(A)");
		lblNome = new JLabel("Nome: ");
		lblEndereco = new JLabel("Endereço: ");
		lblNumero = new JLabel("Número: ");
		lblComplemento = new JLabel("Complemento: ");
		lblEmail = new JLabel("E-mail: ");
		lblTelefone = new JLabel("Telefone: ");
		lblTipoResiduo = new JLabel("<html>Tipos de\n Resíduos:</html>");
		lblDiaSemana = new JLabel("<html>Dias da\n Semana:</html>");
		lblRota = new JLabel("<html>Rotas\n Atendidas:</html>");
		
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
		chckbxSegunda = new JCheckBox("Segunda-feira");
		chckbxTerca = new JCheckBox("Terça-feira");
		chckbxQuarta = new JCheckBox("Quarta-feira");
		chckbxQuinta = new JCheckBox("Quinta-feira");
		chckbxSexta = new JCheckBox("Sexta-feira");
		chckbxSabado = new JCheckBox("Sábado");
		chckbxRota1 = new JCheckBox("Rota 1");
		chckbxRota2 = new JCheckBox("Rota 2");
		chckbxRota3 = new JCheckBox("Rota 3");
		chckbxRota4 = new JCheckBox("Rota 4");
		chckbxRota5 = new JCheckBox("Rota 5");
		chckbxRota6 = new JCheckBox("Rota 6");
		chckbxRota7 = new JCheckBox("Rota 7");
		chckbxRota8 = new JCheckBox("Rota 8");
		chckbxRota9 = new JCheckBox("Rota 9");
		chckbxRota10 = new JCheckBox("Rota 10");
		chckbxRota11 = new JCheckBox("Rota 11");
		chckbxRota12 = new JCheckBox("Rota 12");
		chckbxRota13 = new JCheckBox("Rota 13");
		chckbxRota14 = new JCheckBox("Rota 14");
		chckbxRota15 = new JCheckBox("Rota 15");
		
		btnAtualizar = new JButton("Atualizar");
		btnLimpar = new JButton("Limpar");
		btnVoltar = new JButton("Voltar");
		btnBuscar = new JButton("Buscar");
		
	}
	
	private void configurarComponentes() {
		
		getContentPane().setLayout(null);
		this.setSize(800, 700);
		this.setTitle("Atualiza Cadastro de Catador(a)");
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
		
		lblRota.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRota.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRota.setBounds(10, 414, 69, 43);
		
		
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
		
		chckbxRota1.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota1.setBounds(89, 414, 115, 20);
		
		chckbxRota2.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota2.setBounds(89, 434, 115, 20);
		
		chckbxRota3.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota3.setBounds(89, 454, 115, 20);
		
		chckbxRota4.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota4.setBounds(89, 474, 115, 20);
		
		chckbxRota5.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota5.setBounds(89, 494, 115, 20);
		
		chckbxRota6.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota6.setBounds(223, 414, 75, 20);
		
		chckbxRota7.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota7.setBounds(223, 434, 75, 20);
		
		chckbxRota8.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota8.setBounds(223, 454, 75, 20);
		
		chckbxRota9.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota9.setBounds(223, 474, 75, 20);
		
		chckbxRota10.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota10.setBounds(223, 494, 75, 20);
		
		chckbxRota11.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota11.setBounds(362, 414, 75, 20);
		
		chckbxRota12.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota12.setBounds(362, 434, 75, 20);
		
		chckbxRota13.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota13.setBounds(362, 454, 75, 20);
		
		chckbxRota14.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota14.setBounds(362, 474, 75, 20);
		
		chckbxRota15.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxRota15.setBounds(362, 494, 75, 20);
		
		
		btnAtualizar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAtualizar.setBounds(10, 602, 100, 37);
	
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.setBounds(230, 602, 100, 37);
		
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnVoltar.setBounds(340, 602, 100, 37);
		
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBuscar.setBounds(120, 602, 100, 37);
		
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
		getContentPane().add(chckbxRota1);
		getContentPane().add(chckbxRota2);
		getContentPane().add(chckbxRota3);
		getContentPane().add(chckbxRota4);
		getContentPane().add(chckbxRota5);
		getContentPane().add(chckbxRota6);
		getContentPane().add(chckbxRota7);
		getContentPane().add(chckbxRota8);
		getContentPane().add(chckbxRota9);
		getContentPane().add(chckbxRota10);
		getContentPane().add(chckbxRota11);
		getContentPane().add(chckbxRota12);
		getContentPane().add(chckbxRota13);
		getContentPane().add(chckbxRota14);
		getContentPane().add(chckbxRota15);
		getContentPane().add(lblRota);
		getContentPane().add(btnAtualizar);
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
		
	

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				CatadorController CatadorController = new CatadorController();
				
				try {
					ArrayList<CatadorModel> catadores = CatadorController.consultar(nome);
					
					catadores.forEach((CatadorModel catador) -> {
						txtEndereco.setText(catador.getEnderecoCatador());
						txtNumero.setText(catador.getNumeroCatador());
						txtComplemento.setText(catador.getComplementoCatador());
						txtEmail.setText(catador.getEmailCatador());
						txtTelefone.setText(catador.getTelefoneCatador());
						
						if(catador.getTipoResiduoColetado().contains("Papel")) {
							chckbxPapel.setSelected(true);
						}
						if(catador.getTipoResiduoColetado().contains("Plástico")) {
							chckbxPlastico.setSelected(true);
						}
						if(catador.getTipoResiduoColetado().contains("Vidro")) {
							chckbxVidro.setSelected(true);
						}
						if(catador.getTipoResiduoColetado().contains("Metal")) {
							chckbxMetal.setSelected(true);
						}
						if(catador.getTipoResiduoColetado().contains("Orgânico")) {
							chckbxOrganico.setSelected(true);
						}
						
						if(catador.getDiaSemanaEmQueColeta().contains("Segunda")) {
							chckbxSegunda.setSelected(true);
						}
						if(catador.getDiaSemanaEmQueColeta().contains("Terça")) {
							chckbxTerca.setSelected(true);
						}
						if(catador.getDiaSemanaEmQueColeta().contains("Quarta")) {
							chckbxQuarta.setSelected(true);
						}
						if(catador.getDiaSemanaEmQueColeta().contains("Quinta")) {
							chckbxQuinta.setSelected(true);
						}
						if(catador.getDiaSemanaEmQueColeta().contains("Sexta")) {
							chckbxSexta.setSelected(true);
						}
						if(catador.getDiaSemanaEmQueColeta().contains("Sábado")) {
							chckbxSabado.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 1")) {
							chckbxRota1.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 2")) {
							chckbxRota2.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 3")) {
							chckbxRota3.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 4")) {
							chckbxRota4.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 5")) {
							chckbxRota5.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 6")) {
							chckbxRota6.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 7")) {
							chckbxRota7.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 8")) {
							chckbxRota8.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 9")) {
							chckbxRota9.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 10")) {
							chckbxRota10.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 11")) {
							chckbxRota11.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 12")) {
							chckbxRota12.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 13")) {
							chckbxRota13.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 14")) {
							chckbxRota14.setSelected(true);
						}
						if(catador.getRotas().contains("Rota 15")) {
							chckbxRota15.setSelected(true);
						}

					});
					
				} catch(Exception x) {
					
					x.printStackTrace();
					
				}
				
			}
		});


		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String tipoResiduo = "";
				String diaSemana = "";
				String rotas = "";
				if(chckbxPapel.isSelected()) {
					tipoResiduo = "Papel; ";
				}
				if(chckbxPlastico.isSelected()) {
					tipoResiduo += "Plástico; ";
				}
				if(chckbxVidro.isSelected()) {
					tipoResiduo += "Vidro; ";
				}
				if(chckbxMetal.isSelected()) {
					tipoResiduo += "Metal; ";
				}
				if(chckbxOrganico.isSelected()) {
					tipoResiduo += "Orgânico; ";
				}
				if(chckbxSegunda.isSelected()) {
					diaSemana = "Segunda; ";
				}
				if(chckbxTerca.isSelected()) {
					diaSemana += "Terça; ";
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
					diaSemana += "Sábado; ";
				}
				if(chckbxRota1.isSelected()) {
					rotas = "Rota 1; ";
				}
				if(chckbxRota2.isSelected()) {
					rotas += "Rota 2; ";
				}
				if(chckbxRota3.isSelected()) {
					rotas += "Rota 3; ";
				}
				if(chckbxRota4.isSelected()) {
					rotas += "Rota 4; ";
				}
				if(chckbxRota5.isSelected()) {
					rotas += "Rota 5; ";
				}
				if(chckbxRota6.isSelected()) {
					rotas += "Rota 6; ";
				}
				if(chckbxRota7.isSelected()) {
					rotas += "Rota 7; ";
				}
				if(chckbxRota8.isSelected()) {
					rotas += "Rota 8; ";
				}
				if(chckbxRota9.isSelected()) {
					rotas += "Rota 9; ";
				}
				if(chckbxRota10.isSelected()) {
					rotas += "Rota 10; ";
				}
				if(chckbxRota11.isSelected()) {
					rotas += "Rota 11; ";
				}
				if(chckbxRota12.isSelected()) {
					rotas += "Rota 12; ";
				}
				if(chckbxRota13.isSelected()) {
					rotas += "Rota 13; ";
				}
				if(chckbxRota14.isSelected()) {
					rotas += "Rota 14; ";
				}
				if(chckbxRota15.isSelected()) {
					rotas += "Rota 15; ";
				}

				catador.alterar(txtNome.getText(), txtEndereco.getText(), txtNumero.getText(), txtComplemento.getText(), txtEmail.getText(), txtTelefone.getText(), tipoResiduo, diaSemana, rotas);
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
				chckbxRota1.setSelected(false);
				chckbxRota2.setSelected(false);
				chckbxRota3.setSelected(false);
				chckbxRota4.setSelected(false);
				chckbxRota5.setSelected(false);
				chckbxRota5.setSelected(false);
				chckbxRota6.setSelected(false);
				chckbxRota7.setSelected(false);
				chckbxRota8.setSelected(false);
				chckbxRota9.setSelected(false);
				chckbxRota10.setSelected(false);
				chckbxRota11.setSelected(false);
				chckbxRota12.setSelected(false);
				chckbxRota13.setSelected(false);
				chckbxRota14.setSelected(false);
				chckbxRota15.setSelected(false);
			}
		});

		
		
	}


}
