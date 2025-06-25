package Lesson2.lecture.bidirectional.one_to_one;

public class Item {
    private String itemName;
    public Item(String itemName){
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                '}';
    }
}
