/** @author Ashishkumar Gupta */
package com.ashish.swing.tools;

import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class IPFinder extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 8044778205173488415L;
	
	JLabel l;
	JTextField tf;
	JButton b;

	IPFinder() {
		super("IP Finder Tool");
		l = new JLabel("Enter URL:");
		l.setBounds(50, 70, 150, 20);
		tf = new JTextField();
		tf.setBounds(50, 100, 200, 20);

		b = new JButton("Find IP");
		b.setBounds(50, 150, 80, 30);
		b.addActionListener(this);
		add(l);
		add(tf);
		add(b);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String url = tf.getText();
		try {
			InetAddress ia = InetAddress.getByName(url);
			String ip = ia.getHostAddress();
			JOptionPane.showMessageDialog(this, ip);
			tf.setText("");
		} catch (UnknownHostException e1) {
			JOptionPane.showMessageDialog(this, e1.toString());
		}
	}

	public static void main(String[] args) {
		new IPFinder();
	}
}
