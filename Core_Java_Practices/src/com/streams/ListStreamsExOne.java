package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListStreamsExOne {
	
	public static void main(String[] args) {
		
		List<String>list=Arrays.asList("Anil","Ashwath","Allu","Shyam","Pankah","Raviteja","Vamshi","Sandilya","Allu","Vamshi");
		System.out.println(list);
		System.out.println("------------------------------------------>");
		
		list.stream().distinct().forEach(a->System.out.println(a));
		System.out.println("------------------------------------------>");
		
		Long l=list.stream().distinct().count();
		System.out.println("Total persons count : "+l);
		System.out.println("------------------------------------------>");
		
		Set<String>s=list.stream().collect(Collectors.toSet());
		System.out.println(s);
		System.out.println("------------------------------------------>");
		
		List<String>li=list.stream().distinct().filter(str->str.toLowerCase().startsWith("s")).collect(Collectors.toList());
		System.out.println(li);
	
	}

}
