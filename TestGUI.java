package Projekt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TestGUI extends JFrame implements ActionListener{
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("HEJ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300,300);
	   // frame.setLayout(null);
	    
        frame.getContentPane().setLayout(new FlowLayout());
	    
	   // frame.getContentPane().setBackground(Color.YELLOW);
	    //JButton button = new JButton("Press");
	    //frame.getContentPane().add(button); // Adds Button to content pane of frame
	  //  frame.setVisible(true);
	    
	    JMenuBar mb = new JMenuBar();
	    JMenu m1 = new JMenu("File");
	    JMenu m2 = new JMenu("Hej");
	    JMenu m3 = new JMenu("hallå");
	    mb.add(m1);
	    mb.add(m2);
	    mb.add(m3);
	    JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);
        
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton search = new JButton("Search");
        panel.add(label); // Components Added using Flow Layout
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(search);
        
        JTextArea ta = new JTextArea();

        // if true the component paints every pixel within its bounds
        label.setOpaque(true);
 
        // sets the background color of this component
        // the background color is used only if the component is opaque
        label.setBackground(Color.BLUE);
 
        // add label to frame
        frame.add(label);
        frame.getContentPane().setBackground(Color.red);
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        
        frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
