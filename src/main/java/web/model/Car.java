package web.model;

public class Car {
    private String model;
    private int year;
    private String owner;

    public Car(String model, int year, String owner) {
        this.model = model;
        this.year = year;
        this.owner = owner;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
