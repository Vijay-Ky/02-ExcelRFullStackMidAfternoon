import java.util.Scanner;
class A 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your first name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Welcome: " + name);
	}
}
//next() - reads the complete token in the form of a String
//token - a single character or a group of characters without any space.
//Streams - input, output, error 
