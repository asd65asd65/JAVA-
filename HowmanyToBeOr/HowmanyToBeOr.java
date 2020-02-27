/*
 * HowmanyToBeOr.java
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


public class HowmanyToBeOr {
	
	public static void main (String[] args) {
		String str1 = "to", str2 = "be", str3 = "or";
		String teststr = "To be,or not to be.Is a important question.";
		String[] words;
		int i = 0, c1 = 0, c2 = 0, c3 = 0;
		
		System.out.printf("%s  \n",teststr);
		teststr = teststr.replace("."," ").replace(","," ");
		teststr = teststr.replace("-"," ").replace("_"," ");
		words = teststr.toLowerCase().split("\\s");
		for(String w:words){System.out.print(w + " ");}
		System.out.print("\n");
		for(i=0; i<words.length; i++) {
			words[i].trim();
			//System.out.println(words[i].equals(str1));
			if( words[i].equals(str1)==true ){
				c1++;
			}
			//System.out.println(words[i].equals(str2));
			if( words[i].equals(str2)==true ){
				c2++;
			}
			//System.out.println(words[i].equals(str3));
			if( words[i].equals(str3)==true ){
				c3++;
			}
		}
		System.out.printf("to= %d be= %d or= %d \n", c1, c2 ,c3);
	}
	
}

