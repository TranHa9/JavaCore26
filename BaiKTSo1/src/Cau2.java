import java.util.Scanner;
public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chuỗi bạn muốn: ");
        String str = sc.nextLine();
        demTu(str);
        demInIndexO(str);
    }

    public static void demTu(String str){
        String[] newStr = str.split(" ");
        System.out.println("Chuỗi có: "+newStr.length+" từ");
    }
    public static void demInIndexO(String str){
        char search = 'o';
        int count = 0;
        boolean check = false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == search){
                count++;
                System.out.print(i+" ");
                check=true;
            }
        }
        if(!check){
            System.out.println("Chuỗi bạn nhập không có ký tự 'o'");
        }else {
            System.out.println("là index của ký tự 'o' trong chuỗi và có " + count + " ký tự 'o'");
        }
    }

}
