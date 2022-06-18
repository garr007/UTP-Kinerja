package Inheritance;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    private int totalPekerja;
    
    public Pekerja(String nama, String nIK, boolean jenisKelamin, boolean menikah,
            int jamKerja, int hariKerja, String nIP) {
        super(nama, nIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        NIP = nIP;
        totalPekerja = totalPekerja + 1;

    }

    public int getTotalPekerja() {
        return totalPekerja;
    }

    public void setTotalPekerja(int totalPekerja) {
        this.totalPekerja = totalPekerja;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String nIP) {
        NIP = nIP;
    }

    
    
    public String getStatus(){
        String a = getNIP();
        
        char digit_1 = a.charAt(0);
        
        String kantorCabang;
        if (digit_1 == '1'){
            kantorCabang = "Mondstadt";
        }else if (digit_1 == '2'){
            kantorCabang = "Liyue";
        }else if (digit_1 == '3'){
            kantorCabang = "Inazuma";
        }else if (digit_1 == '4'){
            kantorCabang = "Sumeru";
        }else if (digit_1 == '5'){
            kantorCabang = "Fontaine";
        }else if (digit_1 == '6'){
            kantorCabang = "Natlan";
        }else if (digit_1 == '7'){
            kantorCabang = "Snezhnaya";
        }else {
            kantorCabang = " ";
        }
        
        char digit_3 = a.charAt(2);
        char noCabang = digit_3;
        
        char digit_7 = a.charAt(6);
        
        String departemen;
        if (digit_7 == '1'){
            departemen = "Pemasaran";
        }else if (digit_7 == '2'){
            departemen = "Humas";
        }else if (digit_7 == '3'){
            departemen = "Riset";
        }else if (digit_7 == '4'){
            departemen = "Teknologi";
        }else if (digit_7 == '5'){
            departemen = "Personalia";
        }else if (digit_7 == '6'){
            departemen = "Akademik";
        }else if (digit_7 == '7'){
            departemen = "Administrasi";
        }else if (digit_7 == '8'){
            departemen = "Operasional";
        }else if (digit_7 == '9'){
            departemen = "Pembangunan";
        }else {
            departemen = " ";
        }
        
        return departemen + "," + kantorCabang + " " + "cabang ke-" + noCabang;
        
    }
    public double hitungGajiNormal(){
        double gajiNormal;

        return gajiNormal = getHariKerja() * getJamKerja() * 15;
    }

    public double hitungBonus(){
        double bonus;
        double hariLibur = 0;
        
        for (int i = 1; i <= getHariKerja(); i++) {

            // System.out.println(i);
            // if ((i % 7 == 0)){
            //     hariLibur = hariLibur + 1;
            // }

            
            if (i % 7 == 0){
                hariLibur = hariLibur + 2;
            }

            // if (i + 7 == 6 || i + 7 == 13 || i + 7 == 20 || i + 7 == 27){
                //     hariLibur = hariLibur + 1;
                // }
                // System.out.println(hariLibur);
            }
            
            // if (getHariKerja() == 6 || getHariKerja() == 13 || getHariKerja() == 20 || getHariKerja() == 27){
            //     hariLibur = hariLibur + 1;
            // }
            // System.out.println(hariLibur);
            
        // hariLibur = Math.ceil(getHariKerja() / 5);
        // hariLibur = 5;

        double bonusLembur = (getHariKerja() - hariLibur) * (getJamKerja() - 7) * 7;

        double bonusLibur = hariLibur * getJamKerja() * 20;

        return bonus = bonusLembur + bonusLibur;

    }
    
    public double getPendapatan(){
        return super.getPendapatan() + hitungGajiNormal() + hitungBonus();
    }

    public String toString(){
        super.toString();
        System.out.println("Bonus\t\t:" + hitungBonus() + "$");
        System.out.println("Gaji\t\t:" + hitungGajiNormal() + "$");
        System.out.println("Status\t\t:" + getStatus());


        return " ";
    }
    
}
