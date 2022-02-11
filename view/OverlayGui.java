package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import helpers.Helpers;
import view.output.RosteredPlayerField;
import view.output.RaceField;

public class OverlayGui extends JFrame{
	
	private GridBagConstraints gbc;
	private OverlayInput input;
	
	private RaceField[]raceField;
	private RosteredPlayerField[][]rosteredPlayerField;

	public static void main(String[] args) {
		OverlayGui asdf=new OverlayGui();
		asdf.pack();
		asdf.setVisible(true);
	}
	
	public OverlayGui() {
		super("Testing things");//<<<>>>Change this later, figure out how to change the icon
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.initGbc();
		
		this.initRaceField();//<<<>>>Other parts of the gui get added here
		this.initRosteredPlayersField();//<<<>>>Add to this later, currently just a label for the player positions
		
		this.input=new OverlayInput(this);
		
		//<<<>>>Make a gui
		//<<<>>>Text to be replaced by images later for race selections
		
		//<<<>>>Nothing else for now
		//<<<>>>Just make sure that everything works with updating mid-thing
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
	
	private void initRaceField() {
		this.gbc.gridy=0;this.gbc.gridx=0;
		
		this.raceField=new RaceField[2];
		
		for(int a=0;a<2;a++) {
			this.raceField[a]=new RaceField(Helpers.RACES[0]);
			myAdd(this.raceField[a]);this.gbc.gridx++;
		}
	}
	
	private void initRosteredPlayersField() {
		this.gbc.gridy=1;this.gbc.gridx=0;
		
		this.rosteredPlayerField=new RosteredPlayerField[2][16];
		
		for(int a=0;a<2;a++) {
			for(int b=0;b<16;b++) {
				this.rosteredPlayerField[a][b]=new RosteredPlayerField();
				this.myAdd(this.rosteredPlayerField[a][b]);this.gbc.gridy++;
			}
			this.gbc.gridx++;this.gbc.gridy=1;
		}
	}
	
	public RaceField[] getRaceField() {return this.raceField;}
	public RosteredPlayerField[][]getRosteredPlayerField(){return this.rosteredPlayerField;}
}
