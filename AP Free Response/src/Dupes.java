import java.util.ArrayList;
import java.util.Collections;

public class Dupes
	{
	public static void main(String[] args)
		{
		int[] myArray =
			{ 1, 66, 2, 3, 13, 2, 892, 23, 32, 23, 66 };
		ArrayList allData = new ArrayList();
		for (int g = 0; g < myArray.length; g++)
			{
			allData.add(myArray[g]);
			}
		ArrayList noDupes = removeDupes(allData);
		for (int x = 0; x < noDupes.size(); x++)
			{
			System.out.print(noDupes.get(x) + " ");
			}
		}

	public static ArrayList removeDupes(ArrayList a)
		{
		Collections.sort(a);
		for (int i = a.size() - 1; i > 0; i--)
			{
			if (a.get(i) == a.get(i - 1))
				{
				a.remove(i);
				}
			}
		return a;
		}
	}