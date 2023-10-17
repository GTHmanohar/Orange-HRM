package com.collection;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist{

public static void main(String[] args) {
	List<Integer> m=new LinkedList<>();
	m.add(10);
	m.add(20);
	m.add(30);
	System.out.println(m);
	int size = m.size();
	System.out.println(size);
    Integer integer = m.get(1);
     System.out.println(integer);
     int indexof =m.indexOf(30);
     System.out.println(indexof);
     boolean contains= m.contains(10);
     System.out.println(contains);
     m.set(2, 10);
     System.out.println(m);
     
     

	
	
}

}