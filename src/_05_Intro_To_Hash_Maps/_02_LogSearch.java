package _05_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
    /* 
     * Crate a HashMap of Integers for the keys and Strings for the values.
     * Create a GUI with three buttons. 
     * Button 1: Add Entry
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      After an ID is entered, use another input dialog to ask the user
     *      to enter a name. Add this information as a new entry to your
     *      HashMap.
     * 
     * Button 2: Search by ID
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      If that ID exists, display that name to the user.
     *      Otherwise, tell the user that that entry does not exist.
     * 
     * Button 3: View List
     *      When this button is clicked, display the entire list in a message
     *      dialog in the following format:
     *      ID: 123  Name: Harry Howard
     *      ID: 245  Name: Polly Powers
     *      ID: 433  Name: Oliver Ortega
     *      etc...
     * 
     * When this is complete, add a fourth button to your window.
     * Button 4: Remove Entry
     *      When this button is clicked, prompt the user to enter an ID using
     *      an input dialog.
     *      If this ID exists in the HashMap, remove it. Otherwise, notify the
     *      user that the ID is not in the list. 
     */
	HashMap<Integer, String> m = new HashMap<Integer, String>();
	
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	
	public static void main(String[] args) {
		_02_LogSearch l = new _02_LogSearch();
		l.setup();
	}

	void setup() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton("Add Entry");
		button2 = new JButton("Search by ID");
		button3 = new JButton("View List");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button1)) {
			//add entry
			m.put(Integer.parseInt(JOptionPane.showInputDialog("Enter an ID number: ")), JOptionPane.showInputDialog("Enter a name: "));
		}else if(e.getSource().equals(button2)) {
			//search by ID
			int key = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID number: "));
			if(m.containsKey(key)) {
				JOptionPane.showMessageDialog(null, m.get(key));
			}else {
				JOptionPane.showMessageDialog(null, "That ID number does not exist!");
			}
		}else if(e.getSource().equals(button3)) {
			//view list
			String display = "";
			for(Integer i : m.keySet()) {
				display += "ID: " + i + "  Name: " + m.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, display);
		}
	}
	
	
	
	
	
	
	
	
}
