import java.time.LocalDate;

public class Person {
    // Các thuộc tính của class Person
    public String name;
    public int age;
    public String address;

    // Các phương thức của class Person
    public void play() {
        System.out.println("Method play được gọi!");
    }

    public void eat(String foodName) {
        System.out.println("Method eat được gọi!");
        System.out.println("Mlem mlem! " + foodName);
    }

    public int getYearOfBirth() {
        System.out.println("Method getYearOfBirth được gọi!");
        return LocalDate.now().getYear() - age;
    }

}
