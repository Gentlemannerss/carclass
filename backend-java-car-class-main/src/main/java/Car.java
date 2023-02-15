public class Car {
    public String carBrand;
    public String carType;
    public int carBuildYear;
    public String carColor;
    public double carMotor;

    public Car(String carBrand, String carType, int carBuildYear, String carColor, double carMotor) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.carBuildYear = carBuildYear;
        this.carColor = carColor;
        this.carMotor = carMotor;
    }

    public void classCarToString() {
        System.out.println("Deze " + carBrand + " " + carType + " heeft de kleur " + carColor + " en komt uit " + carBuildYear + " met een motorinhoud van " + carMotor);
    }

    public void stringSystemWant(){
        System.out.println("Deze " + carBrand + " " + carType + " is " + carColor);
    }
}