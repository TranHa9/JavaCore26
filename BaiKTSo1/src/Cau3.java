import java.util.Random;

public class Cau3 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Số ngẫu nhiên: " + randomNumber);
        System.out.println("Là số nguyên tố: "+isPrimeNumber(randomNumber));
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
