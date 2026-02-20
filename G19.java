/**
 * @(#)G19.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class G19 {

    public static void main(String[] args) {

    	CaesarCipher cipher = new CaesarCipher(4);

    	System.out.println(cipher.encrypt("hello world!"));
    	System.out.println(cipher.decrypt("ukq zez ep!"));

    	//Create a new cipher using the shifter(#) method
		CaesarCipher newCipher = new CaesarCipher(3);

    	//Encrypt and decrypt a message with your new cipher
		System.out.println("\n" + newCipher.encrypt("happy birthday!"));
		System.out.println(newCipher.decrypt("khoor"));

    }


}