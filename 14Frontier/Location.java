public class Location implements Comparable<Location> {
    private int x, y;
    private Location previous;
    private int dist;
    private int distSoFar = 0;

    public Location(int x, int y, Location prev, int dist) {
        this.x = x;
        this.y = y;
        this.previous = prev;
        this.dist = dist;
        this.distSoFar = prev.distSoFar + 1;
    }

    public int compareTo(Location n) {
        return dist - n.dist;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Location getPrevious() {
        return previous;
    }
}