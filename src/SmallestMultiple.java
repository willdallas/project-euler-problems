import java.*;

public class SmallestMultiple {

    public static void main(String[] args){

        boolean test = true;
        int i, j;

        for (i = 2520 ; test ; i++){

            for (j = 1 ; j <=20 ; j++){
                if (i%j != 0) {
                    j = -1;
                    break;
                }
            }

            if (j != -1) {
                test = false;
            }

        }

        System.out.print(i-1);

    }
}
