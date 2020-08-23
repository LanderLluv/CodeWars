/*
 * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation..
 */
package codewarsgit;

/**
 *
 * @author Tesnal
 */
public class detectPangram {
//    public static boolean check(String sentence){
//        sentence = sentence.toLowerCase();
//        boolean letters[] = new boolean[26];
//        boolean itIs = true;
//        for(int i=0;i<sentence.length();i++){
//            if(sentence.charAt(i) > 96 && sentence.charAt(i) < 123){
//                letters[sentence.charAt(i)-97] = true;
//            }
//        }
//        
//        for(int i=0;i<letters.length && itIs;i++){
//            if(itIs != letters[i]){
//                itIs = false;
//            }
//        }
//        
//        return itIs;
//    }
    
    //Mejor
    public static boolean check(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

  }
    public static void main(String args[]){
        System.out.println(check("The quick brown fox jumps over the lazy dog"));
    }
}
