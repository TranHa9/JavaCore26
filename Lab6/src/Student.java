public class Student {
    public enum Gender {
        MALE, FEMALE
    }
    public String name;
    public int age;
    public Gender gender;

    public Student() {
    }

    public Student(String name) {
        System.out.println("Hàm constuctor với 1 tham số được gọi");
        this.name = name;
    }

    public Student(String name, int age) {
        this(name); // this phải là câu lệnh đầu tiên trong constructor body, this(name) tương ứng với construct 1 tham số ở trên
        this.age = age;
        System.out.println("Hàm constuctor với 2 tham số được gọi");
    }

    public Student(String name, int age, Gender gender) {
        this(name, age); // this(name, age) tương ứng với construct 2 tham số ở trên
        this.gender = gender;
        System.out.println("Hàm constuctor với 3 tham số được gọi");
    }
}
