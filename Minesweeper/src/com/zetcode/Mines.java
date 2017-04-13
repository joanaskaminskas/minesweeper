package com.zetcode;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Mines extends JFrame {

	private final int FRAME_WIDTH = 250;
	private final int FRAME_HEIGHT = 295;

	private final JLabel statusbar;
	private final JLabel timerbar;
	private final JLabel timer;
	private Board board;

	public Mines() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocationRelativeTo(null);
		setTitle("Minesweeper");

		JPanel p = new JPanel();
		statusbar = new JLabel("");
		p.add(statusbar);
		add(p, BorderLayout.SOUTH);

		timerbar = new JLabel("");
		p.add(timerbar);
		add(p, BorderLayout.SOUTH);
		
		timer = new JLabel("");
		p.add(timer);
		
		board=new Board(statusbar, timerbar, timer);

		add(board);

		setResizable(false);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("key typed");
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("key event released");
			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("key event pressed");
				
				board.setVisible(!board.isVisible());
				
			}
		});

		setFocusable(true);
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