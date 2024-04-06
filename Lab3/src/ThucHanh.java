import java.util.Scanner;

public class ThucHanh {
//    Bài 1: Viết chương trình tính BMI, với cân nặng và chiều cao nhập vào từ bàn phím
//
//    Chiều cao tính bằng (m)
//    Cân nặng tính bằng (kg)
//    Ra ra màn hình chỉ số BMI và thông báo kết quả nếu
//
//    BMI < 18.5 : Thiếu cân
//    18.5 <= BMI <= 24.9 : Bình thường
//    BMI > 24.9 : Thừa cân
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
//        System.out.println("Vui lòng nhập chiều cao: ");
//        double height = sc.nextDouble();
//        System.out.println("Vui lòng nhập cân nặng: ");
//        double weight = sc.nextDouble();
//        double isCheck = BMI(weight,height);
//        if(isCheck< 18.5){
//            System.out.println("Chỉ số" +isCheck+ "< 18.5 : Thiếu cân");
//        }else if(18.5 <= isCheck && isCheck <= 29.9){
//            System.out.println("Chỉ số 18.5 <= " +isCheck+ " <= 24.9 : Bình thường");
//        }else {
//            System.out.println("Chỉ số " +isCheck+ " > 24.9 : Thừa cân");
//        }

//        Bài tập 2
//
//        Tạo biến month có giá trị từ 1 -> 12, là các tháng trong năm
//        Sử dụng switch-case để in ra mùa tương ứng với giá trị của biến month
//        1, 2, 3 : Mùa xuân
//        4, 5, 6 : Mùa hạ
//        7, 8, 9 : Mùa thu
//        10, 11, 12 : Mùa đông
//        Ví dụ: month = 9 --> “Mùa thu”
        System.out.println("Vui lòng nhập tháng: ");
        int month = sc.nextInt();
        Mua(month);

    }
    static double BMI(double weight, double height){
        return weight/(height*height);
    }
    static void Mua(int month){
        switch (month) {
            case 1,2,3: {
                System.out.println("Mua Xuân");
                break;
            }
            case 4,5,6: {
                System.out.println("Mua hạ");
                break;
            }
            case 7,8,9: {
                System.out.println("Mua thu");
                break;
            }
            case 10,11,12: {
                System.out.println("Mua đông");
                break;
            }
            default: {
                System.out.println("...");
                break;
            }
        }
    }
}
