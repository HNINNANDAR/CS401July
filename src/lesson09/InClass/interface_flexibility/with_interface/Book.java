package lesson09.InClass.interface_flexibility.with_interface;

import java.time.LocalDate;

public class Book implements DisplayItem {
    private final String title;
    private final LocalDate returnedDate;
    private final String owner;

    public Book(String title, LocalDate returnedDate, String owner) {
        this.title = title;
        this.returnedDate = returnedDate;
        this.owner = owner;
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
