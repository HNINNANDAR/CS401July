package lesson03.labs.prob3;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property property : properties) {
				totalRent += property.computeRent();
		}
		//tested git
		return totalRent;
	}
}
