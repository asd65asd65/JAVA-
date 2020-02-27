/*
 * hannoi.java
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
import java.util.Scanner;

public class hannoi {
	
	static int step = 0;
	
	public static void hannoi(int discnum, char from, char buffer, char to){
		if( discnum==1 ){
			System.out.printf("將碟子 %2d 從 %c 移動到 %c\n", discnum, from, to);
			step++;
		}
		else{
			hannoi(discnum-1, from, to, buffer);
			System.out.printf("將碟子 %2d 從 %c 移動到 %c\n", discnum, from, to);
			step++;
			hannoi(discnum-1, buffer, from, to);
		}
	}
	
	public static void main (String[] args) {
		int discnum = 0, sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("輸入員排數量 : ");
		discnum = scanner.nextInt();
		hannoi(discnum, 'A', 'B', 'C');
		for(sum = 1; discnum>0; discnum--){
			sum = sum*2;
		}
		sum = sum-1;
		System.out.printf("總共移動 %d 次", sum);
	}
}

