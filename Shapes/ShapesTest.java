/*
 * ShapesTest.java
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
import javax.swing.JFrame; //handle the display
import javax.swing.JOptionPane;

public class ShapesTest {
	
	public static void main (String[] args) {
		
		String input1 = JOptionPane.showInputDialog(
		"Enter a number\n" +
		"1 : 方形\n" +
		"2 : 圓形\n" +
		"3 : 同心方\n" +
		"4 : 同心圓\n" );
		
		int choice = Integer.parseInt(input1); // convert input to int
		
	
		// create the panel with the user's input
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame(); // creates a new JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
}

