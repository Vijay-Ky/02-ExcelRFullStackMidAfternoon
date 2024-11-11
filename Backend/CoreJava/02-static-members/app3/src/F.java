class F
{
    static
    {
		//usage is not allowed before its declaration
		System.out.println(i);
    }
    
    static int i = 2;

    public static void main(String[] args)
    {
		  System.out.println(i);
    }
}
