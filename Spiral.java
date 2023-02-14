package AJP;

import java.util.*; 
public class Spiral{
	public static void main(String[] args) { 
	    Scanner s=new Scanner(System.in); 
		int n=s.nextInt(); 
		int a[][]=new int[n][n]; 
		int fr=0,fc=n-1,sr=1,sc=0,tr=1,wr=0; 
		int r=0,c=0,val=1; 
		
		for(int i=0;i<n-1;i++){ 
			r=wr; 
			for(c=fr;c<=fc;c++){ 
				if(val==n*n)break;//
				a[r][c]=val++; 
				 if(c==fc){ 
					for(r=sr;r<=fc;r++){ 
						if(val==n*n)break;//
						a[r][c]=val++; 
						if(r==fc){ 
							for(c=fc-1;c>=sc;c--){ 
								if(val==n*n)break;//
								a[r][c]=val++;
								if(c==sc){ 
									for(r=fc-1;r>=1;r--){ 
										if(val==n*n)break;//
										a[r][c]=val++; 
										} break; }
								} break; } }
					break; }
				} fr++; sr++; fc--; sc++; tr++; wr++; } 

for(int x=0;x<n;x++){ 
	for(int y=0;y<n;y++) {
        System.out.print(a[x][y]+"  ");
 }
 System.out.println();
}
}}
