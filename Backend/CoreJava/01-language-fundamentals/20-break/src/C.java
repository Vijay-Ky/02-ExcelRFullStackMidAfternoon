class C
{
	public static void main(String[] args)
	{
		int i;
		for(i = 0; i < 10; i++)
		{
			System.out.println("loop begin: " + i);
			if(i > 5)
			{
				//break or continue must be the last statement in the current block.
				break;
				System.out.println("some statement");
			}
			System.out.println("loop end: " + i);
		}
		System.out.println("main end: " + i);
	}
}
