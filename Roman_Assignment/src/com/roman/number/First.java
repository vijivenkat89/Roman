package com.roman.number;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Problem: Given an Integer input, convert it to a Roman numeral. Input is
 * within the range from 1 to 3999.
 * 
 * @author Vijayalakshmi
 *
 */

public class First 
{
	
	public static void main(String args[])
	{
		System.out.println("Welcome");
		int val;
		do {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.println("Enter a digit between 1 and 3999");
		int num= sc.nextInt(); 
		if((num>=1)&&(num<=3999))         //condition to check if number is between given requirements
			System.out.println(integerToRoman(num));
		else
			System.out.println("Kindly enter a number between the digits 1 and 3999");
		System.out.println("Do You Want to Continue(1/0)");
		val=sc.nextInt();
		}while(val==1);
		
	}
		private static final TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		static {
			treemap.put(1000, "M");
			treemap.put(900, "CM");
			treemap.put(500, "D");
			treemap.put(400, "CD");
			treemap.put(100, "C");
			treemap.put(90, "XC");
			treemap.put(50, "L");
			treemap.put(40, "XL");
			treemap.put(10, "X");
			treemap.put(9, "IX");
			treemap.put(5, "V");
			treemap.put(4, "IV");
			treemap.put(1, "I");

		}

		public static final String integerToRoman(int number) 
		{
			int l = treemap.floorKey(number);
			if (number == l)
			{
				return treemap.get(number);
			}
			return treemap.get(l) + integerToRoman(number - l);
		}
	}

	

