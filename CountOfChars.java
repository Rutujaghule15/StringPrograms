import java.util.*;
class CountOfChars
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String name  = sc.next();

		System.out.println("Enter the Character : ");
		char ch = sc.next().charAt(0);
		int count = 0;
		for(int i=0;i<name.length();i++)
		{
			if(ch==name.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
