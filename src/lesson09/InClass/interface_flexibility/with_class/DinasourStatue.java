package lesson09.InClass.interface_flexibility.with_class;

import java.time.LocalDate;

public enum DinasourStatue {
    STATUE("Tom", LocalDate.of(2025,9,12));
    private String name;
    private LocalDate returnedDate;
    DinasourStatue(String name, LocalDate returnedDate){
        this.name = name;
        this.returnedDate = returnedDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getReturnedDate() {
        return returnedDate;
    }
}
