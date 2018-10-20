/*
 * This is the class which savesthe secretAlphabet
 * 
 * @author Jakob Laback
 * @version 2018-11-10
 * 
 */


public class MonoAlphabeticCipher implements Cipher{
	private String secretAlphabet;
	private String alphabet;
	
	/**
	 * Constructor
	 */
	public MonoAlphabeticCipher() {
		setAlphabet("ABCDEFGHIJKLMNOPQRSTUVWXYZ����");
	}
	
	/**
	 * returns the secretAlphabet
	 * @return the secretAlphabet
	 */
	public String getSecretAlphabet() {
		return this.secretAlphabet;
	}
	
	/**
	 * Setzt das geheime Alphabet und �berpr�ft, ob es lang genug ist, doppelte Buchstaben enth�lt und ob es
	 * Zeichen enth�lt, welche nicht in das Alphabet geh�ren
	 * @param secretAlphabet Das geheime Alphabet
	 */
	protected void setSecretAlphabet(String secretAlphabet) throws WrongAlphabetException{ //thows is used to explicitly throw an exception from a method or any block of code
		if(secretAlphabet.length()==30) {
			for(int j = 0;j<secretAlphabet.length();j++) {
				for(int i = 0;i<secretAlphabet.length();i++) {
					if(i != j) {
						if(secretAlphabet.charAt(j) == secretAlphabet.charAt(i)) {
							secretAlphabet = "QWERTZ�UIOP�ASDFGHJKL��YXCVBNM"; //used the qwertz layout for the secret alphabet
							throw new WrongAlphabetException("Achtung: !Ein Buchstabe im Alphabet ist doppelt!");
						}
					}
				}
			}
			for(int i = 0;i<alphabet.length();i++) {
				if(secretAlphabet.indexOf(alphabet.charAt(i))==-1) {
					secretAlphabet = "QWERTZ�UIOP�ASDFGHJKL��YXCVBNM";
					throw new WrongAlphabetException("Achtung: !Im Alphabet befindet sich ein Zeichen dass hier nicht sein sollte!");
				}
			}
		}else {
			secretAlphabet = "QWERTZ�UIOP�ASDFGHJKL��YXCVBNM";
			throw new WrongAlphabetException("Das Alphabet ist zu kurz!");
		}
		this.secretAlphabet = secretAlphabet;
	}

	/**
	 * decrypts the text
	 */
	@Override
	public String encrypt(String verschl�sselt) {
		StringBuilder x = new StringBuilder();
		for(int i = 0;i<verschl�sselt.length();i++) {
			x.append(secretAlphabet.charAt(alphabet.indexOf(verschl�sselt.toUpperCase().charAt(i))));
		}
		return x.toString();
	}

	/**
	 * encrypts the text
	 */
	@Override
	public String decrypt(String entschl�sselt) {
		StringBuilder x = new StringBuilder();
		for(int i = 0;i<entschl�sselt.length();i++) {
			x.append(alphabet.charAt(secretAlphabet.indexOf(entschl�sselt.toUpperCase().charAt(i))));
		}
		return x.toString();
	}

	/**
	 * returns the standard alphabet
	 * @return alphabet the standard alphabet
	 */
	public String getAlphabet() {
		return alphabet;
	}

	/**
	 * sets the standard alphabet
	 * @param alphabet the standard alphabet
	 */
	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}
}
