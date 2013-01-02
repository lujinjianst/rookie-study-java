
public class Test02
{
	public static void main(String args[])
	{
		int i = 5;
		int j = 5;
		int m = 5;
		int n = 5;
		Test02 t = new Test02();
		i++;
		j = j + 1;
		m--;
		n = n - 1;
		
		System.out.println(i);
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i--);
		System.out.println();

		System.out.println(j);
		System.out.println(j++);
		System.out.println(j--);
		System.out.println(--j);
		System.out.println();

		System.out.println(m);
		System.out.println(n);

	}
}
