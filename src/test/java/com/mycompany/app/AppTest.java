package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;
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
    public void testApp()
    {
        assertTrue( true );
    }
    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5,6));
      assertTrue(new App().search(array,2,3 ));
    }
     public void testFound2() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5,6,18,27));
      assertTrue(new App().search(array,9,3 ));
    }


    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5,6));
      assertFalse(new App().search(array, 3,5));
    }
   
     public void testNotContain() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(14, 22, 33, 49,55,67));
      assertFalse(new App().search(array, 8,5));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 1,2));
    }

    public void testNull() {
      assertFalse(new App().search(null, 1,2));}
}
