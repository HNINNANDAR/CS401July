package lesson02.lab.Lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNum;
    private List<OrderLine> orderLineList;
    public Order(String orderNum){
        this.orderNum = orderNum;
        orderLineList = new ArrayList<>();
    }
    public String getOrderNum(){
        return orderNum;
    }
    public void addOrderLine(String item){
        orderLineList.add(new OrderLine(item,this));
    }
    public List<OrderLine> getOrderLineList(){
        return orderLineList;
    }
}
