import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //Câu 1:
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập họ tên: ");
        String fullName = sc.nextLine();
        String[] name = fullName.split(" ");
        String finalName ="";
        for (int i = 0; i<name.length; i++) {
            finalName += name[i].substring(0,1).toUpperCase()+ name[i].substring(1) + " ";
        }
        System.out.println("Kết quả: "+ finalName);

        //Câu 2
        int option =0;
        boolean isQuit = false;
        while (!isQuit){
            menu();
            System.out.println("Hãy nhập lựa chọn: ");
            option = sc.nextInt();
            switch (option){
                case 1:{
                    System.out.println("Mảng bạn đã nhập là: "+Arrays.toString(insert()));;
                    break;
                }
                case 2:{
                    chan();
                    break;
                }
                case 3: {
                    isQuit = true;
                    break;
                }
            }
        }

    }

    public static int[] insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n số lượng phần tử cho mảng: ");
        int n = sc.nextInt();

        int [] arrNumber = new int[n];

        System.out.println("Vui lòng nhập từng phần tử cho mảng: ");
        for(int i = 0; i < n; i++){
            arrNumber[i]= sc.nextInt();
        }
        return arrNumber;
    }
    public static void chan(){
        int [] arr = insert();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void menu(){
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Tạo mảng số nguyên gồn n phần tử và in ra màn hình: ");
        System.out.println("2 - Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử: ");
        System.out.println("3 - Thoát\n");
    }
}
