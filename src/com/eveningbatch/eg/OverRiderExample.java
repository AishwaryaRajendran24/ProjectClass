package com.eveningbatch.eg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OverRiderExample  {
	public static void A() {//class Level = Static methods and Static variables
		
	}
	public static void main(String[] args) {
		//Tree Set only allows Homogenous object = Same DataType	
	  Set<Integer> set=new TreeSet<>();
	  set.add(30);
	  set.add(20);
	  set.add(0);
	 //Set Does not allow duplicate
	  System.out.println(set);
	}
}
