package bussiness;

import utils.InputMethods;

public class Catalogs {

    private long catalogId;
    private String catalogName;
    private String description;
    private boolean status;

    public Catalogs() {
    }

    public Catalogs(long catalogId, String catalogName, String description, boolean status) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.description = description;
        this.status = status;
    }

    public long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(long catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData() {
        System.out.println("Nhập vào danh mục muốn thêm : ");
        this.catalogName = InputMethods.getString();
        System.out.println("Nhập vào mô tả: ");
        this.description = InputMethods.getString();
        System.out.println("Nhập vào trạng thái : Đang bán - true ; Không có sẳn - Nhập phím bất kỳ ");
        this.status = InputMethods.getBoolean();
    }

    public void displayData() {
        System.out.println("\u001B[36m ⭐⭐⭐⭐⭐Catalogue⭐⭐⭐⭐⭐\n" +
                "ID:" + catalogId + " | Tên danh mục:" + catalogName +
                "Mô tả: " + description +
                "\n Trạng thái: " + (status ? "Đang bán" : "Không có sẳn!" + "\n"));
    }

}
