import java.util.Random;
import java.util.Scanner;

public class StudentService {
    public Student createStudent (){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Random random = new Random();
        int randomId = random.nextInt(101);
        student.id=randomId;
        System.out.println("Nhập tên của bạn: ");
        student.name= sc.nextLine();
        System.out.println("Nhập điểm lý thuyết của bạn: ");
        student.theoryPoint= sc.nextDouble();
        System.out.println("Nhập điểm thực hành của bạn: ");
        student.practicePoint=sc.nextDouble();
        return student;
    }
    public double calculateAvgPoint(double theoryPoint, double practicePoint) {
        return (theoryPoint + practicePoint) / 2;
    }
    public void printInfo(Student s) {
        System.out.println("---Thông Tin---");
        System.out.println("Mã học viên: "+ s.id);
        System.out.println("Họ Tên: "+ s.name);
        System.out.println("Điểm lý thuyết: "+ s.theoryPoint);
        System.out.println("Điểm trung bình: "+ calculateAvgPoint(s.theoryPoint,s.practicePoint));
    }
}
