package Lesson4.open_close_principle.account.beverage;

public class TeaMaker extends BeverageMaker{

    @Override
    void brew() {
        System.out.println("This is tea brew!");
    }

    @Override
    void addCondiments() {
        System.out.println("Added condiments to Tea!");
    }
}
