package com.github.loop.simplestockapp;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * @author Yogesh Nagarur
 * Main class where a new instance of the stock application is created.
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AppFramework app1 = new AppFramework();
		app1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app1.setMinimumSize(new Dimension(750, 400)); //Minimum size so the layout is perfect.
		app1.setLocationRelativeTo(null); //Opens up into the middle of screen.
		app1.pack();
		app1.setVisible(true);

	}

}
