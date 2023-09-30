package com.juaracoding.exam_crud;

public class UserAplication {
    private int id;
    private String nameProduct;
    private int price;
    private String category;

    public UserAplication(int id, String nameProduct, int price, String category) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    @Override
    public String toString() {
        return "User [id = " + id + ", Nama produk = " + nameProduct + ", Harga produk = " + price + ", Kategori produk = "+ category + "]";
    }
}
