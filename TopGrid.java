package base;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class TopGrid extends JPanel {
	public int rows=20, cols=53,blockSize=32;
	Block bloc;
	public TopGrid(Block bloc) {
		this.bloc=bloc;
	}
	public void paint(Graphics g) {
		//add back in a bit
		g.clearRect(0, 0, 5000, 5000);
		g.setColor(Color.blue);
		g.fillRect(0,0,cols*blockSize,rows*blockSize);
		g.setColor(Color.black);
		g.drawRect(bloc.x, bloc.y, 200, 200);

		for(int i=0;i<cols+1;i++) {
			g.drawLine(i*32, 0, i*32, rows*blockSize);
			
		}
		for(int i=0;i<rows+1;i++) {
			g.drawLine(0, i*32, cols*blockSize, i*32);
		}

	}
}
