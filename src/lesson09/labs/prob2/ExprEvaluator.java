package lesson09.labs.prob2;

public class ExprEvaluator {
    public static int eval(Expr expr) {
        return switch (expr) {
            case Constant c -> c.value();
            case Add a -> eval(a.left()) + eval(a.right());
            case Multiply m -> eval(m.left()) * eval(m.right());
        };
    }

    public static void main(String[] args) {
        Expr expression = new Multiply(
                new Add(new Constant(2), new Constant(3)),
                new Constant(4)
        );

        int result = eval(expression);
        System.out.println("Result: " + result);
    }

}
