package controller;

import bussiness.Users;
import service.UserService;

import java.util.List;

public class UserController {
    public UserService userService = new UserService();

    public List<Users> findAll() {
        return userService.findAll();
    }

    public void save(Users user) {
        userService.save(user);
    }

    //
//    public void delete(Integer id) {
//        userService.delete(id);
//    }
//
//
    public Users findById(long id) {
        return userService.findById(id);
    }

    public Users findUserByName(String userName) {
        return userService.findUserByName(userName);
    }

//    public void changeStatus(int idUser) {
//        userService.changeStatus(idUser);
//    }

    public Users login(String username, String password) {
        return userService.login(username, password);
    }

    public long getNewId() {
        return (int) userService.getNewId();
    }
}
