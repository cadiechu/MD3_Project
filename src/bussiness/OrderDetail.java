package bussiness;

import utils.InputMethods;

public class OrderDetail {
    private Products productId;
    private Order orderId;
    private Products productName;
    private Products unitPrice;
    private int quantity;

    public OrderDetail() {
    }

    public OrderDetail(Products productId, Order orderId, Products productName, Products unitPrice, int quantity) {
        this.productId = productId;
        this.orderId = orderId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Products getProductId() {
        return productId;
    }

    public void setProductId(Products productId) {
        this.productId = productId;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public Products getProductName() {
        return productName;
    }

    public void setProductName(Products productName) {
        this.productName = productName;
    }

    public Products getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Products unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void inputData() {
        System.out.println("Nhập số lượng mua:");
        this.quantity = InputMethods.getInteger();
    }

    public void displayData() {
        System.out.println("\nu001B[36m ⭐⭐⭐⭐⭐CheckOut⭐⭐⭐⭐⭐\n" +
                "ID Sản phẩm:" + productId +
                "\nID Đơn hàng:" + orderId +
                "\nTên SP:" + productName +
                "\nĐơn giá:" + unitPrice +
                "\nSố Lượng:" + quantity +
                "\nThành tiền: " + getOrderId().getTotal());

    }
}
