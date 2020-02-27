/*
 * ThreadSum.java
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
class NumberArray{
		
		int index = 0, sum = 0 , d = 1000;
		int[] number = new int[d];

		NumberArray(){
			for(int i=0; i<d; i++){
				this.number[i] = i;
			}
		}
		public int get(){
			if(this.index < this.number.length){
				return this.number[this.index];
			}else{
				return -1;
			}
		}
		public void sum(){
			this.sum += this.number[this.index];
		}
		public void totlesum(){
			System.out.print("SUM = "+this.sum+"\n");
		}
		public void showArray(){
			for(int i: this.number){
				System.out.print("SUM = "+i+"\n");
			}
		}
		public void nextElement(){
			index++;
		}
}

public class ThreadSum {
	
	public static void main (String[] args) {
		
		NumberArray NumA = new NumberArray();
		
		Thread t1 = new Thread(){
			int sum = 0;
			public void run(){
				
				while(NumA.get() != -1){
					//sum += NumA.get();
					NumA.sum();
					System.out.print("t1 now: "+NumA.get()+"\n");
					NumA.nextElement();
				}
			}
		};
		Thread t2 = new Thread(){
			int sum = 0;
			public void run(){
				while(NumA.get() != -1){
					//sum += NumA.get();
					NumA.sum();
					System.out.print("t2 now: "+NumA.get()+"\n");
					NumA.nextElement();
				}
			}
		};
		
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}catch(Exception e){
			System.out.print("Exception!: "+e+"\n");
		}
		
		NumA.totlesum();
	}
}

