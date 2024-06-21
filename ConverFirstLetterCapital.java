import java.util.*;
class ConverFirstLetterCapital
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String name = sc.next().toLowerCase();

		String firstLetter = name.substring(0,1).toUpperCase();
		String remainingLetters = name.substring(1,name.length());
		String merge=firstLetter.concat(remainingLetters);

		System.out.println(merge);
	}
}
