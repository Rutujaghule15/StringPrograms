class StringMethod2
{
	static str ="Ramesh" 
	public static void main(String[] args) {
		for(int i=0;i<str.length();i++)
		{
			System.out.println(userCharAt(i)+" ");
		}
	}
	public static char userCharAt(int idnx)
	{
		if(idnx<0 || idnx>=str.length())
		{
			throw new StringIndexOutOfBoundsException("Wrong Index");
		}

		char [] arr = new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i] = str.charAt(i);
		}
		return arr[idnx];
	}
}