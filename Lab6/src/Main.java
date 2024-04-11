public class Main {
    public static void main(String[] args) {
//        // Tạo đối tượng person
//        Person person = new Person(); //Person() là một Constructor
//
//        // Khởi tạo thuộc tính cho person
//        person.name = "Bùi Hiên";
//        person.age = 25;
//        person.address = "Thái Bình";
//
//        // In ra thông tin của đối tượng person
//        System.out.println(person.name + " - " + person.age + " - " + person.address);
//
//        // Thay đổi tượng tính của person
//        person.address = "Hà Nội";
//
//        // Sử dụng toString đã được overide để hiển thị thông tin của person
//        // System.out.println(person);
//        // Hoặc
//        //System.out.println(person.toString());
//
//        // Phương thức
//        person.play();
//        person.eat("phở");
//        System.out.println(person.name + " sinh năm " + person.getYearOfBirth());

//        Calculator a = new Calculator();
//        a.number1= 20;
//        a.number2 =4;
//        a.printInfo();
//        System.out.println("Tổng: "+a.sum(a.number1, a.number2));
//        System.out.println("Số đầu trừ số cuối: "+a.subtract(a.number1, a.number2));
//        System.out.println("Nhân hai số: "+a.multi(a.number1, a.number2));
//        System.out.println("Số đầu chia số cuối: "+a.division(a.number1, a.number2)+"\n");
//
//        Calculator b = new Calculator();
//        b.number1= 15;
//        b.number2 =3;
//        b.printInfo();
//        System.out.println("Tổng: "+b.sum(b.number1, b.number2));
//        System.out.println("Số đầu trừ số cuối: "+b.subtract(b.number1, b.number2));
//        System.out.println("Nhân hai số: "+a.multi(b.number1, b.number2));
//        System.out.println("Số đầu chia số cuối: "+b.division(b.number1, b.number2));

        String name ="Hà";
        Student student = new Student(name);
    }
}