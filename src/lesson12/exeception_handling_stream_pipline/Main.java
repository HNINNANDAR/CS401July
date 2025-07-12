package lesson12.exeception_handling_stream_pipline;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Stream;

/***
 * This class is use for ...
 * @author Nandar
 * @author Hai
 * @since July 9, 2025
 * @version 1.0.1
 */
public class Main {
    /***
     * Read a couple of log files from stream API
     //* @param args..purpose of this para
     */
    public static void main(String[] args) {
        List<String> fileNames = List.of("log11.txt","log2.txt");
//        Stream<String> stream
//                long noofErr =
                        fileNames.stream()
                .flatMap(fileName -> readLog(fileName)) //flatmap because map itself couldn't get Stream<Stream<String>>
        .filter(line -> line.contains("ERROR"))
                .forEach(System.out::println);
//                .count();
//        System.out.println("NO of error: " + noofErr);

    }
            public static Stream<String> readLog(String fileName){
                BufferedReader bufferedReader = null;
                try {
                    bufferedReader = new BufferedReader(new FileReader(fileName));

                } catch (FileNotFoundException e) { //checkException ***
                    throw new RuntimeException(e); //uncheckException ***
                }
                return bufferedReader.lines();


            }

}
