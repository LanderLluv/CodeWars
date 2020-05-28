/**Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

Example:
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
The returned format must be correct in order to complete this challenge.
Don't forget the space after the closing parentheses!
**/

 package codewarsgit;

/**
 *
 * @author Tesnal
 */
public class createPhoneNumber {
//    public static String createPhoneNumber(int[] numbers) {
//        int pos = 0;
//        StringBuilder sb = new StringBuilder();
//        sb.append("(");
//        pos = numerosAleatorios(sb, numbers, 3, pos);
//        sb.append(") ");
//        pos = numerosAleatorios(sb, numbers, 3, pos);
//        sb.append("-");
//        numerosAleatorios(sb, numbers, 4, pos);
//        return sb.toString();
//    }
//    
//    public static int numerosAleatorios(StringBuilder sb, int[] numbers, int n, int pos){
//        for(int i=0;i<n;i++){
//            sb.append(numbers[pos]);
//            pos++;
//        }
//        return pos;
//    }
 
 //Mejor solucion
 public static String createPhoneNumber(int[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
  }
    
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(createPhoneNumber(nums));
    }
    
    
}
