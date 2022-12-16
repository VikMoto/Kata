package KataLevel1;
//Write a function that takes in a string of one or more words, and returns the same string,
// but with all five or more letter words reversed (Just like the name of this Kata). Strings
// passed in will consist of only letters and spaces. Spaces will be included only when more
// than one word is present.
//
//Examples:
//
//spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//spinWords( "This is a test") => returns "This is a test"
//spinWords( "This is another test" )=> returns "This is rehtona test"
import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public static String spinWords(String sentence) {
        //TODO: Code stuff here
        return Arrays.stream(sentence.split(" "))
                .map(String::toString)
                .map(s ->  s.length() >= 5 ? new StringBuilder(s).reverse() : new StringBuilder(s))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String words = "";
        System.out.println("words = " + words);
        System.out.println("spinWords(words) = " + spinWords(words));
    }
}
