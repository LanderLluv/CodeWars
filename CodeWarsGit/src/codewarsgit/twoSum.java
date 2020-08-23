/*
 * Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different items in the array that, when added together, give the target value. The indices of these items should then be returned in a tuple like so: (index1, index2).

For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target will always be the sum of two different items from that array).
 */
package codewarsgit;

/**
 *
 * @author Tesnal
 */
public class twoSum {
//    public static int[] twoSum(int[] numbers, int target){
//        int solution[] = new int[2];
//        boolean found = false;
//        for(int i=0;i<numbers.length-1 && !found;i++){
//            System.out.println("i:" + i);
//            for(int j=i+1;j<=numbers.length-1 && !found;j++){
//                System.out.println("j:" + j);
//                if(numbers[i]+numbers[j] == target){
//                    found = true;
//                    solution[0] = numbers[i];
//                    solution[1] = numbers[j];
//                }
//            }
//        }
//        System.out.println(solution[0] + "+" + solution[1]);
//        return solution;
//    }
    
    //Optima
    public static int[] twoSum(int[] numbers, int target)
    {
       for(int i = 0; i < numbers.length; i++) {
           for(int j = i + 1; j < numbers.length; j++) {
               if(numbers[i] + numbers[j] == target){
                   return new int[]{i, j};
               }
           }
       }
      return null; 
    }
    
    public static void main(String args[]){
        int numbers[] = new int[10];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = i;
        }
        System.out.println("Length:" + numbers.length);
        twoSum(numbers, 17);
    }
}
