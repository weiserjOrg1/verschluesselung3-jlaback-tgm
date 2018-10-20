/*
 * Diese Klasse ist nach dem MVC-Modell das Model und verarbeitet die Daten/Informationen
 * 
 * @author Jakob Laback
 * @version 2018-10-20
 */

public class Model {
	//Attribute
	
	private String encryptedText;
	private String decryptedText;
	private String alphabet;
	private int Ver;
	private String keyWord;
	private int level;
	
	/**
	 * Konstruktor.
	 */
	public Model() {
		this.encryptedText = "";
		this.decryptedText = "";
		this.alphabet = "";
		this.keyWord = "";
		this.Ver = 0;
		this.level = 0;
	}
	
	/**
	 * Methode liefert verschlüsselte Text zurück
	 * @return encryptedText der verschlüsselte text
	 */
	public String getencryptedText() {
		return encryptedText;
	}
	
	/**
	 * Methode setzt verschlüsselten Text
	 * @param encryptedText der verschlüsselte Text
	 */
	public void setencryptedText(String encText) {
		this.encryptedText = encText;
	}
	
	/**
	 * Diese Methode liefert den entschlüsselten Text
	 * @return
	 */
	public String getdecryptedText() {
		return decryptedText;
	}
	
	/**
	 * Methode setzt den zu entschlüsselten Text
	 * @param decryptedText
	 */
	public void setdecryptedText(String decText) {
		this.decryptedText = decText;
	}
	
	/**
	 * Methode liefert das Geheimalphabet zurück
	 * @return alphabet
	 */
	public String getAlphabet() {
		return alphabet;
	}
	
}

