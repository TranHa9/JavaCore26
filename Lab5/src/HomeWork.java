import java.util.Scanner;

public class HomeWork {
//    Viết chương trình nhập vào từ bàn phím số hàng, số cột của mảng 2 chiều
//
//    Và thực hiện các yêu cầu sau
//
//    Nhập vào các phần tử của mảng (các phần tử của mảng là số nguyên)
//    In ra mảng vừa nhập
//    Tính tổng các phần tử chẵn có trong mảng
//    Tìm giá trị lớn nhất của mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập và số hàng của mảng:");
        int soHang = sc.nextInt();
        System.out.println("Nhập vào số cộc của mảng:");
        int soCot = sc.nextInt();

        int [][] arr = new int[soHang][soCot];

        for(int i=0; i<soHang; i++){
            for(int j=0; j < soCot; j++){
                System.out.println("Nhập phần tử thứ [" + i +"," + j + "]:");
                arr[i][j] = sc.nextInt();
            }
        }
        display(arr);
        System.out.println("Tổng các phần tử chẵn trong mảng là: "+tongChan(arr));
        System.out.println("Phần tử lớn nhất trong mảng là: "+findMax(arr));

    }
    public static void display(int[][] arr){
        System.out.println("Mảng bạn vừa nhập là: \n");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int tongChan(int[][] arr){
        int sum=0;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                if(arr[i][j] % 2 ==0){
                    sum +=arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int findMax(int[][] arr){
        int newArr = arr[0][0];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                if(newArr < arr[i][j]){
                    newArr = arr[i][j];
                }
            }
        }
        return newArr;
    }

}
