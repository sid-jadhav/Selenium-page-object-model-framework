package com.org.api.SeleniumPageObjectModel;

import java.util.Scanner;

public class HackerRankCaesarCipher2 {

	public static void main(String[] args) {
		String s;
		StringBuffer cipher=new StringBuffer();
		int length,rotation;
		Scanner scan =new Scanner(System.in);
		length=scan.nextInt();
		scan.nextLine();
		s=scan.nextLine();
		rotation=scan.nextInt();
		for(int i=0;i<length;i++){
			if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i))>='a' && s.charAt(i)<='z' ){
				if((((int)s.charAt(i)+rotation)<=122 && ((int)s.charAt(i)+rotation)>=97) &&(((int)s.charAt(i)+rotation)<=90 && ((int)s.charAt(i)+rotation)>=65)){
					char c=(char)((int)s.charAt(i)+rotation);
					cipher.append(c);
				}else{
					if(((int)s.charAt(i)+rotation)>122){
						int k=((int)s.charAt(i)+rotation);
						int add=k-122;
						char c=(char)(96+add);
						cipher.append(c);
					}else if(((int)s.charAt(i)+rotation)>90){
						int k=((int)s.charAt(i)+rotation);
						int add=k-90;
						char c=(char)(64+add);
						cipher.append(c);
					}
				}
				
				
			}else{
				cipher.append(s.charAt(i));
			}
		}
		System.out.println(cipher);
	}
}
