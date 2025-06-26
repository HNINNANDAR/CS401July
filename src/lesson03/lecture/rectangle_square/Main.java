package lesson03.lecture.rectangle_square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());
        Rectangle square = new Square(5);
        square.setWidth(6);
        //changing the behaviour of square.
        //Make the parent immutable

        System.out.println(square.getArea());
    }
}
