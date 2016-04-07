/**
 * @file Herb.java
 * @author Jacky
 * @date Apr 7, 2016 
 */
package ch6;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @description Using an EnumMap to associate data with an enum.
 *  Item 33
 * 
 */
public class Herb
{
	private final HerbType type;
	private final String name;

	public Herb(HerbType t, String name)
	{
		this.type = t;
		this.name = name;
	}

	public enum HerbType
	{
		ANNUAL, PERENNIAL, BIENNIAL
	}

	@Override
	public String toString()
	{
		return type + " " + name;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Herb[] garden =
		{ new Herb(HerbType.ANNUAL, "apple"),
				new Herb(HerbType.ANNUAL, "orange"),
				new Herb(HerbType.ANNUAL, "watermelon"),
				new Herb(HerbType.BIENNIAL, "pear"),
				new Herb(HerbType.PERENNIAL, "peach") };
		
		Map<Herb.HerbType, Set<Herb>> map = 
				new EnumMap<Herb.HerbType, Set<Herb>>(HerbType.class);
		
		for(HerbType type : HerbType.values())
		{
			map.put(type, new HashSet<Herb>());
		}
		
		for (Herb h:garden)
		{
			map.get(h.type).add(h);
		}
		
		System.out.println(map);
	}
}
