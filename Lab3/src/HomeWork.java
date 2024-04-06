import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        repeatString();
        repeatString1();
        repeatString2();
        sum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập bán kính hình cầu: ");
        double r = sc.nextDouble();
        System.out.println("Thể tích hình cầu là: "+TheTinh(r));
        insert();
    }

    //b1
    public static void repeatString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập chuỗi bạn muốn lặp: ");
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += str;
        }
        System.out.println("Kết quả sau khi lặp: " + result);
    }

    //b2
    public static void repeatString1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập chuỗi bạn muốn lặp: ");
        String str = sc.nextLine();
        String b = "-";
        String result = "";
        for (int i = 0; i < 10; i++) {
            if (i > 0) {
                result += b;
            }
            result += str;
        }
        System.out.println("Kết quả sau khi lặp: " + result);
    }

    //b3
    public static void repeatString2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập chuỗi bạn muốn lặp: ");
        String str = sc.nextLine();
        System.out.println("Vui lòng nhập số lần bạn muốn lặp: ");
        int number = sc.nextInt();
        String result = "";
        String b = "-";
        for (int i = 0; i < 10; i++) {
            if (i > 0) {
                result += b;
            }
            result += str;
        }
        System.out.println("Kết quả sau khi lặp: " + result);
    }

    //b4
    public static void sum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng của các số chia hết cho 5 từ 1-100 là: " + sum);
    }
    //b5
    public static double TheTinh(double r) {
        return (4 * Math.PI * (r * r * r)) / 3;
    }
    //b6
    public static void insert(){
        for(int i = 1; i<=100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Số " + i + " là: FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Số " + i + " là: Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Số " + i + " là: Buzz");
            } else {
                System.out.println("Số " + i);
            }
        }
    }
}
