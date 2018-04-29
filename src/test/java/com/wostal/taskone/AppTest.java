package com.wostal.taskone;

import junit.framework.TestCase;

/**
 * Unit test for counting groups of ones in two-dimensional array.
 * @author Aleksander Wostal
 */
public class AppTest extends TestCase
{
    
    public void testApp()
    {
    	int map1[][] = {};
    	
    	int map2[][] = {
    			{1,0,0,0,0,0,0,1},
    			{1,0,0,0,0,0,0,0},
    			{0,0,0,0,0,0,0,0},
    			{1,0,0,0,0,1,0,1}
    			};
    	
    	int map3[][] = {
    			{1,1,1,1,1,1,1,1},
    			{1,0,0,0,0,0,0,1},
    			{1,0,0,0,0,0,0,1},
    			{1,1,1,1,1,1,1,1}
    			};
    	int map4[][]  = {
    			{0,1,0,1,0,0,0,0},
    			{1,1,1,0,0,0,0,0},
    			{0,0,0,1,0,1,0,0}
    			};
    	IslesCounter ic = new IslesCounter();
        assertTrue(ic.countInslands(map1)==0);
        assertTrue(ic.countInslands(map2)==5);
        assertTrue(ic.countInslands(map3)==1);
        assertTrue(ic.countInslands(map4)==2);
    }
}
