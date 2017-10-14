@SuppressWarnings("SpellCheckingInspection")
public class EvenFibonacciNumbers {

    public static void main(String[] args){

        int sumOfFibonaccis = 0;

        for (int i = 1 ; fibonacciGenerator(i) <= 4000000 ; i++){
            if (fibonacciGenerator(i) % 2 == 0){
                sumOfFibonaccis += fibonacciGenerator(i);
            }
        }

        System.out.print(sumOfFibonaccis);

    }

    private static int fibonacciGenerator(int i){
        if (i == 1) return 1;
        if (i == 2) return 2;
        else return (fibonacciGenerator(i-1) + fibonacciGenerator(i-2));
    }
}
