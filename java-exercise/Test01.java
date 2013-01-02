public class Test01
{
	int i = 33;
	int j = 44;

	char c1 = 'a';
	char c2 = 'b';

	public static void main(String args[])
	{
		Test01 t = new Test01();
		int n = t.i + t.j;
		int m = t.j - t.i;
		
		int c = t.c1 + t.c2;
		int d = t.c2 - t.c1;

		int h = t.i * t.j;
		int k = t.j / t.i;
		int y = t.j % t.i;

		System.out.println("n = " + n);
		System.out.println("c = " + c);	
		System.out.println("m = " + m);
		System.out.println("d = " + d);
		System.out.println();

		System.out.println("h = " + h);
		System.out.println("k = " + k);
		System.out.println("y = " + y);
	}
}
