/*
 * 計算PI值.java
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


public class 計算PI值 {
	
	public static void main (String[] args) {
		double i = 4, a = 3, b = 5;//4 - 1/3 + 4/5 - 4/7 + 4/9 -......
		
		for( int n=1; n<=200000; n++){
			
			i = i-(4/a);
			System.out.print(i + "\t");
			
			if( (int)(i*100000) == 314159 ){				
				System.out.print("\n在第" + n + "次找到最接近PI的值 = " + i + "\n");
				break;
			}
			
			i = i+(4/b);
			System.out.print(i + "\n");
			
			if( (int)(i*100000) == 314159 ){
				System.out.print("\n在第" + n + "次找到最接近PI的值 = " + i + "\n");
				break;
			}
			
			a = a+4;
			b = b+4;
			
		}
	}
	
}

