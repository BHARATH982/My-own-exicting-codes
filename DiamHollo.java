package AJP;

import java.util.*;//Scanner;

public class DiamHollo {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter Number of Rows");
    int n=s.nextInt();
   
	for(int i=1;i<=n*2-1;i++) 
	{
		for(int j=1;j<=n*2-1;j++) 
		{
	       if((i==1||i==n*2)&&j==n) 
	       {
	    	   System.out.print("* ");
	    	   continue;
	       }
	       else if(i+j==n+1||Math.abs(i-j)==n-1||i+j==(n*2-1)+n ) 
	       {
	        	System.out.print("* ");
	        	continue;
	        }
	        System.out.print("  ");
		}// j
		System.out.println();
	}// i
   
	
  /*  String s1="bharath";
    String s2=new String("bharath").intern();
    
    String s3=s2.toString();
    System.out.println(s1==s2);
    System.out.println(s1.equals(s3)+"\n"+s1+"\n"+s2+"\n"+s3);   
    */
}
}
