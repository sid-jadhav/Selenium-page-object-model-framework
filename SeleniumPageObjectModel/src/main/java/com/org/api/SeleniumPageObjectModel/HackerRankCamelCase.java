package com.org.api.SeleniumPageObjectModel;

import java.util.Scanner;

public class HackerRankCamelCase {

	public static void main(String[] args) {
		String s;
		int count=1;
		Scanner scan = new Scanner(System.in);
		s=scan.next();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)<'a'){
				count++;
			}
		}
		System.out.println(count);
	}

}
