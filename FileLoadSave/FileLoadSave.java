/*
 * FileLoadSave.java
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
import java.io.*;

public class FileLoadSave {
	static Frame frm = new Frame("FileLoadSave");
	static MenuBar mb = new MenuBar();
	static Menu menu = new Menu("File");
	static MenuItem open = new MenuItem("Open");
	static MenuItem save = new MenuItem("Save");
	static FileDialog fo = new FileDialog(frm, "Open File", 0);
	static FileDialog fs = new FileDialog(frm, "Save File", 1);
	static TextArea ta = new TextArea();
	
	static class MListener1 implements ActionListener{
		public void actionPerformed(ActionEvent event){
			MenuItem item = (MenuItem)event.getSource();
			if( item==open ){
				fo.setVisible(true);
				String filename = fo.getDirectory() + fo.getFile();
				try{
					FileInputStream openf = new FileInputStream(filename);
					byte[] fn = new byte[openf.available()];
					openf.read(fn);
					ta.setText(new String(fn));
					openf.close();
				}catch(IOException e){
					System.out.println(e);
				}
			}else if( item==save ){
				fs.setVisible(true);
				String filename = fs.getDirectory() + fs.getFile();
				try{
					FileOutputStream savef = new FileOutputStream(filename);
					BufferedOutputStream buf = new BufferedOutputStream(savef);
					String str = ta.getText();
					byte[] ba = str.getBytes();
					buf.write(ba);
					buf.flush();
					savef.close();
				}catch(IOException e){
					System.out.println(e);
				}
			}
		}
	}
	
	public static void main (String[] args) {
		mb.add(menu);
		menu.add(open);		
		menu.add(save);
		open.addActionListener(new MListener1());
		save.addActionListener(new MListener1());
		BorderLayout br = new BorderLayout();
		frm.add(ta, br.CENTER);
		frm.setSize(800, 600);
		frm.setMenuBar(mb);
		frm.setVisible(true);
	}
}

