class E
{
    static
    {
		//modification is possible before its declaration
		i = 1;
    }
    static int i = 2;
    public static void main(String[] args)
    {
		System.out.println(i);
    }
}
