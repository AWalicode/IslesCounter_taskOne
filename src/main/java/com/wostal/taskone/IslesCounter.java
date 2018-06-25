package com.wostal.taskone;

/**
 * Counts Isles
 * @author Aleksander Wostal
 *
 */
public class IslesCounter {
	
	/**
	 * Constructor
	 * 
	 */
	public IslesCounter() {}

	/**
	 * Counts isles from the map
	 * 
	 * @return integer
	 */
	public int countInslands(int map[][]) {
		int counter = 0;
		int width = map.length;
		int height = 0;
		for(int x = 0; x < width; x++) {
			height = map[x].length;
			for(int y = 0; y < height; y++) {
				if(map[x][y] == 1) {
					if(x == 0 && y == 0) {
						counter++;
						continue;
					}
					if(x == 0) {
						if(map[x][y-1] == 0 && map[x+1][y-1] == 0) {
							counter++;
						}
						continue;
					}
					if(y == 0) {
						if(map[x-1][y] == 0) {
							counter++;
						}
						continue;
					}
					if(x == width-1) {
						if(map[x-1][y] == 0 && map[x-1][y-1] == 0 && map[x][y-1] == 0) {
							counter++;
						}
						continue;
					}
					if(map[x-1][y] == 0 && map[x-1][y-1] == 0 && map[x][y-1] == 0 && map[x+1][y-1] == 0) {
						counter++;
					}
				}
			}
		}
		return counter;
	}
}
