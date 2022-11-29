public class Main {
    public static void main(String[] args) {

        System.out.println(longFactorial(25));

    }

    public static long longFactorial(int number){
        int factor = number-1;
        long response = number;

        while (factor > 0){
            response = response*factor;
            factor--;
        }
        return response;
    }
}