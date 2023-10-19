package run;

import bussiness.Users;
import service.IUserService;
import service.UserService;
import utils.InputMethods;

import java.util.Objects;
import java.util.Scanner;

public class ShopManager {
    private static final IUserService newUser = new UserService();
    public static Users currentLogin;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("\n\n \u001B[36m⭐⭐⭐⭐⭐WELCOME TO MYSHOP HA⭐⭐⭐⭐⭐\n" +
                    "1. Đăng Nhập/Đăng Ký \n" +
                    "2. Danh mục (Catagory)\n" +
                    "3. Giỏ Hàng\n" +
                    "4. Tìm kiếm Sản phầm\n" +
                    "5. Thoát\n" +
                    "Lựa chọn: ");
            byte choice = sc.nextByte();
            switch (choice) {
                case 1:
                    case1();
                    break;
                case 2:
                    case2();
                    break;
                case 3:
                    case3();
                    break;
                case 4:
                    case4();
                    break;
                case 5:
                    System.out.println("Chương trình kết thúc!");
                    System.exit(0);
                default:
                    System.out.println("Hãy nhập đúng mục chọn tương ứng!");
            }
        } while (true);
    }

    public static void case1() {
        boolean flag = true;
        while (flag) {
            System.out.println("\n⭐⭐⭐⭐⭐SIGNUP/SIGNIN⭐⭐⭐⭐⭐\n" +
                    "1. Đăng nhập\n" +
                    "2. Đăng ký\n" +
                    "3. Quay lại\n" +
                    "Lựa chọn : ");
            byte choice = sc.nextByte();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("Quay lại Menu trước!\n_____________________");
                    flag = false;
                    break;
                default:
                    System.out.println("Hãy nhập đúng mục chọn tương ứng!");
            }
        }
    }

    public static void case2() {
        boolean flag = true;
        while (flag) {
            System.out.println("\n\n⭐⭐⭐⭐⭐Catalogue⭐⭐⭐⭐⭐\n" +
                    "1. Hiển thị toàn bộ danh mục(Catalog)\n" +
                    "2. Tạo mới danh mục\n" +
                    "3. Tìm kiếm danh mục theo tên\n" +
                    "4. Chỉnh sửa danh mục\n" +
                    "5. Ẩn danh mục theo mã danh mục\n" +
                    "6. Ẩn nhiều danh mục trong danh sách\n" +
                    "7. Quay lại\n" +
                    "Lựa chọn: ");
            byte choice = sc.nextByte();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Quay lại Menu trươc!\n_____________________");
                    flag = false;
                    break;
                default:
                    System.out.println("Hãy nhập đúng mục chọn tương ứng!");
            }
        }
    }

    public static void case3() {
        boolean flag = true;
        while (flag) {
            System.out.println("\n\n⭐⭐⭐⭐⭐Cart-Checkout⭐⭐⭐⭐⭐\n" +
                    "1. Hiển thị danh sách sản phẩm trong giỏ hàng\n" +
                    "2. Thay đổi số lượng đặt hàng\n" +
                    "3. Xóa sản phẩm trong giỏ hàng\n" +
                    "4. Đặt hàng\n" +
                    "5. Quay lại\n" +
                    "Lựa chọn : ");
            byte choice = sc.nextByte();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Quay lại Menu trươc!\n_____________________");
                    flag = false;
                    break;
                default:
                    System.out.println("Hãy nhập đúng mục chọn tương ứng!");
            }
        }
    }

    public static void case4() {
        boolean flag = true;
        while (flag) {
            System.out.println("1. Nhập SP muốn tìm: " +
                    "\n2. Quay lại" +
                    "\nLựa chọn: ");
            byte choice = sc.nextByte();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    System.out.println("Quay lại Menu trươc!\n_____________________");
                    flag = false;
                    break;
                default:
                    System.out.println("Hãy nhập đúng mục chọn tương ứng!");
            }
        }
    }

    public static void login() {
        System.out.print("\u001B[36m ⭐⭐⭐⭐⭐LOGIN⭐⭐⭐⭐⭐\n" +
                "Tên đăng nhập: ");
        String username = InputMethods.getString().trim();
        System.out.print("Mật khẩu: ");
        String password = InputMethods.getString().trim();
        if (Objects.equals(username, "admin") && Objects.equals(password, "chau1")) {
            //admin
        } else {
            //Trang chủ
            Users userLogin = newUser.login(username, password);
            if (userLogin != null) {
                System.out.println("đăng nhập thành công");
                currentLogin = userLogin;
//                cartService = new CartService(orderService, currentLogin);
                System.out.println("CHào mừng " + userLogin.getFullName() + " đến với shop");

                // kiểm tra quyền

                // Menu cửa hàng
//                shop();
            } else {
                System.out.println("Sai tài khoản hoặc mật khẩu");
            }
        }
    }


    public static void register() {
        System.out.println("==================REGISTER======================");
        // nhập username
        System.out.println("Nhập username ");
        String userName = InputMethods.getString();
        System.out.println("Nhập password ");
        String password = InputMethods.getString();
        System.out.println("Nhập phone ");
        String phone = InputMethods.getString();
        System.out.println("Nhập fullname ");
        String fullName = InputMethods.getString();
        // tạo 1 đối tượng Customer
        Users newUser = new Users(UserService.getNewId(), userName, password, fullName, phone);
        UserService.save(newUser);
        System.out.println("Đăng kí thành công");
        login();
    }

}