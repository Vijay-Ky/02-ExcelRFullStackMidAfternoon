class Q
{
	static int i;
	public static void main(String[] args)
	{
		System.out.println(i);
		int i = 10;
		System.out.println(i);
		System.out.println(Q.i);
		i = 20;
		System.out.println(i);
		System.out.println(Q.i);
		Q.i = 40;
		System.out.println(i);
		System.out.println(Q.i);
	}
}