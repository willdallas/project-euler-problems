public class SumSquareDifference {

    public static void main(String[] args){

        int sumOfSquares=0, squaredSum=0, difference;

        for (int i = 1 ; i <= 100 ; i++){
            sumOfSquares = sumOfSquares + (i*i);
            squaredSum = squaredSum + i;
        }

        squaredSum = squaredSum*squaredSum;

        difference = squaredSum - sumOfSquares;

        System.out.println(difference);
    }

}
