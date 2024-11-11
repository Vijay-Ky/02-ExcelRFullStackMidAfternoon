class M
{
	void test1()
	{
		System.out.println("from test1");
	}

	static
	{
		M obj = new M();
		obj.test1();
	}
}
//Till Java JDK 1.6 we could be able to run a program without the main method, but from Java JDK 1.7 compulsary we should be having the main method to run the class, because JVM will be looking for main method to run the class(intialize the class for running).