package midterm.lesson2_practise.one_to_one;

public class Item {
    private String itemName;
    public Item(String itemName){
        this.itemName = itemName;
    }
    public String getItemName(){
        return itemName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                '}';
    }
}
