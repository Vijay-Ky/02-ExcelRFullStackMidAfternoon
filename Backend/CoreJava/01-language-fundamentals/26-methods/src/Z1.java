class Z1
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i = 12 - (4 * 3) / 2;
		System.out.println(i);
		System.out.println("main end");
	}
	static int test()
	{
		System.out.println("from test");
		return 100;
	}
}

/*
BODMAS
Brackets
Orders (i.e., powers and square roots, etc.)
Division
Multiplication
Addition
Subtraction
*/
