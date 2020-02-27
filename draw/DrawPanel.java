/*
 * DrawPanel.java
 * 
 * Copyright 2019 Student <Student@ST-23>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			int width = getWidth();
			int height = getHeight();
			//網狀圖案
			int m = 20;
			for(int n = 0; n <= 20; n++){	
				g.drawLine( 0, (height/m*n), (width/m*n), height);
				g.drawLine( (width/m*n), height, width, height - (height/m*n));
				g.drawLine( width, height - (height/m*n), width - (width/m*n), 0);
				g.drawLine( width - (width/m*n), 0, 0, (height/m*n));
				}
			/*  
			    g.drawLine( 0, (height/m) + (height/m*n), (width/m) + (width/m*n), height);
				g.drawLine( (width/m) + (width/m*n), height, width, height - (height/m*n));
				g.drawLine( width, height - (height/m*n), width - (width/m*n), 0);
				g.drawLine( width - (width/m*n), 0, 0, (height/m) + (height/m*n));*/
			/*
			//產生隨機2條線
			int[] s = {0,0} ,e = {0,0};
			for(int a=0; a<2; a++){
				for(int b=0; b < s.length; b++){
					s[b] = (int)(Math.random()*250);
				}
				for(int b=0; b < e.length; b++){
					e[b] = (int)(Math.random()*250);
				}
				g.drawLine( s[0], s[1], e[0], e[1]);
			}
			*/
			/*
			double r = Math.random();
			int i = (int)(r*250);
			if( r<0.5 )
				g.drawLine(0, 0, width - i, height);
			else
				g.drawLine(0, 0, width, height - i);
			if( r<0.5 )
				g.drawLine(0, height, width - i, 0);
			else
				g.drawLine(0, height, width, i);
			*/
			
			
			}
	
}

