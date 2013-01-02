public class Test03
{
	public static void main(String args[])
	{
		int i = 4;
		int j = 4;
		boolean b1 = i==j;
		boolean b2 = i!=j;
		boolean b5 = i>j;
		boolean b6 = i<j;
		boolean b7 = i>=j;
		boolean b8 = i<=j;

		String s1 = new String();
		String s2 = new String();
		boolean b3 = (s1 == s2);
		boolean b4 = (s1 != s2);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println();
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		System.out.println();
	}
}
