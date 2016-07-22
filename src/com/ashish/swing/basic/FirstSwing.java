/** @author Ashishkumar Gupta */
package com.ashish.swing.basic;

import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FirstSwing implements ActionListener{
	
	public FirstSwing() {
		
		JFrame f = new JFrame();// creating instance of JFrame

		JButton b = new JButton("click");// creating instance of JButton
		b.setBounds(130, 100, 100, 40);// x axis, y axis, width, height

		f.add(b);// adding button in JFrame

		f.setSize(400, 500);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible
		
		b.addActionListener(this);
	}

	public static void main(String[] args) {
		new FirstSwing();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "I'm clicked", "Welcome", 1);
	}
}