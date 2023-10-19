import bussiness.Users;
import service.*;

import java.time.format.DateTimeFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Users loginAccount;
    public static final IUserService userService = new UserService();
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
    public static DateTimeFormatter formatMonth = DateTimeFormatter.ofPattern("MM");
    public static final IUserService userService1 = new UserService();
    public static final ICatalogService catalogService = new CatalogService();
    public static final ICartService carService = new CartService();
    public static ICartService cartService;

    public static void main(String[] args) {

    }
}