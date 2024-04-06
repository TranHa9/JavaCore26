import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Nhập số nguyên thứ nhất:");
//        int a = in.nextInt();
//        System.out.println("Nhập số nguyên thứ hai:");
//        int b = in.nextInt();
//        System.out.println("Nhập số nguyên thứ ba:");
//        int c = in.nextInt();
//        System.out.println("Tổng là: " + sum2(a,b,c));
        int[] numbers = new int[3]; // Mảng có 3 phần tử

        // Khai báo giá trị cho các phần tử theo chỉ số
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));
        String[] names = {"hiên", "an", "huy"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[names.length-1]);
    }
    public static int sum1(int a, int b){
        return a+b;
    }
    public static int sum2(int a, int b, int c){
        return sum1(a,b)+c;
    }
}