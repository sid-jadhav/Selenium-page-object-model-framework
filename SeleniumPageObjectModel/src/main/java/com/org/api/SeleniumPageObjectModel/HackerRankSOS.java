package com.org.api.SeleniumPageObjectModel;

import java.util.Scanner;

public class HackerRankSOS {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String sos=scan.nextLine();
		int count=0;
		for(int i=1;i<=sos.length();i++){
			if(i%3==0 ||i%3==1){
				if(sos.charAt(i-1)!='S'){
					count++;
				}
			}else if(i%3==2){
				if(sos.charAt(i-1)!='O'){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
