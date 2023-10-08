package com.CoursePrac;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list = Arrays.asList("racecar","tomcat","batman","samsung");
        
        Comparator<String> compare = (s1,s2) -> s1.length()>s2.length()?1:-1;
        Collections.sort(list, compare);
        for(String s : list) {
        	System.out.println(s);
        }
	}

}
