package lesson05.Labs.prob2;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    Duck(){

    }
    public void quack(){
        quackBehaviour.quack();
    }
    public void swim(){
        System.out.println("Swimming...");
    }
    public void display(){
        System.out.println("Display Duck..");
    }
    public void fly(){
        flyBehaviour.fly();
    }
}
