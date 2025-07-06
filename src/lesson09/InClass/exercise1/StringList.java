package lesson09.InClass.exercise1;

public interface StringList {
    String[] strArr();
    int size();
    void incrementSize();

//    public void add(String s);
//    public String get(int i);

    public default void add(String s) {
        strArr()[size()] = s; //add s to the last index
        incrementSize();

    }
    public default String get(int i){
        if(!(i > 0 && i < size())) throw new IndexOutOfBoundsException("out of bound");
        return strArr()[i];
    }

}
