 
package AJP;
import java.util.*;//Scanner;
public class Diamond {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
       System.out.println("Enter Number of Rows");
       int n=s.nextInt();
       for(int i=0;i<n;i++) 
       {
    	   for(int j=0;j<n;j++) 
    	   {
    		   if(i==0||i==n-1) {
    			   if(j==n/2) {
    			   System.out.print("* "); 
    			    continue;}
    		   }
    		   else {
    		   if(i+j==(n/2)||Math.abs(j-i)==(n/2)||i+j==(n-1)+(n/2)) {
    			 System.out.print("* ");
    			 continue;
    		 }
    		   }
    	     System.out.print("  ");
    	 }//j
System.out.println();
       }//i
       
     }// End Of Main Method
	}//End of Class
