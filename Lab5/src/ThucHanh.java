import java.util.Arrays;
import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hãy nhập n số lượng phần tử: ");
//        int n = sc.nextInt();
//
//        int [] arr = new int[n];
//
//        System.out.println("Nhập các phần tử vào mảng: ");
//        for(int i = 0; i<n; i++){
//            arr[i]= sc.nextInt();
//
//        }
        int [] arr = {1,2,3,4,5};
        String name = "Hà";
        System.out.println("Kêt quả: " + checkElementExist(arr,3));
        System.out.println("Kêt quả câu 2: " + Arrays.toString(repeatString2(name)));

    }
    //câu 1
    public static int[] du(int[] arr){
        int [] newArr = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
                newArr[i] = arr[i]%2;
        }
        return newArr;
    }

    //Câu 2
    public static String[] repeatString(String str){
        String[] newStr = new String[10];
        for (int i=0; i < 10; i++){
                newStr[i] = str;
        }
        return newStr;
    }
    //Câu 3
    public static String[] repeatString2(String str){
        String[] newStr = new String[20];
        String a = "-";
        for (int i=0; i < 20; i +=2){
            newStr[i] = str;
            newStr[i+1] = a;
        }
        newStr[19] = "";
        return newStr;
    }

    //Câu 4
    public static boolean checkElementExist(int[] arr, int search){
        for(int i : arr){
            if(i == search){
                return true;
            }
        }
        return false;
    }
}
