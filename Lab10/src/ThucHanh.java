import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThucHanh {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Product> products= new ArrayList<>();
        products.add(new Product(1, "Laptop", "Dell XPS 15", 10, 45000000));
        products.add(new Product(2, "Smartphone", "iPhone 15 Pro", 5, 25000000));
        products.add(new Product(3, "Tablet", "iPad Air", 3, 15000000));
        products.add(new Product(4, "Smartwatch", "Samsung Galaxy Watch", 2, 7000000));
        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    displayAllProducts( products);
                    break;
                }
                case 2: {
                    searchProductByName(products);
                    break;
                }
                case 3: {
                    searchProductById(products);
                    break;
                }
                case 4: {
                    searchProductNumber(products);
                    break;
                }
                case 5: {
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

    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1. Xem danh sách sản phẩm");
        System.out.println("2. Tìm sản phẩm theo tên");
        System.out.println("3. Tìm sản phẩm theo ID");
        System.out.println("4. Tìm các sản phẩm có số lượng dưới 5");
        System.out.println("5. Thoát");
    }

    private static void displayAllProducts(ArrayList<Product> products) {
        System.out.println("Danh sách sản phẩm:");
        System.out.println(products);
    }

    private static void searchProductByName(ArrayList<Product> products) {
        List<Product> listProduct = new ArrayList<>();
        System.out.print("\nNhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                listProduct.add(product);
                System.out.println("Sản phầm tìm được là:\n"+listProduct);
            }
        }
    }

    private static void searchProductById(ArrayList<Product> products) {
        System.out.print("\nNhập ID của sản phẩm cần tìm: ");
        int id = scanner.nextInt();
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("Sản phầm tìm được là:\n"+product);
            }
        }
    }

    private static void searchProductNumber(ArrayList<Product> products) {
        List<Product> listProduct = new ArrayList<>();
        for (Product product : products) {
            if (product.getQuantity() < 5) {
                listProduct.add(product);
                System.out.println("Sản phầm có số lượng dưới 5:\n"+listProduct);
            }
        }
    }
}
