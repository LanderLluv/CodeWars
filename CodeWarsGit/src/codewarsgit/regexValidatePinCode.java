/*
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

eg:

Solution.validatePin("1234") === true
Solution.validatePin("12345") === false
Solution.validatePin("a234") === false
 */
package codewarsgit;

/**
 *
 * @author Tesnal
 */
public class regexValidatePinCode {
//    public static boolean validatePin(String pin) {
//        if((pin.length() == 4 || pin.length() == 6) &&pin.matches("^[0-9]*$")){
//            return true;
//        }else{
//            return false;
//        }
//    }
    
    //Mejor solucion
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
    
    public static void main(String[] args){
        String pin = "1234";
        System.out.println(validatePin(pin));
        pin = "12345";
        System.out.println(validatePin(pin));
        pin = "123456";
        System.out.println(validatePin(pin));
        pin = "12345";
        pin = "1234A";
        System.out.println(validatePin(pin));
        
    }
}
