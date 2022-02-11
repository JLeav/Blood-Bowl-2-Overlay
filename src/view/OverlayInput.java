package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;

import control.listeners.RaceListener;
import view.input.RaceInput;
import view.input.RosteredPlayerInput;
import view.output.RaceField;
import view.output.RosteredPlayerField;

public class OverlayInput extends JDialog {
	
	private GridBagConstraints gbc;
	
	private RaceInput[]racesInput;
	private RosteredPlayerInput[][]rosteredPlayerInput;
	
	public OverlayInput(OverlayGui owner) {
		super(owner);
		
		this.initGbc();
		
		this.initRacesInput(owner.getRaceField());
		this.initRosteredPlayerInput(owner.getRosteredPlayerField());
		
		this.pack();
		this.setVisible(true);
	}
	
	private void myAdd(JComponent a) {this.getContentPane().add(a,this.gbc);}
	
	private void initGbc() {
		this.gbc=new GridBagConstraints();
		this.gbc.gridx=0;
		this.gbc.gridy=0;
		this.gbc.ipadx=5;
		this.gbc.ipady=5;
		this.getContentPane().setLayout(new GridBagLayout());
	}
	
	private void initRacesInput(RaceField[]racesField) {
		this.gbc.gridy=0;this.gbc.gridx=0;
		
		this.racesInput=(RaceInput[])new RaceInput[2];
		
		for(int a=0;a<2;a++) {
			this.racesInput[a]=new RaceInput(racesField[a]);
			this.myAdd(racesInput[a]);this.gbc.gridx++;
		}
	}
	
	private void initRosteredPlayerInput(RosteredPlayerField[][]rosteredPlayerField) {
		this.gbc.gridy=1;this.gbc.gridx=0;
		
		this.rosteredPlayerInput=new RosteredPlayerInput[2][16];
		
		for(int a=0;a<2;a++) {
			for(int b=0;b<16;b++) {
				this.rosteredPlayerInput[a][b]=new RosteredPlayerInput(rosteredPlayerField[a][b]);
				this.racesInput[a].addRosteredPlayerInput(this.rosteredPlayerInput[a][b]);
				this.myAdd(this.rosteredPlayerInput[a][b]);this.gbc.gridy++;
			}
			this.gbc.gridx++;this.gbc.gridy=1;
		}
	}
}
