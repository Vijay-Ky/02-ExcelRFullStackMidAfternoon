class F 
{
	int i;

	F()
	{
		System.out.println("F()");
		i = 10;
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
		System.out.println("done");
	}
}
//What is the need of constructors??
//constructors are used to initialize objects.
//non-static members can be used without any referece variable in the non-static context.