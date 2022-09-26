package AJP;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class NumberToWords {

	
	
	static void unit(char num) {
		 Map<Character,String> m=new HashMap<>();
		 m.put('0'," ");
		  m.put('1',"One");
		  m.put('2', "Two");
		  m.put('3',"Three");
		  m.put('4',"Four");
		  m.put('5',"Five");
		  m.put('6',"Six");
		  m.put('7',"Seven");
		  m.put('8',"Eight");
		  m.put('9',"Nine");
		  System.out.print(m.get(num));
	}
	
	static void tens(String num) {
		if(num.charAt(0)=='1') {
		  Map<Character,String> m=new HashMap<>();
		  m.put('0', "Ten");
		  m.put('1',"Eleven");
		  m.put('2', "Twelve");
		  m.put('3',"Thirteen ");
		  m.put('4',"Fourteen");
		  m.put('5',"Fifteen");
		  m.put('6',"Sixteen");
		  m.put('7',"Seventeen");
		  m.put('8',"Eighteen");
		  m.put('9',"Ninteen");
		  System.out.print(m.get(num.charAt(1))+" ");
		  
		}
		else {
			
			 Map<Character,String> m=new HashMap<>();
			 m.put('0'," ");
			 m.put('2', "Twenty");
			  m.put('3',"Thirty ");
			  m.put('4',"Fourty");
			  m.put('5',"Fifty");
			  m.put('6',"Sixty");
			  m.put('7',"Seventy");
			  m.put('8',"Eighty");
			  m.put('9',"Ninety");
			  System.out.print(m.get(num.charAt(0))+" ");
			  unit(num.charAt(1));
		}
	}
	
	static void hundred(String num) {
		unit(num.charAt(0));
		if(num.charAt(0)!='0')
		 System.out.print(" hundred"+" ");
		 num=num.substring(1);
		 tens(num);
	}
	
static void thousand(String num) {
	unit(num.charAt(0));
	if(num.charAt(0)!='0')
	 System.out.print(" Thousand"+" ");
	 num=num.substring(2);
	 hundred(num);
}
static void tensThousand(String num) {
	tens(num);
	if(num.charAt(0)!='0')
	 System.out.print(" Thousand"+" ");
	 num=num.substring(2);
	 hundred(num);
}
static void lakhs(String num) {
	unit(num.charAt(0));
	if(num.charAt(0)!='0')
	 System.out.print(" lakh"+" ");
	 num=num.substring(1);
	 tensThousand(num);
}
static void million(String num) {
	unit(num.charAt(0));
	if(num.charAt(0)!='0')
	 System.out.print(" million"+" ");
	 num=num.substring(1);
	 lakhs(num);
}
static void tensMillion(String num) {
	tens(num);
	if(num.charAt(0)!='0')
		System.out.print(" million"+" ");
	 num=num.substring(2);
	 lakhs(num);
}
static void billion(String num) {
	unit(num.charAt(0));
	if(num.charAt(0)!='0')
	 System.out.print(" billion"+" ");
	 num=num.substring(1);
	 tensMillion(num);
}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
	    String num=String.valueOf(input);
	    if(num.length()==1)
	    	unit(num.charAt(0));
	    if(num.length()==2)
	    	 tens(num);
	    if(num.length()==3)
	    	hundred(num);
	    if(num.length()==4)
	    	thousand(num);
	    if(num.length()==5)
	    	tensThousand(num);
	    if(num.length()==6)
	    	lakhs(num);
	    if(num.length()==7)
	    	million(num);
        if(num.length()==8)
	    	tensMillion(num);
        if(num.length()==9)
	    billion(num);
	    	
	}

}
