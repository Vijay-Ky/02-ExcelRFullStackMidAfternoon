class M9 
{
	static Object test()
	{
		D d1 = new D();
		return (Object)d1;
	}

	public static void main(String[] args) 
	{
		Object obj = test();
		System.out.println("done");
	}
}
