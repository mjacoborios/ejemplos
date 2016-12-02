package com.banorte.pff.aes;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

/**
 * This example program shows how AES encryption and decryption can be done in Java.
 * Please note that secret key and encrypted text is unreadable binary and hence 
 * in the following program we display it in hexadecimal format of the underlying bytes.
 * @author Jayson
 */
public class AESEncryption {
 
    /**
     * 1. Generate a plain text for encryption
     * 2. Get a secret key (printed in hexadecimal form). In actual use this must 
     * by encrypted and kept safe. The same key is required for decryption.
     * 3. 
     */
    public static void main(String[] args) throws Exception {
        
    	/*String plainText = "HOLA MUNDO";
        SecretKey secKey = getSecretEncryptionKey();
        byte[] cipherText = encryptText(plainText, secKey);
        String decryptedText = decryptText(cipherText, secKey);
        
        System.out.println("Original Text:" + plainText);
        System.out.println("AES Key (Hex Form):"+bytesToHex(secKey.getEncoded()));
        System.out.println("Encrypted Text (Hex Form):"+bytesToHex(cipherText));
        System.out.println("Descrypted Text:"+decryptedText);
        System.out.println("**********************************************************************");
        System.out.println("AES Key (Base64 Form):"+bytesToBase64(secKey.getEncoded()));
        System.out.println("Encrypted Text (Base64 Form):"+bytesToBase64(cipherText));
        System.out.println("Descrypted Text:"+decryptedText);
        */
        
    	
    	decryptText("yC/qFrGLBXqysLwLO1hK0kj6AtQVY0GC+KwHr/Uc7F8=", "MDMVz10DWVK4GY8+AfbPPTFA47pMAwe0DMZd0QSb9p4=");
        
    }
    
   
    
    /**
     * gets the AES encryption key. In your actual programs, this should be safely
     * stored.
     * @return
     * @throws Exception 
     */
    public static SecretKey getSecretEncryptionKey() throws Exception{
        KeyGenerator generator = KeyGenerator.getInstance("AES");
        generator.init(256); // The AES key size in number of bits
        SecretKey secKey = generator.generateKey();
        return secKey;
    }
    
    /**
     * Encrypts plainText in AES using the secret key
     * @param plainText
     * @param secKey
     * @return
     * @throws Exception 
     */
    public static byte[] encryptText(String plainText,SecretKey secKey) throws Exception{
		// AES defaults to AES/ECB/PKCS5Padding in Java 7	
        Cipher aesCipher = Cipher.getInstance("AES");
        aesCipher.init(Cipher.ENCRYPT_MODE, secKey);
        byte[] byteCipherText = aesCipher.doFinal(plainText.getBytes());
        return byteCipherText;
    }
    
    /**
     * Decrypts encrypted byte array using the key used for encryption.
     * @param byteCipherText
     * @param secKey
     * @return
     * @throws Exception 
     */
    public static String decryptText(byte[] byteCipherText, SecretKey secKey) throws Exception {
		// AES defaults to AES/ECB/PKCS5Padding in Java 7
        Cipher aesCipher = Cipher.getInstance("AES");
        aesCipher.init(Cipher.DECRYPT_MODE, secKey);
        byte[] bytePlainText = aesCipher.doFinal(byteCipherText);
        return new String(bytePlainText);
    }
    
    public static void decryptText(String Bas64_Key, String encryptedText) throws Exception {
    	String algorithm = "AES";
    	
    	byte[] keyBytes = Base64Tobytes(Bas64_Key);
    	
    	SecretKey secKey = new SecretKeySpec(keyBytes, algorithm);
    	
        byte[] cipherText = Base64Tobytes(encryptedText);
        String decryptedText = decryptText(cipherText, secKey);
        System.out.println("Descrypted Text:"+decryptedText);
    }
    
    /**
     * Convert a binary byte array into readable hex form
     * @param hash
     * @return 
     */
    private static String  bytesToHex(byte[] hash) {
        return DatatypeConverter.printHexBinary(hash);
    }
    
    /**
     * Convert a binary byte array into readable Base64 form
     * @param hash
     * @return 
     */
    private static String  bytesToBase64(byte[] hash) {
        return DatatypeConverter.printBase64Binary(hash);
    }
    
    /**
     * Convert a binary byte array into readable Base64 form
     * @param hash
     * @return 
     */
    private static byte[] Base64Tobytes(String base64) {
        return DatatypeConverter.parseBase64Binary(base64);
    }
    
    
}