package transport.driver;

import transport.driver.Driver;

public class DriverB extends Driver {
    public DriverB(String fullName,
                   boolean hasDriverLicense,
                   int experienceInYears,
                   String category) {
        super(fullName, hasDriverLicense, experienceInYears, category);
    }

    @Override
    public void startMov() {
        System.out.println("Водитель " + getFullName() + " с правами категории " + getCategory() + " начал движение");
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