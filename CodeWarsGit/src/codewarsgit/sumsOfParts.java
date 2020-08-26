/*
 * Let us consider this example (array written in general format):

ls = [0, 1, 3, 6, 10]

Its following parts:

ls = [0, 1, 3, 6, 10]
ls = [1, 3, 6, 10]
ls = [3, 6, 10]
ls = [6, 10]
ls = [10]
ls = []
The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]

The function parts_sums (or its variants in other languages) will take as parameter a list ls and return a list of the sums of its parts as defined above.
 */
package codewarsgit;

import java.util.Arrays;

/**
 *
 * @author Tesnal
 */
public class sumsOfParts {
//    public static int[] sumParts(int[] ls) {
//        int toRet[];
//        if(ls.length == 0){
//            toRet = new int[1];
//        }else{
//            toRet = new int[ls.length+1];
//            int total;
//            int index = 0;
//            while(ls.length != 0){
//                total = Arrays.stream(ls).sum();
//                ls = Arrays.copyOfRange(ls, 1, ls.length);
//                toRet[index] = total;
//                index++;
//            }
//        }
//        toRet[toRet.length-1] = 0;
//        return toRet;
//    }
    
    //Mejor
    public static int[] sumParts(int[] ls) {
    int[] result = new int[ls.length+1];
    for(int i = ls.length-1; i >= 0; --i) {
      result[i] = result[i+1] + ls[i];
    }
    return result;
  }
    
    public static void main(String[] args){
        int ls[] = new int[5];
        System.out.println("INICIAL:");
        for(int i=0;i<5;i++){
            ls[i] = i*2;
            System.out.println(ls[i]);
        }
        ls = sumParts(ls);
        System.out.println("FINAL:");
        for(int i: ls){
            System.out.println(i);
        }
    }
}
