import java.sql.DriverManager;
class Q
{
	public static void main(String[] args) throws Throwable
	{
		System.out.println("main begin");
		DriverManager.getConnection("");
		Thread.sleep(1000);
		Class.forName("");
		System.out.println("main end");
	}
}
