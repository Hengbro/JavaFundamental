package com.juaracoding.exam_crud;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private final List<UserAplication> users = new ArrayList<>();
    private int nextId = 1;

    public void addUser(String nameProduct, int price, String category) {
        UserAplication user = new UserAplication(nextId++, nameProduct, price, category);
        users.add(user);
    }

    public UserAplication getUserById(int id) {
        for (UserAplication user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public void updateUser(int id, String newNameProduct, int newPrice, String newCategory) {
        for (UserAplication user : users) {
            if (user.getId() == id) {
                user.setNameProduct(newNameProduct);
                user.setPrice(newPrice);
                user.setCategory(newCategory);
                break;
            }
        }
    }

    public void deleteUser(int id) {
        UserAplication userToRemove = null;
        for (UserAplication user : users) {
            if (user.getId() == id) {
                userToRemove = user;
                break;
            }
        }
        if (userToRemove != null) {
            users.remove(userToRemove);
        }
    }

    public List<UserAplication> getAllUsers() {
        return users;
    }
}
