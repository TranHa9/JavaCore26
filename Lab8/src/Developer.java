import java.util.Scanner;

public class Developer extends Employees  {
    private int overtimeHours;

    public Developer(){}

    public Developer(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Developer(int id, String name, int age, String phone, String email, int salaryBasic, int overtimeHours) {
        super(id, name, age, phone, email, salaryBasic);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

        public int calculateSalary(){
        return getSalaryBasic() + getOvertimeHours() *200000;
    }

    public Developer create(){
        Scanner sc = new Scanner(System.in);
        Developer developer = new Developer();
        System.out.println("Nhập mã nhân viên:");
        int id = sc.nextInt();
        developer.setId(id);
        sc.nextLine();
        System.out.println("Nhập tên nhân viên:");
        String name = sc.next();
        developer.setName(name);
        System.out.println("Nhập tuổi:");
        int age = sc.nextInt();
        developer.setAge(age);
        sc.nextLine();
        System.out.println("Nhập số điện thoại:");
        String phone = sc.next();
        developer.setPhone(phone);
        System.out.println("Nhập email:");
        String email = sc.next();
        developer.setEmail(email);
        System.out.println("Nhập lương cơ bản:");
        int salaryBasic = sc.nextInt();;
        developer.setSalaryBasic(salaryBasic);
        System.out.println("Nhập số giờ overtime:");
        int overtimeHours = sc.nextInt();
        developer.setOvertimeHours(overtimeHours);
        return developer;
    }
    public void display(){
        super.display();
        System.out.println("Số giờ overtime: " + getOvertimeHours());
        System.out.println("Lương: " + calculateSalary());
        System.out.println();
    }
}
