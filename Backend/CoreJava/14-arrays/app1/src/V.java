public class V
{
	public static void main(String[] args)
	{
		int[] x = new int[10];
		int[] y = new int[20];
		x = y;
		System.out.println(x.length);
		System.out.println(y.length);
		y = x;
		System.out.println(y == x);
		System.out.println(x == y);

		System.out.println(x[19]);
		System.out.println(y[19]);
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println("done");
	}
}
