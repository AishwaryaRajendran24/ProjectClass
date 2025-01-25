package com.eveningbatch.eg;

public class Age extends Exception {
	@Override
	public String getMessage() {		
		return "Invalid Age";
}
	public static void main(String[] args) {
		Age a=new Age();
		a.getMessage();
	}
	
	
	
}
