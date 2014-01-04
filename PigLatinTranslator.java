import java.util.*;

public class PigLatinTranslator {
    private static final String _VOWELS = "AEIOUaeiou";
    
    //Check to see if word to be translated
    //begins with a vowel
    public static Boolean beginsWithVowel (String word){
	return _VOWELS.indexOf (word.substring (0,1)) != -1;
    }

    //Checks to see if a letter is a vowel
    public static Boolean isVowel (String letter){
	return _VOWELS.indexOf (letter) != -1;
    }

    //Returns index of the first volwel in word
    public static int firstVowelIndex(String word){
	int ans = -1;
	int i = 0;
	String letter;
	String qu;
	while (i < word.length()){
	    letter = word.substring(i,i+1);
	    if ((i>0 && word.substring(i-1,i+1).equals("qu")) || !isVowel(letter))
		i++;
	    else if (isVowel(letter)|| (i > 0 && letter.equals("y"))){
		ans = i;
		i = word.length();
	    }
	    else
		i++;
	}
	return ans;
    } 

    //Translates the word
    public static String translate(String word){
	String ans = "";
	int i = firstVowelIndex(word);

	// begins with a vowel
	if (beginsWithVowel(word))
	    ans = word + "way";
	// has at least 1 vowel
	else if ( i != -1)
	    ans = word.substring(i) + word.substring(0,i) + "ay";
	// no vowels
	else
	    ans = word + "ay";
	   
	return ans;
	
    }

    public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Please enter word to be translated. 'q' to quit. ");
	String word = s.nextLine();
	while(! word.equals("q")){
	    System.out.println(translate(word));
	    word = s.nextLine();
	}
	System.out.println("Have a good one :)");
    }

	
}
