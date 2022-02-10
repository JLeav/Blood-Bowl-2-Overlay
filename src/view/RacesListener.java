package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class RacesListener implements ActionListener{
	
	private JComboBox<String>input;
	private JLabel output;
	
	public RacesListener(JComboBox<String>i,JLabel o) {
		this.input=i;
		this.output=o;
		
		this.input.addActionListener(this);//<<<>>>This might crash since the full thing doesn't exist yet?
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//<<<>>>Make sure that this doesn't trigger when selecting the same item as before
		String current=this.output.getText(),
				replace=(String)this.input.getSelectedItem();
		if(current.equals(replace))
			return;
		
		this.output.setText(replace);
		System.out.println("Did thing");
	}
}
