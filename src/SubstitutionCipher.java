/*
 * This class inherits from MonoAlphabeticCipher
 * 
 * @author Jakob Laback
 * @version 2018-11-10
 */
public class SubstitutionCipher extends MonoAlphabeticCipher{
	/**
	 * Constructor
	 * @param secretAlphabet the decrypted-alphabet
	 * @throws WrongAlphabetException
	 */
	SubstitutionCipher(String secretAlphabet) throws WrongAlphabetException{
		setSecretAlphabet(secretAlphabet);
	}
	
	/**
	 * sets the String from the super-Klasse to the new String
	 * @throws DoubleLetterException 
	 * @throws TooShortException 
	 * @throws WrongLetterException 
	 */
	@Override
	public void setSecretAlphabet(String secretAlphabet) throws WrongAlphabetException{
		super.setSecretAlphabet(secretAlphabet);
	}
	
	public static void main(String[] args) {
		try {
		SubstitutionCipher sC = new SubstitutionCipher("QWERTZUIOPÜASDFGHJKLÖÄYXCVBNMß");
		String temp = sC.encrypt("JAKOB");
		Controller c1 = new Controller();
		System.out.println(temp);
		System.out.println(sC.decrypt(temp));
		} catch(WrongAlphabetException e) {
			System.err.println(e);
		}
	}
}
