public class OneThousandAndFirstPrime {
    public static void main(String[] args){
        int largest_prime = 0;
        int numPrimes = 0;
        for (int i = 1 ; numPrimes <= 10001 ; i++){
            if (primeTest(i)) {
                largest_prime = i;
                numPrimes++;
            }
        }
        System.out.println(largest_prime);
    }
    public static boolean primeTest(int integer){
        for (int i = 2 ; i < integer ; i++){
            if (integer%i == 0) {
                return false;
            }
        }
        return true;
    }
}