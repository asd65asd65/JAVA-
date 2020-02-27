/*
 * Shapes.java
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


// Fig. 5.27: Shapes.java
// Drawing a cascade of shapes based on the user¡¦s choice.
import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel
{
	private int choice; // user's choice of which shape to draw

	// constructor sets the user's choice
	public Shapes(int userChoice)
	{
		choice = userChoice;
	}

// draws a cascade of shapes starting from the top-left corner
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for (int i = 0; i < 10; i++)
		{
		// pick the shape based on the user's choice
				switch (choice)
				{
					case 1: // draw rectangles
						g.drawRect( 100, 100, 50 + i * 10, 50 + i * 10);
						break;
					case 2: // draw ovals
						g.drawOval( 100, 100, 20 + i * 20, 20 + i * 20);
						break;
					case 3:
						g.drawRect( 150 - i * 10, 150 - i * 10, 50 + i * 20, 50 + i * 20);
						break;
					case 4:
						g.drawOval( 150 - i * 10, 150 - i * 10, 20 + i * 20, 20 + i * 20);
						break;
					
				}
			}
	}
} // end class Shapes

