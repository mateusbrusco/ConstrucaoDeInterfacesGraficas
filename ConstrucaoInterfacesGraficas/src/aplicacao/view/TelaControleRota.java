package aplicacao.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.MouseInputListener;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;

import aplicacao.map.waypoint.MyWaypoint;
import aplicacao.map.waypoint.WaypointRender;
import aplicacao.map.waypoint.EventWaypoint;


public class TelaControleRota extends JFrame {
	
	private JXMapViewer JxMapViewer;
	private MouseInputListener mm;
	private JComboBox<String> comboMapType;
	private JButton btnAddWaypoint;
	private JButton btnRemoveWaypoint;
	private EventWaypoint event;
	private JComboBox<String> cbRota;
	private JLabel lblTitulo;
	private JLabel lblRota;
	private JButton btnVoltar;
	
	private final Set<MyWaypoint> waypoints = new HashSet<>();
	
	public TelaControleRota() {
		
		criarComponentes();
		inicializarComponentes();
		configurarComponentes();
		adicionarComponentes();
		configurarListeners();
		
	}
	
	private void inicializarComponentes() {
	
		TileFactoryInfo info = new OSMTileFactoryInfo();
		DefaultTileFactory tileFactory = new DefaultTileFactory(info);
		mm = new PanMouseInputListener(JxMapViewer);
		JxMapViewer.setTileFactory(tileFactory);
		JxMapViewer.setBorder(null);
		GeoPosition geo = new GeoPosition(-27.5919309,-48.5227677);
		JxMapViewer.setAddressLocation(geo);
		JxMapViewer.setZoom(6);
		comboMapType = new JComboBox();
		btnAddWaypoint = new JButton("Adicionar Pontos");
		btnRemoveWaypoint = new JButton("Remover Pontos");
		event = getEvent();
		cbRota = new JComboBox();
		btnVoltar = new JButton("Voltar");
		
	}
	
	private void criarComponentes() {

		JxMapViewer = new org.jxmapviewer.JXMapViewer();
		lblTitulo = new JLabel("CONSULTA ROTAS E INTERESSADOS");
		lblRota = new JLabel("Selecione a rota: ");
		
	}
	
	private void addWaypoint(MyWaypoint waypoint) {
		
		for(MyWaypoint d:waypoints) {
			JxMapViewer.remove(d.getButton());
		}	
		
		waypoints.add(waypoint);
		initWaypoint();
		
	}
	
	private void initWaypoint() {
		
		WaypointPainter<MyWaypoint> wp = new WaypointRender();
		wp.setWaypoints(waypoints);
		JxMapViewer.setOverlayPainter(wp);
		
		for(MyWaypoint d:waypoints) {
			JxMapViewer.add(d.getButton());
		}
		
			
	}
	
	private void clearWaypoint() {
		
		for(MyWaypoint d:waypoints) {
			JxMapViewer.remove(d.getButton());
		}	
		
		waypoints.clear();
		initWaypoint();
		
	}
	
	private EventWaypoint getEvent() {
		
		return new EventWaypoint() {

			@Override
			public void selected(MyWaypoint waypoint) {
				
				JOptionPane.showMessageDialog(TelaControleRota.this, waypoint.getName());
				
			}
			
		};
		
	}
	
	private void configurarComponentes() {
		
		getContentPane().setLayout(null);
		JxMapViewer.setLayout(null);
		this.setSize(800, 700);
		this.setTitle("Controle de Rota");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		JxMapViewer.setBounds(10, 136, 764, 514);
		comboMapType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mapa", "Terra Virtual", "Híbrido", "Satélite" }));
		comboMapType.setBounds(614, 11, 140, 29);
		btnAddWaypoint.setBounds(10, 11, 140, 29);
		btnRemoveWaypoint.setBounds(160, 11, 140, 29);
		cbRota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione","Rota 1", "Rota 2", "Rota 3", "Rota 4", "Rota 5", "Rota 6", "Rota 7", "Rota 8", "Rota 9", "Rota 10", "Rota 11", "Rota 12", "Rota 13", "Rota 14", "Rota 15" }));
		cbRota.setBounds(131, 96, 140, 29);
		
		lblTitulo.setOpaque(true);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBackground(Color.DARK_GRAY);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 28));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 11, 764, 64);
		
		lblRota.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRota.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRota.setBounds(10, 99, 111, 20);
		
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnVoltar.setBounds(674, 88, 100, 37);
		
	}
	
	private void adicionarComponentes() {

		getContentPane().add(JxMapViewer);
		JxMapViewer.addMouseListener(mm);
		JxMapViewer.addMouseMotionListener(mm);
		JxMapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(JxMapViewer));
		JxMapViewer.add(comboMapType);
		JxMapViewer.add(btnAddWaypoint);
		JxMapViewer.add(btnRemoveWaypoint);
		getContentPane().add(cbRota);
		getContentPane().add(lblTitulo);
		getContentPane().add(lblRota);
		getContentPane().add(btnVoltar);

	}
	
	private void configurarListeners() {
		
		comboMapType.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			
				TileFactoryInfo info;
				int index = comboMapType.getSelectedIndex();
			
				if(index == 0) {
				
					info = new OSMTileFactoryInfo();
				
				} else if(index == 1){
				
					info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
				
				} else if(index == 2){
				
					info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.HYBRID);
				
				} else {
				
				info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.SATELLITE);
				
				}
			
				DefaultTileFactory tileFactory = new DefaultTileFactory(info);
				JxMapViewer.setTileFactory(tileFactory);

			}
		});

		
		btnAddWaypoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(cbRota.getSelectedIndex()) {
				case 0: 
					JOptionPane.showMessageDialog(TelaControleRota.this, "Favor selecionar uma rota válida");
					break;
				case 1:
					addWaypoint(new MyWaypoint("José da Costa", event, new GeoPosition(-27.613487, -48.526637)));
					addWaypoint(new MyWaypoint("Amanda Furtado", event, new GeoPosition(-27.6130533,-48.5266987)));
					addWaypoint(new MyWaypoint("Pato Donald", event, new GeoPosition(-27.6124395,-48.5254002)));
					addWaypoint(new MyWaypoint("Bruce Wayne", event, new GeoPosition(-27.6116313,-48.525249)));
					addWaypoint(new MyWaypoint("Posto BR", event, new GeoPosition(-27.6108243,-48.5247112)));
					break;
				case 2:
					addWaypoint(new MyWaypoint("Mercado É de Casa", event, new GeoPosition(-27.585721, -48.5003215)));
					addWaypoint(new MyWaypoint("Irmão do Jorel", event, new GeoPosition(-27.5849473,-48.5014493)));
					addWaypoint(new MyWaypoint("Josefina dias", event, new GeoPosition(-27.5833789,-48.5032353)));
					addWaypoint(new MyWaypoint("Epagri", event, new GeoPosition(-27.5813328,-48.5041379)));
					addWaypoint(new MyWaypoint("Posto BR", event, new GeoPosition(-27.580036,-48.5046389)));
					break;
				}
					

			}
		});
		
		btnRemoveWaypoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearWaypoint();
			}
		});
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
				dispose();
			}
		});
		
		
	}


}
