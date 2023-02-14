package AJP;

import java.util.Scanner;

public class SandClock {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	for(int i=0;i<=n;i++) {
		
		for(int k=n-temp;k>0;k--) {
			System.out.print(" ");
		}// for space
		
		for(int j=temp;j>=0;j--) {
			System.out.print(j);
			if(j==0) {
				
				for(int k=1;k<=temp;k++) {
					System.out.print(k);
				}
			}
		}
		temp--;
		
		//j loop
		System.out.println();
	}//i loop
	temp=1;
for(int i=0;i<n;i++) {
		
		for(int k=n-temp;k>0;k--) {
			System.out.print(" ");
		}// for space
		
		for(int j=temp;j>=0;j--) {
			System.out.print(j);
			if(j==0) {
				
				for(int k=1;k<=temp;k++) {
					System.out.print(k);
				}
			}
		}
		temp++;
		
		//j loop
		System.out.println();
	}//i loop
}
}
