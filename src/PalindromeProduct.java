import java.lang.*;

public class PalindromeProduct {

    public static void main(String[] args){
        int largest_palindrome = 0;
        for (int i = 1 ; i <= 999 ; i++){
            for (int j = 1 ; j <= 999 ; j++){
                if (palindromeTest(i*j) && i*j > largest_palindrome) {
                    largest_palindrome = i*j;
                }
            }
        }
        System.out.print(largest_palindrome);
    }

    private static boolean palindromeTest(int integer){
        String int_string = "" + integer;
        StringBuilder int_string_SB = new StringBuilder();
        int_string_SB.append(int_string);
        int_string_SB = int_string_SB.reverse();
        int_string = int_string_SB.toString();
        int reverse_integer = Integer.parseInt(int_string);
        return (reverse_integer - integer == 0);
    }
}
