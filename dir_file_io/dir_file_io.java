/*
 * dir_file_io.java
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
import java.io.*;

public class dir_file_io {
	
	public static void main (String[] args) {
		File f = new File(".\\test.txt");
		try{
			f.createNewFile();
			System.out.print("建檔成功!"+"\n");
			System.out.print("父路徑: "+f.getParent()+"\n");
		}catch(Exception e){
			System.out.print("建檔失敗!"+"\n");
		}
		//在當前目錄建立檔案
		
		File fd = new File("mywork");
		if(fd.mkdir()){
			System.out.print("建檔成功!"+"\n");
		}else{
			System.out.print("建檔失敗!"+"\n");
		}
		//在當前目錄建立檔案
		
		File f2 = new File("mywork\\javaReport.txt");
		try{
			f2.createNewFile();
			System.out.print("建檔成功!"+"\n");
			f2.setWritable(true);
			FileWriter w = new FileWriter("mywork\\javaReport.txt");
			BufferedWriter bw = new BufferedWriter(w);
			String s = "Good";
			bw.write(s, 0, s.length());
			bw.close();
			f2.setReadOnly();
		}catch(Exception e){
			System.out.print("建檔失敗!"+"\n");
		}
		//在目錄mywork裡面建立檔案
	}
	
}


