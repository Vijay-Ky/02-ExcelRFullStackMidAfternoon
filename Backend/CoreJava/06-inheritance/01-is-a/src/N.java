class M extends Object
{
	M()
	{
		//super()
		//IIB
		super();
		System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		//super()
		//IIB
		super();
		System.out.println("N()");
	}

	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("done");
	}
}

/*
- In Java Object class is the super-most class.
- each class whether directly or indirectly extends object class.
- In the Object we have many members which are required by all the classes in Java(User or Inbuilt)
  all those members would be inherited to all the classes by default.
*/

