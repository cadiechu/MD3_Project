package service;

import bussiness.Users;
import utils.InputMethods;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class UserService implements IUserService {
    static List<Users> listUsers;

    public UserService() {
    }

    @Override
    public List<Users> findAll() {
        return listUsers;
    }

    public static Users findById(Long id) {
        for (Users u : listUsers) {
            if (u.getUserId() == id) {
                return u;
            }
        }
        return null;
    }


    public static boolean save(Users users) {
        if (findById(users.getUserId()) != null) {
            //check đã tồn tại chưa, có rồi thì sữa
            listUsers.set(listUsers.indexOf(findById(users.getUserId())), users);

        } else {
            // chưa có thì add
            listUsers.add(users);
        }
        return true;
    }

    @Override
    public void delete(Long id) {
        listUsers.remove(findById(id));

    }

    //ID tự tăng
    public static long getNewId() {
        Long maxId = (long) 0L;
        for (Users users : listUsers) {
            if (users.getUserId() > maxId) {
                maxId = users.getUserId();
            }
        }
        return maxId + 1;
    }

    @Override
    public Users login(String username, String password) {
        for (Users u : listUsers) {
            if (u.getUserName().equals(username) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    @Override
    public Users findUserByName(String name) {
        System.out.println("Nhập tên: ");
        String inputUserName = InputMethods.getString().trim();
        if (listUsers.isEmpty()) {
            System.out.println("Không có người dùng " + inputUserName);
            return null;
        }
        System.out.println("Tìm người dùng : " + inputUserName);
        for (Users users : listUsers) {
            System.out.println("\u001B[35m 🌛🌛🌛🌛🌛 User Information 🌜🌜🌜🌜🌜" +
                    "ID:" + users.getUserId() + " | Username:" + users.getUserName() + " | Họ Tên:" + users.getFullName() +
                    "\nEmail:" + users.getEmail() + " | Vai trò:" + (users.isRole() ? "Admin" : "Members") + " | Trạng thái:" + (users.isStatus() ? "Hoạt động" : "Khoá!") +
                    "\nThời gian được tạo: " + users.getCreatedAt().format(DateTimeFormatter.ISO_DATE_TIME) +
                    "\nLần cập nhật gần nhất:");


        }
        return null;
    }

}
