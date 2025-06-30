package lesson05.Labs.prob2;

public class RedheadDuck extends Duck{
    public RedheadDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("displaying");
    }

}
