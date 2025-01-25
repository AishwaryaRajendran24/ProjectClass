package com.eveningbatch.eg;

import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OverloadingEG {
	public void add(int a, int b) {
		int c=a+b;//3
		System.out.println("Inside Load method"+c);
	}
	
}
