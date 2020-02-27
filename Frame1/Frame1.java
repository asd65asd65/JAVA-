/*
 * Frame1.java
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

public class Frame1 {
	static Frame frm = new Frame("DeepStone");
	static Label lab1 = new Label("�w��i�JDeepStone�n���O�լd�t��");	
	static Label lab2 = new Label("�Яd�ӤH���");
	static Label lab3 = new Label("�m�W:");
	static TextField txt1 = new TextField(20);
	static Label lab4 = new Label("�ʧO:");
	static Checkbox cb1 = new Checkbox("�k��");
	static Checkbox cb2 = new Checkbox("�k��");
	static Label lab5 = new Label("�n���O���R���:");
	static Checkbox cb3 = new Checkbox("HTML");
	static Checkbox cb4 = new Checkbox("CSS");
	static Checkbox cb5 = new Checkbox("JavaScript");
	static Checkbox cb6 = new Checkbox("JQuery");
	
	static Frame frm2 = new Frame("Login");
	static Button but1 = new Button("�T�w");
	static Button but2 = new Button("����");
	static class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			frm2.setVisible(false);
			frm.setVisible(true);
		};
	}
	static class MyListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			frm2.setVisible(true);
			frm.setVisible(false);
		};
	}
	public static void main (String[] args) {
		
		frm2.setLayout(new GridLayout(4,2));//�e��1
		frm2.setSize(800,600);
		frm2.add(new Label("�w��i�JDeepStone�t��"));
		frm2.add(new Label(""));
		frm2.add(new Label("�b��"));
		frm2.add(new TextField());
		frm2.add(new Label("�K�X"));
		frm2.add(new TextField());
		frm2.add(but1);
		but1.addActionListener(new MyListener());
		frm2.setVisible(true);
		
		frm.setLayout(new GridLayout(6,5));//�e��2
		CheckboxGroup cbg = new CheckboxGroup();
		frm.setSize(800,600);
		
		lab1.setFont(new Font("Serief",Font.BOLD,24));
		frm.add(lab1);
		frm.add(new Label(""));
		frm.add(new Label(""));
		frm.add(new Label(""));
		frm.add(new Label(""));
		
		frm.add(lab2);
		frm.add(new Label(""));
		frm.add(new Label(""));
		frm.add(new Label(""));
		frm.add(new Label(""));
		
		frm.add(lab3);
		txt1.setFont(new Font("Serief",Font.BOLD,20));
		frm.add(txt1);
		frm.add(new Label(""));
		frm.add(new Label(""));
		frm.add(new Label(""));
		
		frm.add(lab4);
		cb1.setCheckboxGroup(cbg);
		cb2.setCheckboxGroup(cbg);
		cb1.setState(true);
		frm.add(cb1);
		frm.add(cb2);
		frm.add(new Label(""));
		frm.add(new Label(""));
		
		frm.add(lab5);
		frm.add(cb3);
		frm.add(cb4);
		frm.add(cb5);
		frm.add(cb6);
		
		frm.add(but2);
		but2.addActionListener(new MyListener2());
		frm.setVisible(false);
	}
}

