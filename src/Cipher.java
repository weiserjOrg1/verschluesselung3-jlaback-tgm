/*
 * This interface is used to define the methods 
 * encrypt and decrypt
 * 
 * @auhor Jakob Laback
 * @version 2018-11-10
 */

public interface Cipher {
	/**
	 * encypts the text
	 * @param verschlüsselt the text which will be decrypted
	 * @return the decrypted text
	 */
	public String encrypt(String verschlüsselt);
	
	
	/**
	 * decrypts the text
	 * @param entschlüsselt the text which will be encrypted
	 * @return the encrypted text
	 */
	public String decrypt(String entschlüsselt);
}
