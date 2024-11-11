@FunctionalInterface
interface F
{
	void test1();
}
class G //implements F
{
	public static void main(String[] args) 
	{
		F ref = () -> System.out.println("from test1() implementation");
		ref.test1();
	}
}