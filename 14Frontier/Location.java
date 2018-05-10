public class Location /*implements Comparable<Location>*/{
    private int x,y;
    private Location previous;
    private double dist;

    public Location(int x, int y, Location prev, Maze maze){
        this.x = x;
        this.y = y;
        this. previous = prev;
        // dist = (Math.abs(x - maze.getEnd().getX()) + Math.abs(y - maze.getEnd().getY()));
    }

    // public 

    public int getX(){return x;}
    public int getY(){return y;}
    public Location getPrevious(){return previous;}
}