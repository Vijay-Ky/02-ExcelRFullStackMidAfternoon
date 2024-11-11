class B 
{
	B()
	{
	}

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("done");
	}
}
//We can also create the constructor
//constructors should be within a class and outside of any method
//if you are keeping at least one explicite constructor then, compiler will not be keeping no-arg default constructor.
//constructors treated as a special type of methods internally, but they are not normal methods. there is a difference b/w constructors and methods
//constructors are going to be invoked while we are creating the object
//compulsary there should be an object creation to invoke the constructor. in the beggining.
//methods are going to be invoked whenever we call them.
               //Rules for constructors 
//1. Compulsary constructors name should be same as class name(case-sensitive).
//2. There is no return type for a constructor.
//3. Compulary constructors should be concrete, or defined, implemented, it should be      having atleast {} i,e body.

//What are all the similarities between constructors and methods
//parameter(any nos., can be any type)
//concrete, defined, implemented
//access specifier
//we can have any no. of constructors and methods in a class but arguments must be different(for a group of constructors, for a group of methods)


