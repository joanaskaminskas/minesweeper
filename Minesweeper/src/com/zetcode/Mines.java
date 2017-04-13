package com.zetcode;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Mines extends JFrame {

	private final int FRAME_WIDTH = 250;
	private final int FRAME_HEIGHT = 290;

	private final JLabel statusbar;

	public Mines() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocationRelativeTo(null);
		setTitle("Minesweeper");
		
		JPanel p= new JPanel();
		statusbar = new JLabel("");
		p.add(statusbar);
		p.add(new JLabel("Test"));
		add(p, BorderLayout.SOUTH);

		add(new Board(statusbar));

		setResizable(false);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame ex = new Mines();
				ex.setVisible(true);
			}
		});
		
	}
}