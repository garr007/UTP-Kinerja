package CAR;

public class CarRent {
    private CarRider rider;
    private Car car;
    private int RentDur;

    
    public CarRent(CarRider rider, Car car, int rentDur) {
        this.rider = rider;
        this.car = car;
        RentDur = rentDur;
    }


    public CarRider getRider() {
        return rider;
    }


    public void setRider(CarRider rider) {
        this.rider = rider;
    }


    public Car getCar() {
        return car;
    }


    public void setCar(Car car) {
        this.car = car;
    }


    public int getRentDur() {
        return RentDur;
    }


    public void setRentDur(int rentDur) {
        RentDur = rentDur;
    }
}
