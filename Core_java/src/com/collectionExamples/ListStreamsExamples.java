package com.collectionExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListStreamsExamples {
	public static void main(String... args) {
		List<String>list=Arrays.asList("anil","ashwath","shyam","pankaj","raviteja","vamsi","sandy","Allu","vamsi","sandy","Allu");
		System.out.println(list);
		
		list.stream().distinct().forEach(s->System.out.println(s));	
		
		Long l=list.stream().distinct().count();
		System.out.println(l);
		
		Set<String>s=list.stream().collect(Collectors.toSet());
		System.out.println(s);
		
		List<String>li=list.stream().distinct().filter(str->str.toLowerCase().startsWith("a")).collect(Collectors.toList());
		System.out.println(li);
	}

}
 