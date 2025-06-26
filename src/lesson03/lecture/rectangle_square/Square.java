package lesson03.lecture.rectangle_square;

public class Square extends Rectangle{
    private double length;

    public Square(double length) {
        super(length,length);
        this.length = length;
    }
}
