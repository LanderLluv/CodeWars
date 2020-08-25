/*
 * The Fibonacci numbers are the numbers in the following integer sequence (Fn):

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

such as

F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.

Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying

F(n) * F(n+1) = prod.

Your function productFib takes an integer (prod) and returns an array:

[F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
depending on the language if F(n) * F(n+1) = prod.

If you don't find two consecutive F(m) verifying F(m) * F(m+1) = prodyou will return

[F(m), F(m+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
F(m) being the smallest one such as F(m) * F(m+1) > prod.
 */
package codewarsgit;

/**
 *
 * @author Tesnal
 */
public class consecutiveFibNumbers {
    /*public static long[] productFib(long prod) {
        long toRet[] = new long[3];
        long num1 = 0;
        long num2 = 1;
        boolean found = false;
        while(num1*num2 <= prod && !found){
            if(num1*num2 == prod){
                found = true;
            }else if(num1*num2 < prod){
                if(num1>num2){
                    num2 = num1+num2;
                }else{
                    num1 = num1+num2;
                }
            }
        }
        do{
            
        }while(num1*num2 < prod && !found);
        if(num1 < num2){
            toRet[0] = num1;
            toRet[1] = num2;
        }else{
            toRet[0] = num2;
            toRet[1] = num1;
        }
        if(found){
            toRet[2] = 1;
        }else{
            toRet[2] = 0;
        }
        return toRet;
   }*/
    
    //Mejor version
    public static long[] productFib(long prod) {
        long x=0;
        long y=1;
        while(x*y<prod) {
          y = x+y;
          x = y-x;
        }
        if(x*y == prod) {
          return new long[] {x, y, 1};
        } else {
          return new long[] {x, y, 0};
        }
  }
    
    public static void main(String[] args){
        long toRet[] = productFib(6);
        System.out.println(toRet[0]);
        System.out.println(toRet[1]);
        System.out.println(toRet[2]);
    }
        
}
