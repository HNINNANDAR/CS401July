package Lesson2.lecture.unidirectional.one_to_many;

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
