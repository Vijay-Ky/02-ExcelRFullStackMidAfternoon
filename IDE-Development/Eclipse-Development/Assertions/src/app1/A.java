package app1;
import app2.B;

class A
{
    public static void main(String[] args)
    {
    	System.out.println("app1.A one");
        assert false;
        System.out.println("app1.A two");
        B.main(args);
        System.out.println("app1.A three");
    }
}