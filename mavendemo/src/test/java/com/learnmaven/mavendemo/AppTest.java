package com.learnmaven.mavendemo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAdd()
    {
        assertEquals( 30, new Calculator().add(10, 20) );
    }
    
    public void testSubtract()
    {
        assertEquals( 10, new Calculator().subtract(20,10) );
    }
    
    public void testMultiple()
    {
        assertEquals( 200, new Calculator().multiple(10, 20) );
    }
    
    public void testDivide()
    {
        assertEquals( 1.0, new Calculator().divide(10, 10) );
    }
}
