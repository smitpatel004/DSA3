public class choosingteam {
    public static void main(String[] args) {
        int number = 29; // You can change this number to test different values
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }


    }
}
