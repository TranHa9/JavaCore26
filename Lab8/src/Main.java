public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StudentService studentService = new StudentService();
        Student student = studentService.createStudent(); // Gọi hàm tạo sinh viên
        studentService.calculateAvgPoint(student.theoryPoint, student.practicePoint);
        studentService.printInfo(student);//In ra màn hình thông tin
    }
}