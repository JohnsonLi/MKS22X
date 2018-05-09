public class MazeSolver{
    private Maze maze;
    private Frontier frontier;
    private boolean animate = true;

    public MazeSolver(String mazeText){
        maze = new Maze(mazeText);
    }

    //Default to BFS
    public boolean solve(){ return solve(0); }

    //mode: required to allow for alternate solve modes.
    //0: BFS
    //1: DFS
    public boolean solve(int mode){
      //initialize your frontier
        if(mode == 0){
            frontier = new FrontierQueue();
        } else if(mode == 1){
            frontier = new FrontierStack();
        }

        frontier.add(maze.getStart());
      //while there is stuff in the frontier:
      //  get the next location
      //  process the location to find the locations (use the maze to do this)
      //  check if any locations are the end, if you found the end just return true!
      //  add all the locations to the frontier
        while(frontier.hasNext()){
            if(animate){
                clearTerminal();
                System.out.println(this);
                wait(20);
            }
            
            Location location = frontier.next();
            Location[] neighbors = maze.getNeighbors(location);
            for(int i = 0; i < neighbors.length;i++){
                if(neighbors[i] != null){
                    frontier.add(neighbors[i]);
                    maze.set(neighbors[i].getX(),neighbors[i].getY(),'?');
                }
            }
            maze.set(location.getX(),location.getY(), '.');
            if(location.getX() == maze.getEnd().getX() && location.getY() == maze.getEnd().getY()){
                while (location != null) {
                    System.out.println(maze.toStringColor());
                    maze.set(location.getX(),location.getY(),'@');
                    location = location.getPrevious();
                }
                // maze.set(maze.getStart().getX(),maze.getStart().getY(),'@');
                return true;
            }
            for(Location n : maze.getNeighbors(location)){
                if(n != null){
                    frontier.add(n);
                }
            }
        }

      //when there are no more values in the frontier return false
      return false;
    }

    public String toString(){
      return maze.toString();
    }

   private void wait(int millis){
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException e) {
        }
     }

    public void setAnimate(boolean b){
        animate = b;
    }

    public void clearTerminal(){
        //erase terminal, go to top left of screen.

        System.out.println("\033[2J\033[1;1H");
    }

    public static void main(String[] args) {
        MazeSolver n = new MazeSolver("maze.txt");
        n.solve(1);
    }
}