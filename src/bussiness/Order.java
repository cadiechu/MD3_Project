package bussiness;

import utils.InputMethods;

public class Order {
    private Long orderId;
    private Users userId;
    private Users name;
    private String phoneNumber;
    private String address;
    private double total;

    private enum orderStatus {
        WAITING,
        CONFIRM,
        DELIVERY,
        SUCCESS,
        CANCEL
    }

    ;
//    private List<OrderDetail> orderDetail ;

    public Order() {
    }

    public Order(Long orderId, Users userId, Users name, String phoneNumber, String address, double total) {
        this.orderId = orderId;
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.total = total;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public Users getName() {
        return name;
    }

    public void setName(Users name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void inputData() {
        System.out.println("Nhập vào SĐT: ");
        this.phoneNumber = InputMethods.getString();
        System.out.println("Nhập địa chỉ: ");
        this.address = InputMethods.getString();
    }

    public void displayData() {
        System.out.println("\u001B[36m ⭐⭐⭐⭐⭐Order⭐⭐⭐⭐⭐\n" +
                "Order ID: " + orderId +
                "\nUser ID: " + userId + " | Tên người nhận: " + getUserId().getFullName() +
                "\nSĐT: " + phoneNumber +
                "\nĐịa chỉ: " + address +
                "\nTổng tiền: " + total +
                "\nTrạng thái đơn hàng: " + (orderStatus.DELIVERY));
    }
}
