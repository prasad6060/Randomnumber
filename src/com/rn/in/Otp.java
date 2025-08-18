package com.rn.in;

import java.util.Random;

public class Otp {
	
	public static void main(String[] args) {
		
		String characters ="ABCDEFGabcdefg0123456789";
		
		int num=6;
			Random random = new Random();
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0;i<num;i++)
			{
				
				int index = random.nextInt(characters.length());
				sb.append(characters.charAt(index));
			}
			
			System.out.println(sb);
			
			
	}

}
