package aplicacao.map.waypoint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;


public class MyWaypoint extends DefaultWaypoint {
	
	private String name;
	private JButton button;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public JButton getButton() {
		return button;
	}
	public void setButton(JButton button) {
		this.button = button;
	}
	
	public MyWaypoint(String name, EventWaypoint event, GeoPosition coord) {
		super(coord);
		this.name = name;
		initButton(event);
		
	}
	
	public MyWaypoint() {
		
	
	}
	
	private void initButton(EventWaypoint event) {
		
		button = new ButtonWaypoint();
		
		button.addActionListener(new ActionListener () {
			
			public void actionPerformed(ActionEvent e) {
				
				event.selected(MyWaypoint.this);
				
			}
		});
		
	}

}
