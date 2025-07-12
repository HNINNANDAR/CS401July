package final_exam.prob5;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> stepCounts = Map.ofEntries(
                Map.entry("2024-06-01", 9000),
                Map.entry("2024-06-02", 10700),
                Map.entry("2024-06-03", 11500),
                Map.entry("2024-06-04", 9800),
                Map.entry("2024-06-05", 12500),
                Map.entry("2024-06-06", 13400),
                Map.entry("2024-06-07", 8200),
                Map.entry("2024-06-08", 15600),
                Map.entry("2024-06-09", 12900),
                Map.entry("2024-06-10", 9900),
                Map.entry("2024-06-11", 14700),
                Map.entry("2024-06-12", 8800),
                Map.entry("2024-06-13", 11400),
                Map.entry("2024-06-14", 14300),
                Map.entry("2024-06-15", 10200),
                Map.entry("2024-06-16", 15100),
                Map.entry("2024-06-17", 12700),
                Map.entry("2024-06-18", 10800),
                Map.entry("2024-06-19", 9700),
                Map.entry("2024-06-20", 16400),
                Map.entry("2024-06-21", 11900),
                Map.entry("2024-06-22", 10600),
                Map.entry("2024-06-23", 15500),
                Map.entry("2024-06-24", 13700),
                Map.entry("2024-06-25", 12100),
                Map.entry("2024-06-26", 11200),
                Map.entry("2024-06-27", 13200),
                Map.entry("2024-06-28", 8600),
                Map.entry("2024-06-29", 16800),
                Map.entry("2025-06-29", 16800),
                Map.entry("2024-06-30", 9900)
        );
        IntSummaryStatistics intSummaryStatistics = stepCounts.values().stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        int min = intSummaryStatistics.getMin();
        int max = intSummaryStatistics.getMax();
        long totalSteps = intSummaryStatistics.getSum();
        double avg = intSummaryStatistics.getAverage();
        List<String> minStepDates = getDateList(stepCounts,min);
        List<String> maxStepDates = getDateList(stepCounts,max);

        System.out.printf("Date(s) with highest steps (%d): %s\n",max,maxStepDates);
        System.out.printf("Date(s) with lowest steps (%d): %s\n",min,minStepDates);
        System.out.println("Total Steps: " + totalSteps);
        System.out.printf("Average steps per day: %.2f \n" ,avg);
        System.out.println("Dates above average: " + stepCounts.entrySet().stream()
                .filter(entry -> entry.getValue() > avg)
                        .map(entry -> entry.getKey() +" ("+ entry.getValue()+")")
                .collect(Collectors.joining(", ")));

    }
    static List<String> getDateList(Map<String, Integer> map, int x){
        List<String> dates = map.entrySet().stream()
                .filter(entry -> entry.getValue() == x)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return dates;
    }
}
