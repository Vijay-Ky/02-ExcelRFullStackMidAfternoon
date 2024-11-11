import java.util.Scanner;
class O
{
	public static void main(String[] args) //throws InsufficientBalanceException
	{
		System.out.println("Welcome to your Account");
		System.out.println("Your Balance is 10,000.0 Rupees");
		System.out.println("Enter the amount to be withdrawn");
		Scanner sc = new Scanner(System.in);
		int i;
		do
		{
			System.out.println("please enter valid amount to be withdrawn");
			i = sc.nextInt();
			if(i > 10000)
			{
				throw new InsufficientBalanceException("your balance is 10,000 only!");
			}
			if(i <= 0)
			{
				System.out.println("Invalid do you wish to try again??");
				String response = sc.next();
				
				if (!response.equalsIgnoreCase("yes"))
				{
					break;
				}
				else
				{
					continue;
				}
			}
		}
		while (true);
		System.out.println("10,000 cash despensed. count the cash before leaving");
		System.out.println("Thank you");
	}
}
