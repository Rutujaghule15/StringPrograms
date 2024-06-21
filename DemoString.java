class DemoString
{
	public static void main(String[] args) {
		String name1 = "Karthik";
		String name2 = "Kanchana";
		String name3 = "komal";
		String name4 = "";

		String convertedCapital = name1.toUpperCase();
		int length = name3.length();
		char singleChar = name1.charAt(2);
		String mergedName = name1.concat(name2);
		String multiChar = name2.substring(5,8);//ana
		String singleCharachter = name3.substring(0,1);//k
		boolean emptyOrNot = name4.isEmpty();

		// System.out.println(convertedCapital);
		// System.out.println(length);
		// System.out.println(singleChar);
		// System.out.println(mergedName);
		// System.out.println(multiChar);
		// System.out.println(singleCharachter);
		// System.out.println(emptyOrNot);

		String s = "qspiders";
		String replaced = s.replace('s','j')
		Ssytem.out.println(replaced);
	}
}
