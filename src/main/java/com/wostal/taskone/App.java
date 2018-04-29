package com.wostal.taskone;

/**
 * 
 * Counts groups of ones from two-dimensional array
 * @author Aleksander Wostal
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IslesCounter ic = new IslesCounter();
    	int map[][] = {
    			{1,0,0,0,0,0,0,1},
    			{1,0,0,0,1,0,0,0},
    			{0,0,0,0,0,0,0,0},
    			{1,0,0,0,0,1,0,1}
    	};
    	int numberOfIsles = ic.countInslands(map);
    	if(numberOfIsles > 1) {
    		System.out.println("There are "+ numberOfIsles +" isles on the map");
    	}else if(numberOfIsles == 1){
    		System.out.println("There is one isle on the map");
    	}else {
    		System.out.println("There are no islands on the map");
    	}
    	
    }
}
