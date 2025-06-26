package lesson03.labs.prob2;

import java.util.*;

/**
 * 
 */
public class Landloard {

    private List<Building> buildingList;
    /**
     * Default constructor
     */
    public Landloard() {
        buildingList = new ArrayList<>();
    }
    public void addBuilding(Building building){
        buildingList.add(building);
    }
    public double calcProfits(){
        double totalProfit = 0.0;
        for(Building building: buildingList){
            totalProfit += building.generateProfit();
        }
        return totalProfit;
    }


}