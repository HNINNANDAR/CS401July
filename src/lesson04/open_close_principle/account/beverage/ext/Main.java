package lesson04.open_close_principle.account.beverage.ext;

import lesson04.open_close_principle.account.beverage.CoffeeMaker;
import lesson04.open_close_principle.account.beverage.TeaMaker;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        TeaMaker teaMaker = new TeaMaker();

        System.out.println("Coffee: ");
        coffeeMaker.makeBeverage();
        System.out.println("Tea: ");
        teaMaker.makeBeverage();
    }
}
