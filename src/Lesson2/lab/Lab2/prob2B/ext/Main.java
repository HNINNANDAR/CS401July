package Lesson2.lab.Lab2.prob2B.ext;

import Lesson2.lab.Lab2.prob2B.Order;
import Lesson2.lab.Lab2.prob2B.OrderLine;

public class Main {
    public static void main(String[] args){
        Order order = new Order("OR001");
        order.addOrderLine("Bulb");
        order.addOrderLine("Blanket");
        order.addOrderLine("Pillow");
        Order order01 = new Order("OR002");
        order01.addOrderLine("Apple");
        order01.addOrderLine("Kiwi");
        System.out.println(order.getOrderLineList());
    }
}
