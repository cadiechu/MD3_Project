package service;

import java.util.List;

public interface IGeneric<T, E> {
    List<T> findAll();
//
//    static T findById(E id) {
//        return null;
//    }
//
//    static boolean save(T t);

    void delete(E id);
}
