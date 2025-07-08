package lesson11.InClassExercise.terminal_operation;

import com.sun.security.jgss.GSSUtil;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,4);
        //find even numbers and multiply by 2
        List<Integer> processedEvenNumber = integers.stream()
                .filter(data -> data % 2 == 0) //intermediate operation
                .map(data -> data * 2) //intermediate operation
                .toList();  //terminal operation
        System.out.println(processedEvenNumber);
        
        //collect the processed numbers in a list
        List<Integer> processedOddNumber = integers.stream()
                .filter(data -> data % 2 != 0)
                .map(data -> data * 2)
                .collect(Collectors.toList());
        System.out.println(processedOddNumber);

        Set<Integer> integerSet = integers.stream() //set doesn't maintain duplicate data
                .filter(data -> data % 2 == 0)
                .collect(Collectors.toUnmodifiableSet());
        System.out.println(integerSet);
    }
}
