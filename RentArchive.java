package CAR;
import java.util.*;

public class RentArchive {
    ArrayList <CarRent> rentData; 
    
    public RentArchive() {
        rentData = new ArrayList<CarRent>();
    }

    public void Rent(CarRider rider,Car car,int rentDur){
        if (car.isStatus() == true){
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        }else {
            System.out.println("Maaf, MOBIL SUDAH DISEWA");
        }
    }

    public void info(){
        System.out.println("-----------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("-----------------------------");

        for (CarRent i : rentData){
            System.out.println("NAMA PEMINJAM : " + i.getRider().getNama());
            System.out.println("TIPE MOBIL    : " + i.getCar().getCarType());
            System.out.println("NO. POLISI    : " + i.getCar().getPolNum());
            System.out.println("LAMA RENTAL   : " + i.getRentDur());
            System.out.println("-----------------------------");

        }
    }
}

