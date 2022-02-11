package control.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;

import helpers.Helpers;
import view.input.RaceInput;
import view.input.RosteredPlayerInput;
import view.output.RaceField;

public class RaceListener implements ActionListener{
	
	private int previous;
	private RaceInput input;
	private RaceField output;
	
	private ArrayList<RosteredPlayerInput>rosteredPlayerInput;
	
	public RaceListener(RaceInput i,RaceField o) {
		this.input=i;
		this.output=o;
		this.previous=0;
		
		this.rosteredPlayerInput=new ArrayList<RosteredPlayerInput>();
		
		this.input.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int current=this.input.getSelectedIndex();
		if(this.previous==current)
			return;
		this.previous=current;
		
		this.output.setText(Helpers.RACES[current]);
		
		for(RosteredPlayerInput a:this.rosteredPlayerInput)
			a.setValues(current);
	}

	public void addRosteredPlayerInput(RosteredPlayerInput rpi) {
		this.rosteredPlayerInput.add(rpi);
	}
}
