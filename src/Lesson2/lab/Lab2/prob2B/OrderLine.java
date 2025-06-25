package Lesson2.lab.Lab2.prob2B;

public class OrderLine {
    private Order order;
    private String item;
    OrderLine(String item, Order order){
        this.item = item;
        this.order = order;
    }
//    public void setOrder(Order order){
//        this.order = order;
//    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "order=" + order.getOrderNum() +
                ", item='" + item + '\'' +
                '}';
    }
}
