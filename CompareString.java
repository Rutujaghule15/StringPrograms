class CompareString
{
	public static void main(String[] args) {
		String name ="java";
		String name1 = "java";
		System.out.println(name==name1);
		System.out.println(name.equals(name1));//

		String str1=new String("python");
		String str2 = new String("python");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2)) ;

		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
	}
}
/*
String str1="java";
		String str2 = "java";
		System.out.println(str1==str2);

		String name1 = new String ("jav");
		String name2 = new String ("jav");
		System.out.println(name1==name2);

		StringBuffer sb1 = new StringBuffer("python");
		StringBuffer sb2 = new StringBuffer("python");
		System.out.println(name1==name2);
*/