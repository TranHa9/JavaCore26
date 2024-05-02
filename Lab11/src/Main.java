import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo Object student
//        Student student = new Student(1, "Bùi Hiên", 25, "hien@techmaster.vn");
//
//        // Ghi đối tượng student vào file "student.json"
//        convertObjectToJsonFile("student.json", student);

        // ********************************************

        // Khởi tạo danh sách student
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "Nguyễn A", 30, "a@gmail.com"));
//        students.add(new Student(2, "Ngô B", 31, "b@gmail.com"));
//        students.add(new Student(3, "Trần C", 23, "c@gmail.com"));
//        students.add(new Student(4, "Phan D", 26, "d@gmail.com"));
//
//        // Ghi danh sách student vào file "list-student.json"
//        convertObjectToJsonFile("list-student.json", students);


        // ************************************************

        List<Student> students = getListObjectFromJsonFile("list-student.json");

        // Vì có thể list là null, nên xử lý bằng Optional
        //Optional<List<Student>> studentsOptional = Optional.ofNullable(students);

        // In ra thông tin từng Object trong List
        System.out.println("Đọc thông tin từ file list-student.json");
        System.out.println(students);
            students.forEach(System.out::println);

    }
    public static void convertObjectToJsonFile(String fileName, Object obj) {
        try {
            // Tạo đối tượng gson
            // Gson gson = new Gson();

            // Nếu muốn format JSON cho đẹp
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Tạo đối tượng Writer để ghi nội dung vào file
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));

            // Ghi object vào file
            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 1. Lấy Object đơn từ file json
    public static Student getObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            Student student = gson.fromJson(reader, Student.class);

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return student;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    // 2. Lấy List object từ file json
    public static List<Student> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            List<Student> students = Arrays.asList(gson.fromJson(reader, Student[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return students;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}