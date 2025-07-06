package lesson09.InClass.interface_flexibility.with_class;

import java.time.LocalDate;

public class DisplayItem {
    private String owner;
    private LocalDate returnedDate;

    public DisplayItem(String owner, LocalDate returnedDate) {
        this.owner = owner;
        this.returnedDate = returnedDate;
    }

    public String getOwner() {
        return owner;
    }

    public LocalDate getReturnedDate() {
        return returnedDate;
    }
    public void displayInfo(){
        System.out.println("Owner: " + owner + " Returned Date: " + returnedDate);
    }
}
