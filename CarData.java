package CAR;
import java.util.*;

public class CarData {
    ArrayList <Car> carList;

    public CarData() {
        carList = new ArrayList<Car>();
    }

    public void addCar(String carType,String polNum,String merk){
        Car car = new Car(carType, polNum, merk);
        carList.add(car);
    }

    public void listOfCar(){
        System.out.println("-----------------------------");
        System.out.println("DAFTAR MOBIL");
        System.out.println("-----------------------------");
        for (Car i : carList){
            System.out.println("TIPE MOBIL : " + i.getCarType());
            System.out.println("NO. POLISI : " + i.getPolNum());
            System.out.println("MERK MOBIL : " + i.getMerk());
            System.out.println("-----------------------------");

        }
    }
}

