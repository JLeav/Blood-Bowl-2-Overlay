package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class OverlayInput extends JDialog {
	
	private GridBagConstraints gbc;
	
	private JComboBox<String>[]racesInput;//<<<>>>Maybe make this it's own class later on so that I'm not storing the listener here too. Also helps with keeping the naming consistent
	private RacesListener[]racesListener;
	
	
	public final String[]RACES= {"Human","Orc","Dwarf","Skaven","Dark Elf"};
	
	public OverlayInput(OverlayGui owner) {
		super(owner);
		
		this.initGbc();
		
		this.initRacesInput(owner.getRacesField());
		
		this.pack();
		this.setVisible(true);
	}
	
	private void myAdd(JComponent a) {this.getContentPane().add(a,this.gbc);}
	
	private void initGbc() {
		this.gbc=new GridBagConstraints();
		this.gbc.gridx=0;
		this.gbc.gridy=0;
		this.gbc.ipadx=50;
		this.gbc.ipady=50;
		this.getContentPane().setLayout(new GridBagLayout());
	}
	
	private void initRacesInput(JLabel[]racesField) {
		this.racesInput=new JComboBox[2];
		this.racesListener=new RacesListener[2];
		
		for(int a=0;a<2;a++) {
			this.racesInput[a]=new JComboBox<String>(RACES);
			this.myAdd(racesInput[a]);this.gbc.gridx++;
			
			this.racesListener[a]=new RacesListener(this.racesInput[a],racesField[a]);
		}
		
		
	}
}
