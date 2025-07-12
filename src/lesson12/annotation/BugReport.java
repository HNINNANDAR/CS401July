package lesson12.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //class, enum, interface
public @interface BugReport {
    //every annotation is interface
    //members are methods
    String assignedTo() default "unassigned";
    int severity() default 1;
}
