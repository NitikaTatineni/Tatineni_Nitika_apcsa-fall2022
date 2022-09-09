/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("9", "Spades", 9);
		Card two = new Card("3", "Hearts", 3);
		Card three = new Card ("Queen", "Diamonds", 12);
		
		System.out.println("Card One: " + one);
		System.out.println("Card One: " + two);
		System.out.println("Card One: " + three);
		
		System.out.println("Card One matches Card Two: " + one.matches(two));
		System.out.println("Card Two matches Card Three: " + two.matches(three));
		System.out.println("Card Three matches Card One: " + three.matches(one));
	}
}
