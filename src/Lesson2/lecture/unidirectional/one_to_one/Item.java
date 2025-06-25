package Lesson2.lecture.unidirectional.one_to_one;

public class Item {
    private String itemName;
    public Item(String itemName){
        this.itemName = itemName;
    }
    public String toString(){
        return "Item{itemName = '"+ itemName + "'}";
    }
}
