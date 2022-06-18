package Inheritance;

public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;
    private int totalMahasiswaFilkom;
    
    public MahasiswaFilkom(String nama, String nIK, boolean jenisKelamin, boolean menikah, String nIM, double iPK) {
        super(nama, nIK, jenisKelamin, menikah);
        NIM = nIM;
        IPK = iPK;
        totalMahasiswaFilkom = totalMahasiswaFilkom + 1;
    }
    
    
    public int getTotalMahasiswaFilkom() {
        return totalMahasiswaFilkom;
    }


    public void setTotalMahasiswaFilkom(int totalMahasiswaFilkom) {
        this.totalMahasiswaFilkom = totalMahasiswaFilkom;
    }


    public String getNIM() {
        return NIM;
    }
    
    public void setNIM(String nIM) {
        NIM = nIM;
    }
    
    public double getIPK() {
        return IPK;
    }
    
    public void setIPK(double iPK) {
        IPK = iPK;
    }

    public double getBeasiswa(){
        double beasiswa;
        if (getIPK() > 3.0 && getIPK() <= 3.5){
            beasiswa = 50;
        }else if (getIPK() > 3.5 && getIPK() <= 4){
            beasiswa = 75;
        } else {
            beasiswa = 0;
        }

        return beasiswa;
    }

    public String getStatus(){
        String a = getNIM();
        String b = a.substring(0,  2);
        String angkatan;

        if (b.equalsIgnoreCase("18")){
            angkatan = "2018";
        }else if (b.equalsIgnoreCase("19")){
            angkatan = "2019";
        } else if (b.equalsIgnoreCase("20")){
            angkatan = "2020";
        }else if (b.equalsIgnoreCase("21")){
            angkatan = "2021";
        }else {
            angkatan = "0000";
        }

        char indeks;
        indeks = a.charAt(6);
        String prodi;

        if (indeks == '2'){
            prodi = "Teknik Meniup Gelembung";
        } else if (indeks == '3'){
            prodi = "Teknik Berburu Ubur-Ubur";
        } else if (indeks == '4'){
            prodi = "Sistem Penghaburgeran";
        }else if (indeks == '6'){
            prodi = "Pendidikan Chum Bucket";
        }else if (indeks == '7'){
            prodi = "Teknologi Telepon Kerang";
        }else {
            prodi = "tes";
        }

        
        return prodi + "," + angkatan;
    }

    public double getPendapatan(){
        return super.getPendapatan() + getBeasiswa();
    }

    public String toString(){
        super.toString();
        System.out.println("IPK\t\t:" + getIPK());
        System.out.println("NIM\t\t:" + getNIM());
        System.out.println("Status\t\t:" + getStatus());
        
        
        return "";
    }

    
}
