package transport;

import transport.driver.DriverD;

public class Bus extends Transport<DriverD> {
    private BusCapacityByNumberOfSeats busCapacityByNumberOfSeats;

    public BusCapacityByNumberOfSeats getBusCapacityByNumberOfSeats() {
        return busCapacityByNumberOfSeats;
    }

    public void setBusCapacityByNumberOfSeats(BusCapacityByNumberOfSeats busCapacityByNumberOfSeats) {
        this.busCapacityByNumberOfSeats = busCapacityByNumberOfSeats;
    }

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver,
               BusCapacityByNumberOfSeats busCapacityByNumberOfSeats) {
        super(brand, model, engineVolume, driver);
        this.busCapacityByNumberOfSeats = busCapacityByNumberOfSeats;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение (марки " + getBrand() +
                " модели " + getModel() +
                " с объемом двигателя " + getEngineVolume() + ")");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус закончил движение (марки " + getBrand() +
                " модели " + getModel() +
                " с объемом двигателя " + getEngineVolume() + ")");
    }

    @Override
    public void printType() {
        if (busCapacityByNumberOfSeats == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость авто: " + busCapacityByNumberOfSeats);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void bestLapTime() {
        int minTime = 5;
        int maxTime = 40;
        int bestLapTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга у автобуса = " + bestLapTime + " мин");
    }

    @Override
    public void maxSpeed() {
        int minSp = 40;
        int maxSp = 130;
        int maxSpeed = (int) (minSp + (maxSp - minSp) * Math.random());
        System.out.println("Максимальная скорость для автобуса = " + maxSpeed + " км/ч");
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " диагностику не проходит.");
        return true;
    }
}