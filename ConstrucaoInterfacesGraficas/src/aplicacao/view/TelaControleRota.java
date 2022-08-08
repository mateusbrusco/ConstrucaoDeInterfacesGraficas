package aplicacao.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		
	}
	
	private void criarComponentes() {

		JxMapViewer = new org.jxmapviewer.JXMapViewer();
		
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
		JxMapViewer.setBounds(10, 93, 764, 557);
		comboMapType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mapa", "Terra Virtual", "Híbrido", "Satélite" }));
		comboMapType.setBounds(614, 11, 140, 29);
		btnAddWaypoint.setBounds(10, 11, 140, 29);
		btnRemoveWaypoint.setBounds(160, 11, 140, 29);

		
	}
	
	private void adicionarComponentes() {

		getContentPane().add(JxMapViewer);
		JxMapViewer.addMouseListener(mm);
		JxMapViewer.addMouseMotionListener(mm);
		JxMapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(JxMapViewer));
		JxMapViewer.add(comboMapType);
		JxMapViewer.add(btnAddWaypoint);
		JxMapViewer.add(btnRemoveWaypoint);

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
				addWaypoint(new MyWaypoint("Teste 001", event, new GeoPosition(-27.5926165,-48.5240874)));
				addWaypoint(new MyWaypoint("Teste 002", event, new GeoPosition(-27.5984673,-48.5258536)));
			}
		});
		
		btnRemoveWaypoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearWaypoint();
			}
		});
		
		
	}


}
