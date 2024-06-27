import java.util.*;
class TrimMethod
{
	static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		str = sc.nextLine();

		String str1=userTrim();
		System.out.println(str+" : "+str.length());
		System.out.println(str1+" : "+str1.length());
	}

	public static String userTrim()
	{
		String op = "";
		int idx = 0;
		for(int i=0;i<str.length();i++)
		{
				if(str.charAt(i)!=' ')
			    {
			    	idx=i;
			    	break;
			    }
		}
		op = str.substring(idx);
		for(int i=str.length()-1;i>=0;i--)
		{
				if(str.charAt(i)!=' ')
			    {
			    	idx=i;
			    	break;
			    }
		}
		op = str.substring(0,idx-1);
		System.out.println(op+ ":"+(op.length());
		return op;
	}
}