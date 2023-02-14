package AJP;

import java.util.Scanner;

public class LongestRepeatingpalin {

	static String palindrome(String str) {
		StringBuffer s=new StringBuffer(str);
		
		s=s.reverse();	//String a=s.toString();
     	if(str.contentEquals(s)) {
			return str;
		}
		else {
			return "";
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.next(),check="";
		
		
		
		for(int i=0;i<input.length()-1;i++) {
			for(int j=i+1;j<input.length()+1;j++) {
				String ans=palindrome(input.substring(i,j));
				if(ans.length()>check.length()) {
					check=ans;
				}
			}
		}
		System.out.println(check);
		
		check.cou
	}

}
