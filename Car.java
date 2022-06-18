package CAR;
public class Car {
    private String carType;
    private String polNum;
    private String merk;
    private boolean status = true;

    
    public Car(String carType, String polNum, String merk) {
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        
    }


    public String getCarType() {
        return carType;
    }


    public void setCarType(String carType) {
        this.carType = carType;
    }


    public String getPolNum() {
        return polNum;
    }


    public void setPolNum(String polNum) {
        this.polNum = polNum;
    }


    public String getMerk() {
        return merk;
    }


    public void setMerk(String merk) {
        this.merk = merk;
    }


    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }
}
