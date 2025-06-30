package lesson05.Labs.prob2;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehaviour = new CannotFly();
        quackBehaviour = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("displaying");
    }
}
