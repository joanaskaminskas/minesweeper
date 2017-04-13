package com.zetcode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.Timer;

public class GameTimer implements ActionListener {

	private int seconds = 0;

	private Timer clock = new Timer(1000, this);

	JLabel statusbar;

	public GameTimer(JLabel statusbar) {
		this.statusbar = statusbar;
		statusbar.setText(seconds + " s");
	}

	public void start() {
		clock.start();
	}

	public void stop() {
		clock.stop();
	}

	public void reset() {
		seconds = 0;
		statusbar.setText(seconds + " s");
	}

	public void actionPerformed(ActionEvent e) {
		seconds++;
		statusbar.setText(seconds + " s");
		System.out.println(seconds);
	}

	public int getSeconds() {
		return seconds;
	}

}