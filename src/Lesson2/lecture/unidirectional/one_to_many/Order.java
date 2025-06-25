package Lesson2.lecture.unidirectional.one_to_many;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    List<Item> items;

    //Order should hv at least one customer
    Order(LocalDate orderDate){
        this.orderDate = orderDate;
        this.items = new ArrayList<>();
    }
    public void addItems(Item item){
        items.add(item);
    }
    public List<Item> getItems(){
        return items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", items=" + items +
                '}';
    }
}
