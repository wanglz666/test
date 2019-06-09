package com.lesson16.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class User {
	int stuno;
	String name;
	String sex;
	int age;
	
		
	
	public User(int stuno, String name, String sex, int age) {
		super();
		this.stuno = stuno;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}



	public static void main(String[] args) {
		Map<Integer,User> map = new HashMap<>();
		map.put(1, new User(1, "¶þ¹·", "ÄÐ", 2));
		map.put(2, new User(2, "Èý¹·", "ÄÐ", 3));
		map.put(3, new User(3, "ËÄ¹·", "ÄÐ", 4));
		
		Iterator<Integer> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			int i = iterator.next();
			User u = map.get(i);
			System.out.println(u.name+"  "+u.age);
		}
	}

}
