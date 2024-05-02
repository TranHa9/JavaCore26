import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng nhân viên:");
        int n = scanner.nextInt();
        scanner.nextLine();
        Employees [] employees = new  Employees[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Chọn nhân viên muốn nhập:\n1-Lập trình viên 2-Kiểm chứng viên");
            int isCheck = scanner.nextInt();
            scanner.nextLine();
            if (isCheck == 1) {
                Developer developer = new Developer();
                employees[i] = developer.create();
            } else if (isCheck == 2) {
                Proofreader proofreader = new Proofreader();
                employees[i] = proofreader.create();
            }else {
                System.out.println("Loại nhân viên không hợp lệ.");
            }
        }
        System.out.println("\nThông tin nhân viên:");
        for (Employees employee : employees) {
            employee.display();
        }
    }

}

