package AJP;

import java.util.*;

public class Circle {
	
public static void main(String[] args) {

	
    Scanner s=new Scanner(System.in);
    int n=s.nextInt(),k=n,space=0;
    for(int i=1;i<n;i++) {
    	for(int z=0;z<space;z++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=k;j++) {
    	 System.out.print("* ");
    	}
    	k--;
    	space++;
    	System.out.println();
    }
    for(int i=1;i<=n;i++) {
    	if(i==n) {
    		System.out.println(n);
    		break;
    	}
    	System.out.print(" ");
    }
    space=n-2;
    k=2;
    for(int i=2;i<=n;i++) {
    	for(int z=0;z<space;z++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=k;j++) {
    	 System.out.print("# ");
    	}
    	k++;
    	space--;
    	System.out.println();
    }
  }
}
