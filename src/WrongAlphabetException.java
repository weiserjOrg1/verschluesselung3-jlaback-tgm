/*
 * This class is used when there is an error in the alphabet
 * 
 * @author Jakob Laback
 * @version 2018-10-11
 */
public class WrongAlphabetException extends Exception{

	/**
	 * Constructor
	 */
	public WrongAlphabetException() {
		super("Das übergebene Alphabet ist falsch!");
	}
	
	/**
	 * Constructor which is printing out the passed text
	 * @param exce the passed message
	 */
	public WrongAlphabetException(String exce) {
		super(exce);
	}
}
