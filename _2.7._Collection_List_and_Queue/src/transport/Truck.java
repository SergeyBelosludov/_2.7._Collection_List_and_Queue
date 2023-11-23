package transport;

import transport.driver.DriverС;

public class Truck extends Transport<DriverС> {
    private LoadCapacityOfTruck loadCapacityOfTruck;

    public LoadCapacityOfTruck getLoadCapacityOfTruck() {
        return loadCapacityOfTruck;
    }

    public void setLoadCapacityOfTruck(LoadCapacityOfTruck loadCapacityOfTruck) {
        this.loadCapacityOfTruck = loadCapacityOfTruck;
    }

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverС driver,
                 LoadCapacityOfTruck loadCapacityOfTruck) {
        super(brand, model, engineVolume, driver);
        this.loadCapacityOfTruck = loadCapacityOfTruck;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение (марки " + getBrand() +
                " модели " + getModel() +
                " с объемом двигателя " + getEngineVolume() + ")");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик закончил движение (марки " + getBrand() +
                " модели " + getModel() +
                " с объемом двигателя " + getEngineVolume() + ")");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");
    }

    @Override
    public void bestLapTime() {
        int minTime = 8;
        int maxTime = 50;
        int bestLapTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга у грузовика = " + bestLapTime + " мин");
    }

    @Override
    public void maxSpeed() {
        int minSp = 40;
        int maxSp = 130;
        int maxSpeed = (int) (minSp + (maxSp - minSp) * Math.random());
        System.out.println("Максимальная скорость для грузовика = " + maxSpeed + " км/ч");
    }

    @Override
    public void printType() {
        if (loadCapacityOfTruck == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Грузоподъемность авто: " + loadCapacityOfTruck);
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.75;
    }
}