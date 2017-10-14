public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int count = 3 ; count < 1000 ; count++){
            if (count%3 == 0 || count%5 == 0){
                sum += count;
            }
        }
        System.out.print(sum);
    }
}