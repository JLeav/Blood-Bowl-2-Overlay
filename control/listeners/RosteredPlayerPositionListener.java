package control.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import helpers.Helpers;
import view.input.RosteredPlayerInput;
import view.output.RosteredPlayerField;

public class RosteredPlayerPositionListener implements ActionListener{
	
	private int previous,raceIndex;
	private RosteredPlayerInput input;
	private RosteredPlayerField output;
	
	public RosteredPlayerPositionListener(RosteredPlayerInput i,RosteredPlayerField o) {
		this.input=i;
		this.output=o;
		this.previous=0;
		this.raceIndex=0;
		
		this.input.getPositionInput().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int current=this.input.getPositionInput().getSelectedIndex();
		if(this.previous==current)
			return;
		
		
		if(current<=0) {
			this.previous=0;
			this.output.setPosition("");
			//<<<>>>Blank the rest of this, don't make it editable
			return;
		}
		if(previous==0) {
			//<<<>>>Un-"don't make it editable" this
		}
		this.previous=current;
		this.output.setPosition(Helpers.POSITIONS[this.raceIndex][current-1]);
		//<<<>>>Reset the rest of the 
	}
	
	public void setRaceIndex(int i) {this.raceIndex=i;}

}
