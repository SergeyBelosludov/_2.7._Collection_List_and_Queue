package transport.driver;

import transport.driver.Driver;

public class DriverD extends Driver {
    public DriverD(String fullName,
                   boolean hasDriverLicense,
                   int experienceInYears,
                   String category) {
        super(fullName, hasDriverLicense, experienceInYears, category);
    }

    @Override
    public void startMov() {
        System.out.println("Водитель " + getFullName() + " с правами категории " + getCategory() + "Водитель категории D " + getFullName() + " начал движение");
    }

    @Override
    public void finishMov() {
        System.out.println("Водитель " + getFullName() + " с правами категории " + getCategory() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель " + getFullName() + " с правами категории " + getCategory() + " заправил авто");
    }
}