package base;

import javax.swing.*;
import java.awt.*;
import java.awt.*;

import javax.swing.*;
import java.awt.Color.*;
import java.util.Scanner;
import java.awt.event.*;

public class Main extends JFrame implements KeyListener, MouseListener {
	public static Block blok = new Block(100,100,1);
	public static boolean run=true;
	public Main() {
		addKeyListener(this);
		addMouseListener(this);
		
	}

	public static void main(String[] args) {
		Main frame = new Main();
		frame.setVisible(true);
		frame.setSize(53*32,25*32+400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TopGrid grid = new TopGrid(blok);
//		grid.setSize(200,400);
//		grid.setBackground(Color.blue);
		frame.add(grid);
		while(run) {
			grid.repaint();
			try {
				blok.x=grid.getMousePosition().x;
				blok.y=grid.getMousePosition().y;
				System.out.println("X: " + blok.x + " Y: " + blok.y);
			} catch(Exception e) {
				
			}
			
		}

		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar()=='a') {
			blok.x-=blok.mvt;
		}
		if(e.getKeyChar()=='d') {
			blok.x+=blok.mvt;
		}
		if(e.getKeyChar()=='w') {
			blok.y-=blok.mvt;
		}
		if(e.getKeyChar()=='s') {
			blok.y+=blok.mvt;
		}
		if(e.getKeyChar()=='b') {
			run=false;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
