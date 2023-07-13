package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreamsEx {
	
	public static void main(String[] args) {
		
		List<String> list =Arrays.asList("Anil","Ashwath","Allu","Shyam","Pankah","Vamshi","Sandilya","Allu","Vamshi");
		System.out.println(list);
		
		//distinct()->To remove the duplicate values
		List<String> l =list.stream().distinct().collect(Collectors.toList());
		System.out.println(l);
		
	}

}
