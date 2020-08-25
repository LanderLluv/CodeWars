/*
 * which takes numbers num1 and num2 and returns 1 if there is a straight triple of a number at any place in num1 and also a straight double of the same number in num2.

If this isn't the case, return 0
 */
package codewarsgit;

/**
 *
 * @author Tesnal
 */
public class tripleDouble {
    public static int TripleDouble(long num1, long num2){
        String n1 = Long.toString(num1);
        String n2 = Long.toString(num2);
        for(int i=0;i<n1.length()-2;i++){
            if(n1.charAt(i) == n1.charAt(i+1) && n1.charAt(i) == n1.charAt(i+2)){
                for(int j=0;j<n2.length()-1;j++){
                    if(n2.charAt(j) == n1.charAt(i) && n2.charAt(j+1) == n1.charAt(i)){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
    
    public static void main(String args[]){
        System.out.println(TripleDouble(12234, 1233225));
    }
}
