public class Main {
    public static void main(String[] args) {
//        int number = 12;
//        if(number > 0) {
//            if(number % 2 == 0) {
//                System.out.println("Số dương chẵn");
//            } else {
//                System.out.println("Số dương lẻ");
//            }
//        } else if (number < 0) {
//            System.out.println("Số âm");
//        } else {
//            System.out.println("Số 0");
//        }
//        int hour = 6;
//        String message = hour < 12 ? "Good morning!" : "Good afternoon!";
//        System.out.println(message);

//        int day = 6;
//
//        switch (day) {
//            case 0: {
//                System.out.println("Hôm nay là Chủ Nhật");
//                break;
//            }
//            case 1: {
//                System.out.println("Hôm nay là thứ 2");
//                break;
//            }
//            case 2: {
//                System.out.println("Hôm nay là thứ 3");
//                break;
//            }
//            case 3: {
//                System.out.println("Hôm nay là thứ 4");
//                break;
//            }
//            case 4: {
//                System.out.println("Hôm nay là thứ 5");
//                break;
//            }
//            case 5: {
//                System.out.println("Hôm nay là thứ 6");
//                break;
//            }
//            case 6: {
//                System.out.println("Hôm nay là thứ 7");
//                break;
//            }
//            default: {
//                System.out.println("...");
//                break;
//            }
//        }
        for (int day = 1; day <= 30; day = day + 1) {
            if (day % 7 == 0) {
                System.out.println("Nghỉ");
                continue;
            }
            System.out.println("Ngày " + day + " thức dậy lúc 5:00");
        }
    }
}
