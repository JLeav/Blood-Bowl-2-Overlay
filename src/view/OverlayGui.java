package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OverlayGui extends JFrame{
	
	private GridBagConstraints gbc;
	private OverlayInput input;
	
	private JLabel[]racesField;

	public static void main(String[] args) {
		OverlayGui asdf=new OverlayGui();
		asdf.pack();
		asdf.setVisible(true);
	}
	
	public OverlayGui() {
		super("Testing things");//<<<>>>Change this later, figure out how to change the icon
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.initGbc();
		
		this.initRacesField();//<<<>>>Other parts of the gui get added here
		
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
		this.gbc.ipadx=50;
		this.gbc.ipady=50;
		this.getContentPane().setLayout(new GridBagLayout());
	}
	
	private void initRacesField() {
		this.racesField=new JLabel[2];
		
		for(int a=0;a<2;a++) {
			this.racesField[a]=new JLabel(a==0?"Human":"Human");
			myAdd(this.racesField[a]);this.gbc.gridx++;
		}
	}
	
	JLabel[] getRacesField() {return this.racesField;}
}
