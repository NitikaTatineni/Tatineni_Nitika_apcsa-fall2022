/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] r1 = {"Ace", "2", "3", "4"};
		String[] s1 = {"Clubs", "Spades"};
		int[] v1 = {1,2,3,4};
		
		Deck d1 = new Deck(r1,s1,v1);
		System.out.print("Deck One is empty: " + d1.isEmpty() + "\n");
		System.out.print("Deck One size: " + d1.size() + "\n");
		System.out.print("Deck One dealt card is: " + d1.deal() +"\n");
		System.out.println(d1.toString() + "\n");
		
		
		
		String[] r2 = {"King", "9"};
		String[] s2 = {"Diamonds", "Spades", "Hearts"};
		int[] v2 = {13,9};
	
		Deck d2 = new Deck(r2,s2,v2);
		System.out.print("Deck One is empty: " + d2.isEmpty() + "\n");
		System.out.print("Deck One size: " + d2.size() + "\n");
		System.out.print("Deck One dealt card is: " + d2.deal() +"\n");
		System.out.println(d2.toString() + "\n");
		
		
		
		String[] r3 = {"Jack", "4", "7", "10", "Queen"};
		String[] s3 = {"Hearts", "Clubs", "Diamonds", "Spades"};
		int[] v3 = {11,4,7,10,12};
		
		Deck d3 = new Deck(r3,s3,v3);
		System.out.print("Deck One is empty: " + d3.isEmpty() + "\n");
		System.out.print("Deck One size: " + d3.size() + "\n");
		System.out.print("Deck One dealt card is: " + d3.deal() +"\n");
		System.out.println(d3.toString() + "\n");
		
		
		//standard deck to test shuffle
		String[] sr = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] ss = {"Hearts", "Clubs", "Diamonds", "Spades"};
		int[] sv = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Deck s = new Deck(sr,ss,sv);
		System.out.print("Standard Deck is empty: " + s.isEmpty() + "\n");
		System.out.print("Standard Deck size: " + s.size() + "\n");
		System.out.println(s.toString() + "\n");
		
		System.out.println("Shuffled Deck: " + "\n");
		s.shuffle();
		System.out.println(s);
		
		
	}
}
