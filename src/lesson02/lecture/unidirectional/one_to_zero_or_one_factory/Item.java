package lesson02.lecture.unidirectional.one_to_zero_or_one_factory;

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

