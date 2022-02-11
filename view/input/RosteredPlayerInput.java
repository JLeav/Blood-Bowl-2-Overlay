package view.input;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import control.listeners.RosteredPlayerPositionListener;
import helpers.Helpers;
import view.output.RosteredPlayerField;

public class RosteredPlayerInput extends JPanel{
	
	private JComboBox<String>positionInput;
	
	private RosteredPlayerPositionListener positionAction;
	
	public RosteredPlayerInput(RosteredPlayerField output) {
		this.positionInput=new JComboBox<String>();
		this.add(positionInput);
		
		this.positionAction=new RosteredPlayerPositionListener(this,output);
		
		this.setValues(0);
	}
	
	public void setValues(int index) {
		this.positionAction.setRaceIndex(index);
		this.positionInput.removeAllItems();
		this.positionInput.addItem("");
		for(String a:Helpers.POSITIONS[index])
			this.positionInput.addItem(a);
		//<<<>>>this.positionInput.setSelectedIndex(0); TEST IF NEEDED
	}
	
	public JComboBox<String>getPositionInput(){return this.positionInput;}
}
