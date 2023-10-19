package service;


import bussiness.Users;

public interface IUserService extends IGeneric<Users, Long> {
    static long getNewId() {
        return 0;
    }

    Users login(String username, String password);
    Users findUserByName(String name);
}
