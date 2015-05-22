import java.util.ArrayList;
import java.util.Collections;

public class Anagram
	{
	public static void main(String[] args)
		{
		String a1 = "cheap";
		String a2 = "peach";
		checkAna(a1, a2);

		}

	public static boolean checkAna(String a, String b)
		{
		ArrayList<String> c = new ArrayList<String>();
		ArrayList<String> d = new ArrayList<String>();
		boolean boo = false;
		int counter = 0;
		for (int i = 0; i < a.length(); i++)
			{
			c.add(a.substring(i, i + 1));
			}
		for (int x = 0; x < b.length(); x++)
			{
			d.add(b.substring(x, x + 1));
			}
		Collections.sort(c);
		Collections.sort(d);
		if (c.size() == d.size())
			{
			for (int z = 0; z < c.size(); z++)
				{
				if (c.get(z).equals(d.get(z)))
					{
					counter++;
					}
				}
			if (counter == c.size())
				{
				boo = true;
				}
			}
		System.out.println(boo);
		return boo;
		}
	}