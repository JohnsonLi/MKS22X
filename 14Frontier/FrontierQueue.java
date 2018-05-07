//BFS
import java.util.*;

public class FrontierQueue{
    private LinkedList<Location> locations = new LinkedList<>();

    public void add(Location n){
        locations.add(n);
    }

    public Location next(){
        locations.removeFirst();
    }

    public boolean hasNext(){
        return locations.getNext() != null;
    }

    

}