/*
 * PythagoreanTriple.java
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


public class PythagoreanTriple {
	
	public static void main (String[] args) {
		int num=0;
		for(int t1=0; t1<=500; t1++){//邊1
			
			for(int t2=0; t2<=500; t2++){//邊2
				
				for(int t3=0; t3<=500; t3++){//斜邊
					
					if( (t3<=t1) | (t3<=t2) ){
						continue;
						} 
					else {
						if( (t3*t3) != (t1*t1)+(t2*t2) ){
							continue;
							}
						else {
							System.out.println("S1= "+t1+"\tS2= "+t2+"\tH= "+t3);
							num++;
							continue;
							}
					}
					
				}
				
			}
			
		}
		System.out.println("有"+num+"種直角三角形");
	}
}

