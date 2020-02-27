/*
 * Frame2.java
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
import java.awt.*;
import java.awt.event.*;

public class Frame2 {
	static Frame frm = new Frame("Frame2");
	static TextArea txt1 = new TextArea();
	static String s = new String();
	static Button[] buttons = new Button[10];
	static Button sub = new Button("確定");
	static Button back = new Button("倒退");
	static Button reset = new Button("清除");
	static class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Button b = (Button)e.getSource();
			for(int i=0; i<10; i++){
				if( b==buttons[i] ){
					s = s + b.getLabel();
					txt1.append("*");
				}
			}
			if( b==sub ){
				 System.out.println(s);
			}else if( b==back ){
				
				
			}else if( b==reset ){				
				s = "";				
				txt1.setText("");
				System.out.println("clean");
			}
		};
	}
	
	
	public static void main (String[] args) {				
		GridLayout obj = new GridLayout(5,3);
		frm.setLayout(obj);
		frm.setSize(800,600);
		frm.add(txt1);
		
		int[] r = new int[10];
		int[] m = new int[10];//檢查表
		for(int i=0; i<10; i++){
			for(;;){
				int a = (int)(Math.random()*10);
				if( m[a]!=1 ){
					r[i] = a;
					m[a] = 1;
					break;
				}
			}
		}
		String[] n = {"1","2","3","4","5","6","7","8","9","0"};
		for(int i=0; i<10; i++){
			frm.add(buttons[i] = new Button(n[r[i]]));
			buttons[i].addActionListener(new MyListener());
		}
		
		frm.add(sub);
		sub.addActionListener(new MyListener());
		frm.add(back);
		back.addActionListener(new MyListener());
		frm.add(reset);
		reset.addActionListener(new MyListener());
		frm.setVisible(true);
	}
}

