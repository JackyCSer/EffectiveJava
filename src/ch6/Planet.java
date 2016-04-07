package ch6;

public enum Planet
{
	MERCURY(12, 1);
	
	
	private final double mass;
	private final double radius;
	private final double surfaceGravity = 6.7;
	
	Planet(double mass, double radius)
	{
		this.mass = mass;
		this.radius = radius;
	}
}
