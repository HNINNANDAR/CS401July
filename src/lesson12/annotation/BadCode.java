package lesson12.annotation;

//it takes default val when val is empty
@BugReport(assignedTo = "Johe", severity = 5)
public class BadCode {
    public int add(int a, int b){
        return a + b;
    }
}
