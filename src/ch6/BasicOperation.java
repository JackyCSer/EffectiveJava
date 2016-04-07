/**
 * @file BasicOperation.java
 * @author Jacky
 * @date Apr 7, 2016 
 */
package ch6;


/**
 * @description Emulated extensible enum using an interface.
 *  Item 34
 *
 */
public enum BasicOperation implements Operation2
{
	PLUS("+")
	{
		public double apply(double x, double y)
		{
			return x + y;
		}
	},
	MINUS("-")
	{
		public double apply(double x, double y)
		{
			return x - y;
		}
	};

	private final String symbol;

	private BasicOperation(String symbol)
	{
		this.symbol = symbol;
	}

	public static void main(String[] args)
	{
		double x = 3;
		double y = 5;
		
		test(BasicOperation.class, x, y);
		
	}
	
	private static <T extends Enum<T> & Operation2> void 
		test(Class<T> opSet, double x, double y)
	{
		for (Operation2 op : opSet.getEnumConstants())
		{
			System.out.println(op.apply(x, y));
		}
	}
}
