import java.math.*;

public class SumOfPrimes {

    public static void main(String[] args){
        BigInteger sum = new BigInteger("0");

        for (int i = 2000001 ; i > 1 ; i = i - 2 ){
            if (primeTest(i)){
                sum = sum.add(BigInteger.valueOf(i));
            }
        }
        System.out.println(sum.toString());
    }


    private static boolean primeTest(int integer){
        for (int i = 2 ; i < integer ; i++){
            if (integer%i == 0) {
                return false;
            }
        }
        return true;
    }
}
