package com.travis;

import java.io.* ;
import java.lang.* ;

// Uncomment the following if you are using the JUnit testing framework.
// import junit.framework.TestCase;


public class StaticInnerClass
    {
    private int myX;
    private int myY;

    public StaticInnerClass()
	{
	myX = myY = 0;			// Default to the origin.
	}

    public StaticInnerClass (int x, int y)
	{
	myX = x;
	myY = y;
	}

    public int getX()
	{
	return myX;
	}

    public int getY()
	{
	return myY;
	}


    public static class Test
// Uncomment the following if you are using the JUnit testing framework.
//	extends TestCase
	{
	private static int xValue = 1230;
	private static int yValue = 456789;

	public static void main (String[] args)
	    {
	    StaticInnerClass xyp = new StaticInnerClass (xValue, yValue);
	    if (xValue != xyp.getX())
		{
		System.out.println ("XYPair.Test: X test failed!");
		}
	    else if (yValue != xyp.getY())
		{
		System.out.println ("XYPair.Test: Y test failed!");
		}
	    else
		{
		// Induce a failure, if you want...
		// xyp.myY += 42;
		if (yValue != xyp.getY())
		    {
		    System.out.println
			("XYPair.Test: Hacked Y-value test failed!");
		    }
		else
		    {
		    System.out.println ("XYPair.Test: Tests passed!");
		    }
		}
	    }

// Uncomment the following if you are using the JUnit testing framework.
//	public Test (String name)
//	    {
//	    super (name);
//	    }
//
//	public void testFixedValues()
//	    {
//	    XYPair xyp = new XYPair (xValue, yValue);
//	    assert( xValue == xyp.getX() );
//	    assert( yValue == xyp.getY() );
//	    }
//
//	public void testInducedYValueFailure()
//	    {
//	    XYPair xyp = new XYPair (xValue, yValue + 42);
//	    assert( xValue == xyp.getX() );
//	    assert( yValue == xyp.getY() );
//	    }

	}	// End of class XYPair.Test.

    }	// End of class XYPair.
