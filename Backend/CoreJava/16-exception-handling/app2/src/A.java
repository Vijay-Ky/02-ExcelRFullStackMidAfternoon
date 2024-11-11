class A
{
	int i = 10;

	public String toString()
	{
		return "" + i;
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1);
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch:" + ex);
		}
		System.out.println("end of main");
	}
}
