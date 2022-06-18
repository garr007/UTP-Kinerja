package Inheritance;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("NAMA : MUHAMMAD TEGAR ABHIRAM");
        System.out.println("NIM  : 215150700111009\n");

        Scanner scan = new Scanner(System.in);
        Manusia man_1 = new Manusia("aku", "435343342", true, true);
        Manusia man_2 = new Manusia("kamu", "45673451", true, false);
        Manusia man_3 = new Manusia("dia", "233534645", true, false);

        MahasiswaFilkom mhs_1 = new MahasiswaFilkom("Chika", "21412412", false, false, "205150601111018", 3.7);
        MahasiswaFilkom mhs_2 = new MahasiswaFilkom("Yola", "20412413", false, true, "215150201111019", 3.9);
        MahasiswaFilkom mhs_3 = new MahasiswaFilkom("Alif", "19412414", true, false, "195150301111020", 3.52);
        MahasiswaFilkom mhs_4 = new MahasiswaFilkom("Atthar", "35345345", true, true, "185150301111023", 4.00);

        Pekerja pekerja_1 = new Pekerja("Iqbal Biondy", "351717969", true, true, 7, 22, "395102439281");
        Pekerja pekerja_2 = new Pekerja("Hamzah", "751717965", true, false, 9, 25, "591102739283");
        Pekerja pekerja_3 = new Pekerja("Susi", "551717962", false, true, 5 , 19, "793102839285");
        Pekerja pekerja_4 = new Pekerja("Leka", "453453434", false ,false, 10, 23, "497102539285");
        Pekerja pekerja_5 = new Pekerja("Soeharto", "353464577", true, true, 5, 21, "194102639285");

        Manajer manajer_1 = new Manajer("Lyra Hertin", "351707384392", false, false, 8, 20, "104837283729", 1500);
        Manajer manajer_2 = new Manajer("Jennifer Lawrence", "351707384397", false, true, 10, 23, "407837183728", 1300);
        Manajer manajer_3 = new Manajer("Megawati Soekarno P.", "351707384390", false, false, 6, 25, "609837983721", 2000);

        ArrayList<Manusia> listManusia = new ArrayList<Manusia>();
        ArrayList<Pekerja> listPekerja = new ArrayList<Pekerja>();
        ArrayList<Manajer> listManajer = new ArrayList<Manajer>();
        ArrayList<MahasiswaFilkom> listMahasiswaFilkom = new ArrayList<MahasiswaFilkom>();

        listManusia.add(man_1);
        listManusia.add(man_2);
        listManusia.add(man_3);

        listPekerja.add(pekerja_1);
        listPekerja.add(pekerja_2);
        listPekerja.add(pekerja_3);
        listPekerja.add(pekerja_4);
        listPekerja.add(pekerja_5);

        listManajer.add(manajer_1);
        listManajer.add(manajer_2);
        listManajer.add(manajer_3);

        listMahasiswaFilkom.add(mhs_1);
        listMahasiswaFilkom.add(mhs_2);
        listMahasiswaFilkom.add(mhs_3);
        listMahasiswaFilkom.add(mhs_4);

        System.out.println("--> Data Manusia\n");
        listManusia.toString();
        System.out.println("=================================================\n");
        System.out.println("--> Data Pekerja\n");
        listPekerja.toString();
        System.out.println("=================================================\n");
        System.out.println("--> Data Manajer\n");
        listManajer.toString();
        System.out.println("=================================================\n");
        System.out.println("--> Data Mahasiswa Filkom\n");
        listMahasiswaFilkom.toString();
        System.out.println("=================================================");

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Total Manusia          : " + listManusia.size());
        System.out.println("Total Pekerja          : " + listPekerja.size());
        System.out.println("Total Manajer          : " + listManajer.size());
        System.out.println("Total Mahasiswa Filkom : " + listMahasiswaFilkom.size());
        System.out.println("---------------------------");

        
    }
}
