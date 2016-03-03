/************************************************
 * Nopel										*
 * Author: Kuntharith Buon						*
 * Updated: 03/03/16							*
 ************************************************/

package nopel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class MainFrame {
	private JFrame userFrame;
	protected final int WIDTH = 800, HEIGHT = 600;
	protected final int BTN_WIDTH = 150, BTN_HEIGHT = 75;
	JButton b = new JButton();
	public MainFrame() {
		//Frame
		userFrame = new JFrame();
		userFrame.setSize(WIDTH, HEIGHT);
		userFrame.setVisible(true);
		userFrame.setTitle("Nopel");
		userFrame.setResizable(true);
		userFrame.setDefaultCloseOperation(userFrame.EXIT_ON_CLOSE);
		userFrame.setLayout(new GridLayout(1, 2));
		userFrame.getContentPane().setBackground(Color.DARK_GRAY);
		
		//Test Separator
		JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
		userFrame.getContentPane().add(new JLabel("Label"));
		userFrame.getContentPane().add(separator);
		
//		//Button
//		b.setText("BUTTON");
//		b.setSize(10, 30);
//		b.setVisible(true);
//		b.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				System.out.println("Hello World");
//			}
//		});
//		
//		b.setBackground(Color.white);
//	
//		userFrame.add(b);
		userFrame.validate();
	}
}
