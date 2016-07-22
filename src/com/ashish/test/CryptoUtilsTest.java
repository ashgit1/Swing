/** @author Ashishkumar Gupta */
package com.ashish.test;

import java.io.File;

/**
 * @author www.codejava.net
 *
 */
public class CryptoUtilsTest {
	public static void main(String[] args) {
		
		String key = "Mary has one cat";
		File inputFile = new File("D:/Ashish/workspace/ashworkspace/SwingProjects/src/com/ashish/test/document.txt");
		File encryptedFile = new File("D:/Ashish/workspace/ashworkspace/SwingProjects/src/com/ashish/test/document.encrypted");
		File decryptedFile = new File("D:/Ashish/workspace/ashworkspace/SwingProjects/src/com/ashish/test/document.decrypted");

		try {
			CryptoUtils.encrypt(key, inputFile, encryptedFile);
			System.out.println("----------- Encryption Done -----------");
			CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
			System.out.println("----------- Decryption Done -----------");
		} catch (CryptoException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}