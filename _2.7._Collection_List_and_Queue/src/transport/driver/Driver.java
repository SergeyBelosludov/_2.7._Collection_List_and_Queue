package transport.driver;

public abstract class Driver {
    private String fullName;
    private boolean hasDriverLicense;
    private int experienceInYears;
    private String category;

    public Driver(String fullName,
                  boolean hasDriverLicense,
                  int experienceInYears,
                  String category) {
        this.fullName = fullName;
        this.hasDriverLicense = hasDriverLicense;
        this.experienceInYears = experienceInYears;
        setCategory(category);
    }

    public abstract void startMov();

    public abstract void finishMov();

    public abstract void refuelCar();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        try {
            if (category.equals("B") || category.equals("D") || category.equals("C") || category.equals("В") || category.equals("С")) {
                this.category = category;
            } else {
                throw new IllegalArgumentException("Необходимо указать или исправить тип прав у водителя " + getFullName() + "!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(" !!! Ошибка !!! : " + e.getMessage());
        }
    }
}