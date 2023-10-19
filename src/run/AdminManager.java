package run;

import bussiness.Users;
import controller.UserController;
import service.IUserService;
import service.UserService;
import utils.InputMethods;

public class AdminManager {
    private static final IUserService userService = new UserService();
    public static Users currentLogin;

    public static void main(String[] args) {

        do {
            System.out.println("\u001B[35m 🌛🌛🌛🌛🌛 ADMIN 🌜🌜🌜🌜🌜" +
                    "\n1. Quản lý Người dùng (Users)" +
                    "\n2. Quản lý Danh mục (Catalogue)" +
                    "\n3. Quản lý Sản phẩm (Products)" +
                    "\n4. Quản lý Hoá đơn (CheckOut)" +
                    "\n5. Đăng xuất" +
                    "\n6 .Thoát" +
                    "\nLựa chọn: ");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    currentLogin.displayData();
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
                    System.out.println("Chương trình kết thúc!");
                    System.exit(0);
                default:
                    System.out.println("Hãy nhập đúng mục chọn tương ứng!");
            }
        } while (true);
    }
}
