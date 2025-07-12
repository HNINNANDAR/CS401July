package lesson11.InClassExercise.terminal_operation.toList_terminal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //every primitive boolean data is automatically BOXED into boolean wrapper class
        //False -> non-defective
        //True -> defective
        List<Boolean> scanFileStatus = List.of(true, false, true);

        //if one is true, not allow
        //anyMatch // if any defective file, raise an alert
        boolean uploadingStatus = scanFileStatus.stream()
                .anyMatch(data -> data.booleanValue()); //unboxing data nad get the boolean val
        if(!uploadingStatus){
            System.out.println("Uploading.. " +  uploadingStatus);
        }else {
            System.out.println("Rejected..");
        }

        //allow if all is false
        List<Boolean> fileStatuses1 = List.of(false, false, false); //everything should be false
        boolean allFalse = fileStatuses1.stream()
                .noneMatch(data -> data);
                //.allMatch(data -> data == false);
        if(allFalse){
            System.out.println("Uploading All Match ..");
        }else{
            System.out.println("Rejected All Match..");
        }

        List<String> colors = List.of("red", "green","blue");
        boolean colorStatus = colors.stream()
                .anyMatch(color -> color.equals("red"));
        if(colorStatus){
            System.out.println("It is found!");

        }
    }
}
