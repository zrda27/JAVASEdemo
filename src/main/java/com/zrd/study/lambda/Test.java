package com.zrd.study.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("b");
		l.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		l.sort((o1, o2) -> {return -1;}
		);
		for(String s: l){
			System.out.println(s);
		}
	}
}
