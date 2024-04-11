import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Nhập các phần từ trong mảng: ");
        for(int i=0; i< row; i++){
            for (int j=0; j<col;j++){
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Mảng bạn vừa nhập là: ");
        display(arr);
        System.out.println("Các phần tử nằm trên đường chéo chính là: ");
        lkPhanTuTrenDuongCheo(arr);

        int[][] newArr=new int[row][col];
        System.out.println("Nhập các phần từ trong mảng mới: ");
        for(int i=0; i< row; i++){
            for (int j=0; j<col;j++){
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                newArr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Tổng hai mảng là:");
        display(sumArr(arr,newArr));
    }
    public static void display(int[][] arr){
        for(int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void lkPhanTuTrenDuongCheo(int[][] arr){
        for(int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length;j++){
                if(i==j) {
                    System.out.print(arr[i][j] + "\t");
                }else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }
    public static int[][] sumArr(int[][] a, int[][] b){
        int[][] c = new int[a.length][a[0].length];
        for(int i=0; i< a.length; i++){
            for (int j=0; j<b[i].length;j++){
               c[i][j] = a[i][j]+ b[i][j];
            }
        }
        return c;
    }
}
