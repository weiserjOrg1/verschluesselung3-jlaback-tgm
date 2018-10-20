
/*
 * Diese Klasse verschiebt das Alphabet um einen gewünschten Wert
 * 
 * @author Jakob Laback
 * @version 2018-10-20
 */

public class ShiftCipher extends MonoAlphabeticCipher{
	
	//Attribute
	private int verschiebung;
	
	
	/**
	 * Konstruktor für die Klasse ShiftCipher	
	 * @param verschiebung übernimmt, um wie viele Stellen die Buchstaben verschoben werden sollen
	 */
	public ShiftCipher(int verschiebung) {
		this.verschiebung = verschiebung;
	}
	
	public void setShiftValue(int verschiebung) {
		if (verschiebung != 0) {
			shift(verschiebung);
		}else {
			//Exception
		}
	}
	
	/** 
  	 * Methode verschiebt alphabet um gewünschten Wert
  	
  	*/
	
	public void shift(int verschiebung) {
		  char[] alphabet  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
		            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
		            'w', 'x', 'y', 'z', 'ä', 'ö', 'ü', 'ß' };
		  
		  	char verschAlphabet[];
		  	verschAlphabet = new char[alphabet.length]; //verschobenes Alphabet Array
		  	
		  	for (int i = 0; i < alphabet.length; i++) {
		  		char buchstabe = (char) (alphabet[i] + verschiebung);
		  		verschAlphabet[i] = buchstabe;
		  	}
		  	
		  	for (int i = 0; i < verschAlphabet.length; i++) { //Testausgabe
		  		System.out.println(verschAlphabet);
		  	}

		  	String alphabet2 = "";
		  	for (int i = 0; i < verschAlphabet.length; i++) {
		  		alphabet2 += verschAlphabet[i]+"";
		  		try {
					super.setSecretAlphabet(alphabet2);
				} catch (WrongAlphabetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  	}
		    
	}
	
	
}
