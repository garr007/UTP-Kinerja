package CAR;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {

        System.out.println("NAMA : MUHAMMAD TEGAR ABHIRAM");
        System.out.println("NIM : 215150700111009");
        
        CarRider ming = new CarRider("Lin Ming", 19, "080000000000");
        CarRider youhan = new CarRider("B ei Youhan",20,"0811111111111");
        CarRider ling = new CarRider("Ling'er",31,"08122222222222");
        CarRider wanwan = new CarRider("Wanwan Xi Fei", 65, "08665533332222");

        CarData data = new CarData();
        data.addCar("SUV","N 111 AB","Honda");
        data.addCar("SPORT","N 222 AB","SSC Tuatara");
        data.addCar("TRUCK","N 333 AB","Suzuki");
        data.addCar("LCGC","N 444 AB","Yamaha");

        data.listOfCar();

        System.out.println();
        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9); 
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ling, data.carList.get(1), 1);
        arsip.Rent(wanwan, data.carList.get(2), 5);
        

        System.out.println();
        arsip.info();
    }
    
}
