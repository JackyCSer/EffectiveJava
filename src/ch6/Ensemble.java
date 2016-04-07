/**
 * @file Ensemble.java
 * @author Jacky
 * @date Apr 7, 2016 
 */
package ch6;

/**
 * @description Abuse of ordinal to derive an associated value - DON'T DO THIS
 *  Item 31
 * 
 */
public enum Ensemble
{
	NONET(20), DECTET(100);

	private final int n;

	private Ensemble(int i)
	{
		this.n = i;
	}

	public int get()
	{
		return n;
	}

	public static void main(String[] args)
	{
		System.out.println(DECTET.numberOfMusicians());
		System.out.println(DECTET.get());
	}

	public int numberOfMusicians()
	{
		return this.ordinal() + 1;
	}
}
