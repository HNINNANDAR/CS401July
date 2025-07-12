package lesson11.Labs.prob10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(false));
		System.out.println(someSimpleIsTrue(list));

		//prob10 - b
		Stream<String> stringStream = Stream.of("Bill", "Thomas","Mary");

 		System.out.println(stringStream
				.collect(Collectors.joining(", ")));

		//prob10 - c
		Stream<Integer> myIntStream = Stream.of(1,22,4,3,2,9,10);
		IntSummaryStatistics summaryStatistics = myIntStream.mapToInt(x -> x )
						.summaryStatistics();

		System.out.println(
				"Max: " + summaryStatistics.getMax()+
				" Min: " + summaryStatistics.getMin()
		);
	}

	//prob10 - a
	public static boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream()
						.map(Simple::getFlag)
				.reduce(false, (a,b)-> (a || b));
	}
}
