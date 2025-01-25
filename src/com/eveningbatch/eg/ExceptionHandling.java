package com.eveningbatch.eg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandling {
	 public static void main(String[] args) throws FileNotFoundException {
		
	 String s=null;
		int sum;
		try {
			System.out.println(10/0);//Arithmetic Exception
			System.out.println(s.length());//Null pointer Exception
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer");
		}
		catch(ArithmeticException e) {
			System.out.println("Outside Catch block");
		}
    File file=new File("");
    FileInputStream i=new FileInputStream(file);
	 
}
}
