
public class KeywordCipher extends MonoAlphabeticCipher{
	//Attribute
	
	private String passwort;
	
	/**
	 * Konstruktor
	 * @param passwort
	 */
	
	public KeywordCipher(String keyword) {
		this.passwort = passwort;
	}
	
	public void setKeyword(String keyword) { //später--> throws ...Exception
		//Exception-Abfrage
		
		this.passwort = keyword.toUpperCase();
		String s = "";
		
		for (int i = 0; i < this.passwort.length(); i++) {
			s += this.passwort.charAt(i);
		}
		
		for (int i = 0; i < 30; i++) {
			s += (char) (i+21);
		}
		
		
	}
}
