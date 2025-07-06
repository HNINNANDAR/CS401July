package lesson09.InClass.interface_flexibility.with_interface;

import java.time.LocalDate;

public class Poster implements DisplayItem{
    private double length;
    private double width;
    private String owner;
    private LocalDate returnedDate;

    public Poster(String owner, LocalDate returnedDate,double length, double width) {
        this.length = length;
        this.width = width;
        this.owner = owner;
        this.returnedDate = returnedDate;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public LocalDate getReturnedDate() {
        return returnedDate;
    }
}
