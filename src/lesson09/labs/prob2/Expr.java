package lesson09.labs.prob2;

public sealed interface Expr permits Constant, Add, Multiply {}
