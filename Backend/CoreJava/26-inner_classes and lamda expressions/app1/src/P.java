class P 
{
	static void test()
	{
		int i = 10;
		System.out.println(i);
	}
	public static void main(String[] args) 
	{

		int i = 10;
		final int j = 10;
		class A
		{
			void test()
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
		A a1 = new A();
		a1.test();
		//we get different value for i to avoid that compiler wont allow i to modify
		//i = 20;
		a1.test();
		System.out.println("done");
	}
}
