import java.util.*;
class FindLongestEvenLengthString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();

		String words[] =str.split(" ");

		int max=0;
		String output="";
		for(String i:words)
		{
			int length = i.length();
			if(max<length && length%2==0)
			{
				max=length;
				output = i;
			}
		}
		System.out.println("Longest Even Length String : "+output);
	}
}