package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	
	
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	
	ArrayList<String> names = new ArrayList<>();
	String message = "";
	
	public static void main(String[] args) {
		
		
		_02_GuestBook b = new _02_GuestBook();
		b.setup();
	}
	
	void setup() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton("Add Name");
		button2 = new JButton("View Names");
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(button1)) {
			//add name
			names.add(JOptionPane.showInputDialog("Enter a name: "));
		}else if(arg0.getSource().equals(button2)) {
			//view names
			message = "";
			for(int i = 0; i<names.size(); i++) {
				message += "Guest #" + (i+1) + ": " + names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, message);
			
		}
		
	}
	
	
	
	
	

}
