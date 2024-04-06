import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        System.out.println("Tính chu vi và diện tích hình chứ nhật");
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập chiều dài hình chữ nhật:");
        double a = sc.nextDouble();
        System.out.println("Vui lòng nhập chiều rộng hình chữ nhật");
        double b = sc.nextDouble();
        System.out.println("Chu vi hình chữ nhật là: " +cv(a,b));
        System.out.println("Diện tích hình chữ nhật là: "+ area(a,b));
        sc.nextLine();
        System.out.println("Vui lòng nhập tên của bạn:");
        String name = sc.nextLine();
        System.out.println("Vui lòng nhập tuổi:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Vui lòng nhập giới tính:");
        String gender = sc.nextLine();
        System.out.println("Vui lòng nhập địa chỉ của bạn:");
        String address = sc.nextLine();
        System.out.printf("Xin chào các bạn, mình tên là %s, năm nay mình %d tuổi, giới tính %s. Hiện tại mình đang sống và làm việc tại %s", name, age, gender, address);
    }

    public static double cv(double length, double width){
        return 2*(length+width);
    }
    public static double area(double length, double width){
        return length*width;
    }
}
