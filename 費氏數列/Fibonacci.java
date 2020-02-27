/*
 * Fibonacci.java
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
import java.math.BigInteger;//�j��ƫ��A
public class Fibonacci {//�O��ƦC
	/*
	public static int fibonacci(int n){
		if( n==0 ){
			return 0;
		}
		if( n==1 ){
			return 1;
		}
		if( n>1 ){
			return fibonacci(n-1)+fibonacci(n-2);
		}
		return -1;
	}//���j�Ѫk
	*/
	public static void fibonacci2(int n){
		BigInteger a1= BigInteger.ZERO, b1= BigInteger.ONE, c1= BigInteger.ZERO;//�j��ƫ��A�ŧi
		
		if( n==0 | n==1){
			System.out.printf("�� %d �hfibonacci�Ƭ� : %d. \n", n, n);
		}
		else if( n>1 ){
			for(int i= 1; i<n; i++){
				c1 = a1.add(b1);//�j��ƫ��A�Ψ禡���B��
				a1 = b1;
				b1 = c1;
			}
			System.out.printf("�� %d �hfibonacci�Ƭ� : %d \n", n, c1);
		}
		else{
			System.out.printf("��J���~ \n");
		}
	}//�j��Ѫk
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��Jfibonacci�h�� : ");
		int n = scanner.nextInt();
		for(int i= 1; i<=n; i++){
			fibonacci2(i);
		}
	}
}

