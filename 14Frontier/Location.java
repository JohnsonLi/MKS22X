public class Location{
    private int x,y;
    private Location previous;
    private int distToStart;

    public Location(int x, int y, Location prev){
        this.x = x;
        this.y = y;
        this. previous = prev;
    }

    public int getX(){return x;}
    public int getY(){return y;}
    public Location getPrevious(){return previous;}
}