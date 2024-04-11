public class Cau4 {
    public static void main(String[] args) {
        System.out.println("10 số nguyên tố đầu tiên là: ");
        lk10SoNTDau();
        System.out.println("Các số nguyên tố nhỏ hơn 10 là: ");
        lkSoNTNhoHon10();

    }

    public static void lk10SoNTDau(){
        int count=0;
        for (int i = 0; i < 100;i++){
            if(count < 10 && isPrimeNumber(i)){
                System.out.print(i+" ");
                count++;
            }
        }
    }

    public static void lkSoNTNhoHon10(){
        int count=0;
        for (int i = 0; i < 100;i++){
            if(count < 10 && isPrimeNumber(i) && i<10){
                System.out.print(i+" ");
                count++;
            }
        }
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
