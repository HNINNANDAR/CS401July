package lesson03.lecture.ripple_effect;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//track, how many elements are added to HS
//add -> add one element
//addAll -> add collection
public class ExtendedHashSet<T> extends HashSet<T> {
    private int addedCount = 0;

    @Override
    public boolean add(T t) {
        addedCount++;
        return super.add(t);
    }

    //? -> white card
    @Override
    public boolean addAll(Collection<? extends T> c) {
        //this addAll is calling add method again,
        //add method being called and the count getting increase
        addedCount += c.size();
        return super.addAll(c);
    }

    public int getAddedCount() {
        return addedCount;
    }
}
class Main{
    public static void main(String[] args) {
        ExtendedHashSet<Integer> extendedHashSet = new ExtendedHashSet<Integer>();
        extendedHashSet.add(3);
        extendedHashSet.add(13);
        extendedHashSet.add(7);
        System.out.println(extendedHashSet.getAddedCount());
        extendedHashSet.addAll(Set.of(40,50,60)); //expected: 6
        System.out.println(extendedHashSet.getAddedCount());
    }
}