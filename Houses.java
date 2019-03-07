public class Houses implements Position {
    private int x;
    private int y;
    private double distance;
    
    public Houses() {
        x = 0;
        y = 0;
    }
    
    public Houses(int s, int a, String str) {
        x = s;
        y = a;

    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public double getDistance() {
        return distance;
    }
 
   public double Distance(int x, int y) {
       distance = (Math.abs(this.getX() - x)) + (Math.abs(this.getY() - y));
       if(this.getY() != y && this.getX()%10 == x % 10){
           distance += 10;
       }
    return distance;
 }
}
