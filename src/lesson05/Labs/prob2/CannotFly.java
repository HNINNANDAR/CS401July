package lesson05.Labs.prob2;

public class CannotFly implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
