package lesson09.InClass.interface_flexibility.with_interface;

import java.time.LocalDate;

public interface DisplayItem {
    public abstract String getOwner();
    public abstract LocalDate getReturnedDate();
    public default void displayInfo(){
        System.out.println(getOwner() +" " + getReturnedDate());
    }
}
