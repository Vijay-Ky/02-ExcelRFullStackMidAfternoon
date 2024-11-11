class M5 
{
	public static void main(String[] args) 
	{
		Object obj = new A(); // obj = (Object) new A();
		A a1 = new B(); //a1 = (A) new B();
		B b1 = new C();
		C c1 = new D();
		System.out.println("done");
	}
}
