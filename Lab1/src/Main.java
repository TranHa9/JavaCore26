public class Main {
    public static void main(String[] args) {
        System.out.println("Xin chào các bạn");
        sayHello("Hà");
        sayHello_1("Hà");
        System.out.println("Tổng của 8,2 và 19 là: "+sum(8.2,19));
        System.out.println(("Bình phương của 5,2 là: " + square(5.2)));
        System.out.println("Năm 2024 thuộc thế kỷ: " + century(2024));
        System.out.println("Cao 1m52 và nặng 42kg thì chỉ số BMI là: " + BMI(42, 1.52));
    }
    //Câu 2
    public static void sayHello(String name){
        System.out.println("Xin chào " + name);
    }
    //Câu 3
    public static void sayHello_1(String name){
        System.out.println("Xin chào \"" + name + "\"");
    }
    //Câu 4
    public static double  sum(double  a, double  b){
        return a+b;
    }
    //Câu 5
    public static double  square(double number){
        return number*number;
    }
    //Câu 6
    public static int century(int year){
        int a = year /100;
        if (year % 100 !=0){
            a++;
        }
        return a;
    }
    //Câu 7
    static double BMI(double weight, double height){
        return weight/square(height);
    }

}