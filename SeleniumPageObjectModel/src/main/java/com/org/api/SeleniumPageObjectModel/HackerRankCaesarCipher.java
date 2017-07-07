package com.org.api.SeleniumPageObjectModel;

public class HackerRankCaesarCipher {

	public static void main(String[] args) {
		char c='a';
		for(int i=0;i<26;i++){
			int a=(int) c;
			System.out.print(c+"="+a+" ");
			c++;
		}
		System.out.println();
		c='A';
		for(int i=0;i<26;i++){
			int a=(int) c;
			System.out.print(c+" "+a+" ");
			c++;
		}
		c=' ';
		System.out.println();
		int a=(int) c;
		System.out.print(c+" "+a+" ");
	}
}
