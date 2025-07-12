package final_exam.prob7and8;

public class Car {
    private String brand;
    private String model;
    private int price;
    private int year;

    public Car(String brand, String model, int price, int year) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
