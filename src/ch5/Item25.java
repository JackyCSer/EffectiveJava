package ch5;

import java.util.ArrayList;
import java.util.List;

public class Item25
{

	public static void main(String[] args)
	{
		// Fails at runtime!
		Object[] objects = new Long[1];
		objects[0] = "I don't fit in";	// Throws ArrayStore Exception
		
		// Won't compile
		List<Object> list = new ArrayList<Object>(); // Incompatible types
		list.add("I don't fit in");
		
		// Why generic array cteation is illegal - won't complie
		//List<String> [] stringLists = new List<String>[1];
		
		

	}

}
