package com.rn.in;

public class WordReverse {
	
	public static void main(String[] args) {
		
		String s="sachin tendulkar";
		
		String [] words = s.split("\s");
		
		StringBuilder sb = new StringBuilder();
		
		
		for(String word : words)
		{
		
			sb.insert(0, word+"  ");
			
			
		}
		
		System.out.println(sb);
		
	}

}
