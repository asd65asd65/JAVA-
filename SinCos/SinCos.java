/*
 * SinCos.java
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

public class SinCos extends JPanel{
	
	private int choice;

	
	public SinCos(int userChoice)
	{
		choice = userChoice;
	}
	
	public void paintComponent(Graphics g){
		
		g.drawLine(0,250,500,250);
		switch (choice){
			case 1:
				int p = 360;
				int[] x = new int[p],y = new int[p];
				
				for(int deg=0; deg<p; deg++){
					x[deg] = deg*500/p;
					y[deg] = (int)(Math.sin( Math.toRadians(deg) )*180*500/p);
					System.out.println("x= "+x[deg]+"\ty= "+y[deg]);
				}
								
				for(int n=0;n<(p-1);n++){
					g.drawLine(x[n],250+y[n],x[n+1],250+y[n+1]);
				}
				break;
			case 2:
				p = 360;
				int[] x2 = new int[p],y2 = new int[p];
				
				for(int deg=0; deg<p; deg++){
					x2[deg] = deg*500/p;
					y2[deg] = (int)(Math.cos( Math.toRadians(deg) )*180*500/p);
					System.out.println("x= "+x2[deg]+"\ty= "+y2[deg]);
				}
								
				for(int n=0;n<(p-1);n++){
					g.drawLine(x2[n],250+y2[n],x2[n+1],250+y2[n+1]);
				}
				break;
		}
	}
	
}

