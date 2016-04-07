package ch6;

// Enum type with constant-specific class bodies and data;

public enum Operation
{
	PLUS("+")
	{
		
		@Override
		double apply(double x, double y)
		{												
			return 0;
		}
		
	};
	
	private final String symbol;
	

	private Operation(String symbol)
	{
		this.symbol = symbol;
	}
		
	@Override
	public String toString()
	{

		return this.symbol;
	}
	
	abstract double apply(double x, double y);
}
