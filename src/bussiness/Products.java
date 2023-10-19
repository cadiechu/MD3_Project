package bussiness;

import utils.InputMethods;

import java.time.LocalDate;
import java.util.List;

public class Products {
    private Long productId;
    private String productName;
    private Long categoryId;
    private String description;
    private double unitPrice;
    private int stock;
    private LocalDate created_at;
    private LocalDate update_at;
    private Catalogs catalogId;
    private boolean status;


    public void inputData() {
        System.out.println("Nhập tên Sản phẩm: ");
        this.productName = InputMethods.getString();
        System.out.println("Nhập Mô tả: ");
        this.description = InputMethods.getString();
        System.out.println("Nhập giá SP: ");
        this.unitPrice = InputMethods.getDouble();
        System.out.println("Stock: ");
        this.stock = InputMethods.getInteger();
    }

    public void displayData() {
        System.out.println("\u001B[36m ⭐⭐⭐⭐⭐Products⭐⭐⭐⭐⭐\n" +
                "SP: " + productName + " | ID: " + productId +
                "\nPhân loại: " + catalogId.getCatalogName() +
                "\nMô tả: " + description +
                "\nGía SP: " + unitPrice + " | Kho: " + stock +
                "\nThời gian được tạo: " +
                "\nLần cập nhật gần nhất: " +
                "\nTrạng thái: " + (status ? "Đang bán" : "Không có sẳn!"));

    }
}
