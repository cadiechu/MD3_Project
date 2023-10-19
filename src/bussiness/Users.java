package bussiness;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Users {
    private Long userId;
    private String userName;
    private String email;
    private String fullName;
    private String password;
    private boolean role;
    private boolean status;
    private LocalDate createdAt;
    private LocalDate updateAt;
//    private List<CartItem> cart = new ArrayList<>();

    public Users() {
    }

    public Users(Long userId, String userName, String email, String fullName, String password, boolean role, boolean status, LocalDate createdAt, LocalDate updateAt) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.fullName = fullName;
        this.password = password;
        this.role = role;
        this.status = status;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Users(long newId, String userName, String password, String fullName, String phone) {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }

    public void displayData() {
        System.out.println("\u001B[36m ⭐⭐⭐⭐⭐Users⭐⭐⭐⭐⭐\n" +
                "UserID :" + userId + " | Username: " + userName + " | Vai trò: " + (role ? "Admin" : "Members") +
                "\nFullname: " + fullName +
                "\nEmail: " + email +
                "\nVai trò:" + (status ? "Admin" : "Members") +
                "\nTrạng thái : " + (status ? "Đang kích hoặc" : "Bị khoá!") +
                "\nThời gian được tạo:" +
                "\nLần cập nhật gần nhất: " +
                "\nGiỏ hàng: ");
    }
}
