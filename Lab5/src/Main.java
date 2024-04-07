import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập n số lượng phần tử: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Nhập các phần tử vào mảng: ");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int option = 0;
        boolean isQuit= false;
        while (!isQuit){
            menu();
            System.out.println("Hãy nhập lựa chọn: ");
            option = sc.nextInt();
            switch (option){
                case 1 :{
                    System.out.println("Mảng bạn vừa nhập là: "+Arrays.toString(arr));
                    break;
                }
                case 2 :{
                    System.out.println("Tổng các phần tử trong mảng là: "+sum(arr));
                    break;
                }
                case 3 :{
                    System.out.println("Phần tử nhỏ nhất là: "+ findMin(arr));
                    break;
                }
                case 4 :{
                    System.out.println("Phần tử lớn nhất là: "+findMax(arr));
                    break;
                }
                case 5 :{
                    System.out.println("Số lượng phần tử chẵn trong mảng là: "+countChan(arr));
                    break;
                }
                case 6 :{
                    System.out.println("Số lượng phần tử chẵn trong mảng là: "+countLe(arr));
                    break;
                }
                case 7:{
                    isQuit = true;
                    break;
                }

            }
        }
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        for(int i = 0; i < numbers.length; i++){  // so dong
            for(int j = 0; j < numbers[i].length; j++){ // so cot
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i< arr.length; i++){
            sum += arr[1];
        }
        return sum;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int countChan(int[] arr){
        int count=0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%2==0){
                count ++;
            }
        }
        return count;
    }
    public static int countLe(int[] arr){
        int count=0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%2 !=0){
                count ++;
            }
        }
        return count;
    }
    public static void menu(){
        System.out.println("\n*****MENU******");
        System.out.println("1 - In ra các phân tử trong mảng");
        System.out.println("2 - Tình tổng các phần tử trong mảng");
        System.out.println("3 - Tìm phần tử nhỏ nhất");
        System.out.println("4 - Tìm phần tử lớn nhất");
        System.out.println("5 - Đếm số lượng phần tử chẵn");
        System.out.println("6 - Đếm số lượng phần tử lẻ");
        System.out.println("7. Thoát");
    }
}