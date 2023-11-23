import transport.*;
import transport.driver.DriverB;
import transport.driver.DriverD;
import transport.driver.DriverС;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("№" + i,
                    true,
                    5 + i,
                    "B");
            Car car = new Car(
                    "Автомобиль " + i,
                    "№" + i,
                    1.8,
                    driverB, CarCase.SEDAN);

            DriverD driverD = new DriverD("№" + i,
                    true,
                    7 + i,
                    "D");
            Bus bus = new Bus(
                    "Автобус марка " + i,
                    "№" + i,
                    3.0,
                    driverD, BusCapacityByNumberOfSeats.MEDIUM);

            DriverС driverC = new DriverС("№" + i,
                    true,
                    5 + i,
                    "C");
            Truck truck = new Truck(
                    "Грузовик марка " + i,
                    "№" + i,
                    4.0,
                    driverC, LoadCapacityOfTruck.N1);
            printInfo(car);
            printInfo(bus);
            printInfo(truck);
        }
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println(
                "Водитель " + transport.getDriver().getFullName() +
                        ", с категорией прав " + transport.getDriver().getCategory() +
                        ", управляет автомобилем " + transport.getModel() +
                        ", будет участвовать в заезде."
        );
        transport.printType();
    }
}
