package Merchant;

import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Merchant> merchants = new ArrayList<Merchant>();
        merchants.add(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        merchants.add(new Merchant("Nasgor Mlebes", "Nasi Goreng Jawa", 9000));
        merchants.add(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        merchants.add(new Merchant(scan.nextLine(), scan.nextLine(), scan.nextDouble()));
        scan.nextLine();
        DataMerchant.tampilData(merchants);

        System.out.print("\nData Merchant Yang Ingin Anda Cari : ");
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant(merchants, scan.nextLine()));

        System.out.print("\nData Merchant Yang Ingin Anda Update : ");
        DataMerchant.updateMerchant(merchants, DataMerchant.cariMerchant(merchants, scan.nextLine()));
        DataMerchant.tampilData(merchants);
    }

}