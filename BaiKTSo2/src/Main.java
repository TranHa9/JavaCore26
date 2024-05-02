import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int option = 0;
        boolean isQuit = false;

        while (!isQuit){
            showMenu();
            System.out.print("Nhập lựa chọn : ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1: {
                    logIn();
                    break;
                }
                case 2: {
                    register();
                    break;
                }
                case 3: {
                    forgotPassword();
                    break;
                }
                case 4: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }
    public static void logIn() {
        System.out.println("Vui lòng nhập Email:");
        String email = scanner.nextLine();
        System.out.println("Vui lòng nhập mật khẩu:");
        String password = scanner.nextLine();
        List<User> userList = getListObjectFromJsonFile("list-user.json");
        for (User user : userList) {
            if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
                   System.out.println("Chào mừng " + user.getUsername() + ", bạn có thể thực hiện các công việc sau:");
                    System.out.println("1. Thay đổi username");
                    System.out.println("2. Thay đổi email");
                    System.out.println("3. Thay đổi mật khẩu");
                    System.out.println("4. Đăng xuất");
                    return;
            }
        }
        System.out.println("Tài khoản hoặc mật khẩu không chính xác.");
    }
    public static void  register(){
        User user = new User();
        System.out.println("Nhập tên người dùng:");
        user.setUsername(scanner.nextLine());
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        while (!isValidEmail(email)){
            System.out.print("Nhập sai email vui lòng nhập lại: ");
            email = scanner.nextLine();
        }
        user.setEmail(email);
        System.out.println("Nhập mật khẩu:");
        String password = scanner.nextLine();
        while (password.length() < 7 || password.length() > 15) {
            System.out.println("Mật khẩu phải từ 7 đến 15 ký tự. Vui lòng nhập lại:");
            password = scanner.nextLine();
        }
        user.setPassword(password);
        List<User> userList = new ArrayList<>();
        userList.add(user);
        boolean success = convertObjectToJsonFile("list-user.json", userList);
        if (success) {
            System.out.println("Tạo người dùng thành công!");
        } else {
            System.out.println("Tạo người dùng không thành công.");
        }
    }
    public static void forgotPassword() {
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        List<User> userList = getListObjectFromJsonFile("list-user.json");
        boolean isCheck = false;
        for (User user : userList) {
            if(user.getEmail().equals(email)) {
                System.out.println("Nhập mật khẩu mới:");
                String newPassword = scanner.nextLine();
                while (newPassword.length() < 7 || newPassword.length() > 15) {
                    System.out.println("Mật khẩu phải từ 7 đến 15 ký tự. Vui lòng nhập lại:");
                    newPassword = scanner.nextLine();
                }
                user.setPassword(newPassword);
                isCheck = true;
                break;
            }
        }
        if (!isCheck) {
            System.out.println("Email bạn nhập không tồn tại:");
        } else {
            boolean success = convertObjectToJsonFile("list-user.json", userList);
            if (success) {
                System.out.println("Mật khẩu đã được cập nhật thành công!");
            } else {
                System.out.println("Cập nhật mật khẩu không thành công.");
            }
        }
    }


    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Quên mật khẩu");
        System.out.println("4 - Thoát\n");
    }

    public static boolean convertObjectToJsonFile(String fileName, Object obj) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            Writer writer = Files.newBufferedWriter(Paths.get(fileName));
            gson.toJson(obj, writer);
            writer.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean isValidEmail(String email){
        String regexEmail = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        return Pattern.matches(regexEmail, email);
    }
    public static List<User> getListObjectFromJsonFile(String fileName) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            List<User> userList = Arrays.asList(gson.fromJson(reader, User[].class));

            reader.close();
            return userList;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}