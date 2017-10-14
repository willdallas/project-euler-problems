import java.math.BigInteger;

public class LargestPrimeFactor {

    public static void main(String[] args){

        final BigInteger NUMBER = new BigInteger("600851475143");

        boolean test = true;

        for (BigInteger i = NUMBER ; test ; i = i.add(new BigInteger("-2"))){
            if (bigPrimeTest(i) && NUMBER.mod(i).equals(BigInteger.ZERO)){
                System.out.print(i.toString());
                test = false;
            }
        }
    }

    private static boolean bigPrimeTest(BigInteger integer){
        for (BigInteger i = new BigInteger("2") ; i.compareTo(integer)<=-1 ; i = i.add(new BigInteger("1"))){
            if (integer.mod(i).equals(BigInteger.ZERO)) {
                return false;
            }
        }
        return true;
    }
}

