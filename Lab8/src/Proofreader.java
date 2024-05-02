import java.util.Scanner;

public class Proofreader extends Employees {
    private int error;
    public Proofreader(){}

    public Proofreader(int error) {
        this.error = error;
    }
    public Proofreader(int id, String name, int age, String phone, String email, int salaryBasic, int error) {
        super(id, name, age, phone, email, salaryBasic);
        this.error = error;
    }


    public int getError() {
        return error;
    }
    public void setError(int error) {
        this.error = error;
    }

    public int calculateSalary(){
        return getSalaryBasic() + getError() *50000;
    }

    public Proofreader create(){
        Scanner sc = new Scanner(System.in);
        Proofreader proofreader = new Proofreader();
        System.out.println("Nhập mã nhân viên:");
        int id = sc.nextInt();
        proofreader.setId(id);
        sc.nextLine();
        System.out.println("Nhập tên nhân viên:");
        String name = sc.next();
        proofreader.setName(name);
        System.out.println("Nhập tuổi:");
        int age = sc.nextInt();
        proofreader.setAge(age);
        sc.nextLine();
        System.out.println("Nhập số điện thoại:");
        String phone = sc.next();
        proofreader.setPhone(phone);
        System.out.println("Nhập email:");
        String email = sc.next();
        proofreader.setEmail(email);
        System.out.println("Nhập lương cơ bản:");
        int salaryBasic = sc.nextInt();;
        proofreader.setSalaryBasic(salaryBasic);
        System.out.println("Nhập số lỗi phát hiện được:");
        int error = sc.nextInt();
        proofreader.setError(error);
        return proofreader;
    }

    public void display(){
        super.display();
        System.out.println("Số lỗi phát hiện được: " + getError());
        System.out.println("Lương: " + calculateSalary());
        System.out.println();
    }
}
