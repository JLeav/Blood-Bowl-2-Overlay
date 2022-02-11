package view.output;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class RosteredPlayerField extends JPanel{

	private JLabel position;
	//<<<>>>Later have things for added skills, perms (&mngs), and spp
	
	public RosteredPlayerField() {
		position=new JLabel("");
		//<<<>>>Figure out a way to have the items added in an order (might not be l2r)
		//<<<>>>Naturally adds horizontally
		this.add(position);
	}
	
	public void setPosition(String p) {
		this.position.setText(p);//<<<>>>Later this'll be an icon. The string will be a string of the file name
	}
}
