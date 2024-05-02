public class Employees {
    private int id;
    private String name;
    private int age;
    private String phone;
    private String email;
    private int salaryBasic;

    public Employees (){}

    public Employees(int id, String name, int age, String phone, String email, int salaryBasic) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.salaryBasic = salaryBasic;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getSalaryBasic() {
        return salaryBasic;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalaryBasic(int salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    public void display() {
        System.out.println("Mã nhân viên: " + getId());
        System.out.println("Tên nhân viên: " + getName());
        System.out.println("Tuổi: " + getAge());
        System.out.println("Số điện thoại: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("Lương cơ bản: " + getSalaryBasic());
    }
}
