/*
 * Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
 */
package codewarsgit;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Tesnal
 */
public class highestScoringWord {
//    public static String high(String s) {
//        String toRet = "";
//        int highest = 0;
//        int sum = 0;
//        String words[] = s.split(" ");
//        for(String w: words){
//            sum = 0;
//            for(int i =0;i<w.length();i++){
//                sum += w.charAt(i)-96;
//            }
//            if(sum > highest){
//                highest = sum;
//                toRet = w;
//            }
//        }
//        return toRet;
//    }
    
    //Mejor public static String high(String s) {
   public static String high(String s) {
    return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get(); 
  }
    
    public static void main(String args[]){
        System.out.println(high("what time are we climbing up to the volcano"));
    }
}
