package lesson03.labs.prob2;

import java.util.*;

/**
 * 
 */
public class Building {

    private List<Apartment> apartments;
    private double maintenanceCost;
    /**
     * Default constructor
     */
    public Building(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
        this.apartments = new ArrayList<>();
    }
    public void addApartment(Apartment apartment){
        apartments.add(apartment);
    }
    public double generateProfit() {
        double totalRent = 0.0;
        for(Apartment apartment: apartments){
            totalRent += apartment.getRent();
        }
        return totalRent - maintenanceCost;
    }

}