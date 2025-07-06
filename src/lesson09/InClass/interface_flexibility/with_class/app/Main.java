package lesson09.InClass.interface_flexibility.with_class.app;

import lesson09.InClass.interface_flexibility.with_class.Book;
import lesson09.InClass.interface_flexibility.with_class.DinasourStatue;
import lesson09.InClass.interface_flexibility.with_class.DisplayItem;
import lesson09.InClass.interface_flexibility.with_class.Poster;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DinasourStatue dinasourStatue = DinasourStatue.STATUE;
        DisplayItem[] items = {
                new Book("James Gosling", LocalDate.of(2024,12,3),"Java"),
                new Book("James Hello", LocalDate.of(2024,12,3),"Java"),
                new Poster("Hiin",LocalDate.of(2024, 12,8),10.34,21.23),
                new Poster("Jackk",LocalDate.of(2024, 12,8),10.34,21.23)
//                DinasourStatue.STATUE //err -> enum and displayItem should hav an inherritance relationship
        };
        for (DisplayItem displayItem: items){
            displayItem.displayInfo();
        }
    }
}
