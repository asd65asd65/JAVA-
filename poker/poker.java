/*
 * poker.java
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


public class poker {//�o�Q�J�P
	
	public static void main (String[] args) {
		String[] a = {"�®�","�R��","���","����"};
		int[] m = new int[52];//�ˬd��
		int r = 0;
		
		System.out.print("�o�Q�J�P\n\n");
		System.out.print("player1\tplayer2\tplayer3\tplayer4\n\n");
		for( int i = 0; i<52; ){
			r = (int)(Math.random()*52);//0~12:�®� 13~25:�R�� 26~38:��� 39~51:����
			
			if( m[r]!=1 ){
				System.out.print(a[r%4] + "_" + (r%13+1) + "\t");
				if( i%4==3 ){
					System.out.print("\n");
				}				
				m[r] = 1;
				i++;
			}
						
		}		
	}
	
}

