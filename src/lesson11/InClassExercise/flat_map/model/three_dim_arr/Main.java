package lesson11.InClassExercise.flat_map.model.three_dim_arr;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String[][][] soccerPlayersByCountryAndYear = {
                // Year 2023
                {
                        // Argentina
                        {"Lionel Messi", "Julián Álvarez", "Enzo Fernández", "Emiliano Martínez", "Ángel Di María"},
                        // Brazil
                        {"Neymar", "Rodrygo", "Vinícius Júnior", "Casemiro", "Alisson Becker"}
                },
                // Year 2024
                {
                        // Argentina
                        {"Lionel Messi", "Julián Álvarez", "Enzo Fernández", "Alejandro Garnacho", "Emiliano Martínez"},
                        // Brazil
                        {"Neymar", "Rodrygo", "Vinícius Júnior", "Endrick", "Alisson Becker"}
                },
                // Year 2025
                {
                        // Argentina
                        {"Lionel Messi", "Julián Álvarez", "Enzo Fernández", "Alejandro Garnacho", "Facundo Buonanotte"},
                        // Brazil
                        {"Neymar", "Rodrygo", "Vinícius Júnior", "Endrick", "João Gomes"}
                }
        };

       Stream<String[][]> stream =  Arrays.stream(soccerPlayersByCountryAndYear); //three dimension of stream
        Stream<String[]> stream1 = stream.flatMap(data -> Arrays.stream(data));
        Stream<String> stream2 = stream1.flatMap(data -> Arrays.stream(data));
        System.out.println(stream2.distinct().count());

    }
}
