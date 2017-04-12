package com.zrd.study.array;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String[] strArr = new String[]{"aq", "bc"};
		String[] destStrArr = new String[1];
		System.arraycopy(strArr, 0, destStrArr, 0, destStrArr.length);
		for(String str: destStrArr){
			//System.out.println(str);
		}
		
		String[] newStrArr = Arrays.copyOf(strArr, 3);
		for(String str: newStrArr){
			System.out.println(str);
		}
	}
}
