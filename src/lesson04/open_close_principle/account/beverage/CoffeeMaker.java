package lesson04.open_close_principle.account.beverage;

public class CoffeeMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("This is coffee brew!");
    }

    @Override
    void addCondiments() {
        System.out.println("Added condiments to coffee!");
    }
}
