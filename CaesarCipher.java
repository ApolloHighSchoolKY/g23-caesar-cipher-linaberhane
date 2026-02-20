/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet;
	private char[] shifted;
	private int shift;

    public CaesarCipher() 
    {
        //populate the alphabet with a loop either using the ASCII table or make a string with the alphabet and take 
        // chars from it like tictactoe.
        alphabet = new char[26];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<26; i++)
        {
            alphabet[i] = alpha.charAt(i);
        }

    }

    public CaesarCipher(int num)
    {
        //Fill out the alphabet array
        alphabet = new char[26];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<26; i++)
        {
            alphabet[i] = alpha.charAt(i);
        }

        //Fill out the shifted array
        shift = num;
        shifter(num);

    }

    public String encrypt(String message) 
    {
        //look at that position in alphabet, then the same one in shifted. If it's there (letter), concatenate.
        // Else, concatenate but don't encrypt
        //Use modulus to shift
        String output = "";

        for(int i = 0; i < message.length(); i++)
        {
            char current = message.charAt(i);
            int index = -1;

            for(int alpha = 0; alpha < 26; alpha++)
            {
                if(current == alphabet[alpha])
                   index = alpha;
            }
        
        if(index == -1)
            output += current;
        else
            output += shifted[index];
    }
        return output;
    }

    public String decrypt(String message)
    {
        //Same thing, but look at shifted first and then the same position in alphabet
        String output = "";

        for(int i = 0; i < message.length(); i++)
        {
            char current = message.charAt(i);
            int index = -1;

            for(int alpha = 0; alpha < 26; alpha++)
            {
                if(current == shifted[alpha])
                   index = alpha;
            }
        
        if(index == -1)
            output += current;
        else
            output += alphabet[index];
    }
        return output;
    }

    public void shifter(int num)
    {
        //Reuse a Caesar cipher if you want to change your encription
        shifted = new char[26];

        for(int i=0; i<26; i++)
            shifted[i] = alphabet[(i + num) % 26];
    }
    

}