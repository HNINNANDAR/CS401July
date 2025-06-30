package lesson05.Labs.prob2;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        flyBehaviour = new CannotFly();
        quackBehaviour = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("displaying");
    }
}
