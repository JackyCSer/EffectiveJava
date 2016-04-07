/**
 * @file Text.java
 * @author Jacky
 * @date Apr 7, 2016 
 */
package ch6;

import java.util.EnumSet;
import java.util.Set;

/**
 * @description A modern replacement for bit fields.
 *
 */
public class Text
{
	public enum Style
	{
		BOLD, ITALIC, UNDERLINE
	}
	
	public void applyStyles(Set<Style> styles)
	{
		System.out.println("Apply style: " + styles);
	}
	
	public static void main(String[] args)
	{
		new Text().applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
	}
}
