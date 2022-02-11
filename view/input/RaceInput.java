package view.input;

import javax.swing.JComboBox;

import control.listeners.RaceListener;
import helpers.Helpers;
import view.output.RaceField;

public class RaceInput extends JComboBox<String>{
	
	private RaceListener action;

	public RaceInput(RaceField output) {
		super(Helpers.RACES);
		
		this.action=new RaceListener(this,output);
	}

	public void addRosteredPlayerInput(RosteredPlayerInput rosteredPlayerInput) {
		this.action.addRosteredPlayerInput(rosteredPlayerInput);
	}
}
