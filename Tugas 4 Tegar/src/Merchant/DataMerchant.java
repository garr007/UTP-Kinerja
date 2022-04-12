package Merchant;

import java.util.*;

public class DataMerchant {
    public static Scanner scan = new Scanner(System.in);

    public static void tampilMerchant(Merchant cariMerchant) {
        System.out.println("===Tampilan Data Merchant UBFood===");
        System.out.println("Nama Merchant\t: " + cariMerchant.getMerchantName());
        System.out.println("Nama Produk\t: " + cariMerchant.getProductName());
        System.out.println("Harga\t\t: " + (int) cariMerchant.getFoodPrice());
    }

    public static Merchant cariMerchant(List<Merchant> list, String nama) {
        for (Merchant a : list) {
            if (a.getMerchantName().equalsIgnoreCase(nama)) {
                return a;
            }
        }
        return null;
    }

    public static void tampilData(List<Merchant> list) {

        for (Merchant i : list) {
            System.out.println("===Tampilan Data Merchant UBFood===");
            System.out.println("Nama Merchant\t: " + i.getMerchantName());
            System.out.println("Nama Produk\t: " + i.getProductName());
            System.out.println("Harga\t\t: " + (int) i.getFoodPrice());

        }

    }

    public static void updateMerchant(List<Merchant> list, Merchant updateMerchant) {
        System.out.print("Nama Merchant Baru : ");
        updateMerchant.setMerchantName(scan.nextLine());
        System.out.print("Nama Product Baru  : ");
        updateMerchant.setProductName(scan.nextLine());
        System.out.print("Harga Baru\t  : ");
        updateMerchant.setFoodPrice(scan.nextDouble());
    }
}