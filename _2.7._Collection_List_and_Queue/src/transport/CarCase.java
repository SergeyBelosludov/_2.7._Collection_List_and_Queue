package transport;

public enum CarCase {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    STATIONWAGON("Универсал"),
    OFFROAD("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String carCase;

    @Override
    public String toString() {
        return "Тип кузова: " + carCase + ".";
    }

    public String getCarCase() {
        return carCase;
    }

    //    public void setCarCase(String carCase) {
//        this.carCase = carCase;
//    }
    CarCase(String carCase) {
        this.carCase = carCase;
    }
}