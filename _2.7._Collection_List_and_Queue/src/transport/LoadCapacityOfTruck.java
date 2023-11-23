package transport;

public enum LoadCapacityOfTruck {
    N1(0F, 3.5F),
    N2(3.5F, 12F),
    N3(12F, null);

    private final Float from;

    private final Float to;

    LoadCapacityOfTruck(Float from, Float to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
//        if (from == null) {
//            return "Грузоподъемность: до " + to + " тонн";
//        } else
        if (to == null) {
            return "Грузоподъемность: от " + from + " тонн";
        } else {
            return "Грузоподъемность: от " + from + " тонн до " + to + " тонн";
        }
    }

    public Float getFrom() {
        return from;
    }

    public Float getTo() {
        return to;
    }

//    public void setFrom(Float from) {
//        this.from = from;
//    }
//    public void setTo(Float to) {
//        this.to = to;
//    }
}