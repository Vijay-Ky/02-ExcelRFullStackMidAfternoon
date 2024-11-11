import java.util.ArrayList;
import java.util.ListIterator;

public class M42
{
	//@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);

		System.out.println("list before adding 50: " + list);

		ListIterator<Object> it = list.listIterator();
		it.add(50);
		it.add(28);

		System.out.println("list after adding 50: " + list);

		while (it.hasNext())
		{
			if(it.nextIndex() == 2)
			{
				it.add(208);
			}
			System.out.print(it.next() + ", ");
		}

		it.add(100);
		it.add(200);

		System.out.println();
		//System.out.println("list after adding 100: " + list);

		System.out.println("---------------------");

		System.out.println("checking for the next element: " + it.hasNext());

		while (it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}

		System.out.println("checking for the previous element: " + it.hasPrevious());

		while (it.hasPrevious())
		{
			System.out.print(it.previous() + ", ");
		}
		System.out.println();
		System.out.println("final list: " + list);
	}
}
