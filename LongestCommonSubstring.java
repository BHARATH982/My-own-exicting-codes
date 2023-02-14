package AJP;

public class LongestCommonSubstring {
  public static void main(String[] args) {
	String str = "xyxxyxyy";
	String temp="";
	int maxLen=0;
	for(int i=0;i<str.length();i++)
	{
		if(!temp.contains(str.charAt(i)+""))
			temp+=str.charAt(i);
		else
		{
			if(temp.length()>maxLen)
				maxLen = temp.length();
			int index = temp.indexOf(str.charAt(i));
			temp = temp.substring(index+1)+str.charAt(i);
		}
			 
	}
	if(temp.length()>maxLen)
		maxLen = temp.length();
	System.out.println(maxLen);
}
}
