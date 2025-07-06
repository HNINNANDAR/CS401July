package lesson09.InClass.interface_flexibility.with_interface;

import java.time.LocalDate;

public enum DinasourStatue implements DisplayItem{
    DINASOUR_STATUE("Tom", LocalDate.of(2025,4,3));
    private String owner;
    private LocalDate returnedDate;

    DinasourStatue(String owner, LocalDate returnedDate) {
        this.owner = owner;
        this.returnedDate = returnedDate;
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
