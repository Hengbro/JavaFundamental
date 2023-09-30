package com.juaracoding.exam_crud;
import java.util.List;
import java.util.Scanner;
public class MainExam {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu CRUD : ");
            System.out.println("1. Tambah Data ");
            System.out.println("2. Tampilkan Data ");
            System.out.println("3. Update Data ");
            System.out.println("4. Hapus Data ");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama produk     : ");
                    String nameProduct = scanner.next();
                    System.out.print("Masukkan harga produk    : ");
                    int price = scanner.nextInt();
                    System.out.print("Masukkan kategori produk : ");
                    String category = scanner.next();
                    userManager.addUser(nameProduct, price, category);
                    System.out.println("Data produk telah ditambahkan.");
                    break;
                case 2:
                    List<UserAplication> users = userManager.getAllUsers();
                    for (UserAplication user : users) {
                        System.out.println(user);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan ID produk yang ingin diupdate: ");
                    int idToUpdate = scanner.nextInt();
                    System.out.print("Masukkan nama produk baru     : ");
                    String newNameProduct = scanner.next();
                    System.out.print("Masukkan harga baru produk    : ");
                    int newPrice = scanner.nextInt();
                    System.out.print("Masukkan kategori baru produk : ");
                    String newCategory = scanner.next();
                    userManager.updateUser(idToUpdate, newNameProduct, newPrice, newCategory );
                    System.out.println("Data produk telah diupdate.");
                    break;
                case 4:
                    System.out.print("Masukkan ID produk yang ingin dihapus: ");
                    int idToDelete = scanner.nextInt();
                    userManager.deleteUser(idToDelete);
                    System.out.println("Data produk telah dihapus.");
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Menu pilihan tidak valid. Silakan input kembali.");
            }
        }
    }
}
