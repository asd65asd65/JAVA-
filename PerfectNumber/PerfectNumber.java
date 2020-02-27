/*
 * PerfectNumber.java
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


public class PerfectNumber {//埃ō┮Τ计羆㎝单赣计
	
	public static void main (String[] args) {
		int sum = 0, i = 0;
		
		System.out.print("碝тЧ计\n");
		for( int n=2; n<=1000; n++ ){
			i = 0;
			sum = 0;
			int[] b =new int[n];
			for( int a=1; a<n; a++ ){
				if( n%a==0 ){
					sum = sum + a;
					b[i] = a;
					i++;
				}									
			}
			if( n==sum ){			
				System.out.print(n + "\n计Τ :");
				for( b[i]=n; i>=0; i-- ){
					System.out.print(b[i] + " ");
				}
				System.out.print("\n");
			}
		}
	}
}

