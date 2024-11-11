class M8 
{
	static void test(A obj)
	{
		System.out.println("from test(A)");
	}

	public static void main(String[] args) 
	{
		test((A)new B());
		test(new C());
		test(new D());
		
		B b1 = new B();
		test(b1);

		D d1 = new D();
		test(d1);
		System.out.println("done");
	}
}
