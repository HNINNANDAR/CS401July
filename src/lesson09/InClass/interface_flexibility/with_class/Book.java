package lesson09.InClass.interface_flexibility.with_class;

import java.time.LocalDate;

public class Book extends DisplayItem{
    private String title;

    public Book(String owner, LocalDate returnedDate, String title) {
        super(owner, returnedDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
