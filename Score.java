/* Author: Cas Gentry *
 * Filename: Yahtzee.java 
 * 
 * Main constructor: Yahtzee.java */

public class Score {
	Player which;
	String label;
	int value;
	boolean used;
	
	public Score(String l){
		label = l;
		used = false;
	}
}
