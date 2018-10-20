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
	 * Methode liefert verschl�sselte Text zur�ck
	 * @return encryptedText der verschl�sselte text
	 */
	public String getencryptedText() {
		return encryptedText;
	}
	
	/**
	 * Methode setzt verschl�sselten Text
	 * @param encryptedText der verschl�sselte Text
	 */
	public void setencryptedText(String encText) {
		this.encryptedText = encText;
	}
	
	/**
	 * Diese Methode liefert den entschl�sselten Text
	 * @return
	 */
	public String getdecryptedText() {
		return decryptedText;
	}
	
	/**
	 * Methode setzt den zu entschl�sselten Text
	 * @param decryptedText
	 */
	public void setdecryptedText(String decText) {
		this.decryptedText = decText;
	}
	
	/**
	 * Methode liefert das Geheimalphabet zur�ck
	 * @return alphabet
	 */
	public String getAlphabet() {
		return alphabet;
	}
	
}

