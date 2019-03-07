public class DistributionCenter implements Position {
    private int ExitStreet;
    private int ExitAvenue;
      Houses Houses = new Houses();
    
    public DistributionCenter() {
        ExitStreet = 125;
        ExitAvenue = 22;
    }
    
    public DistributionCenter(int ExS, int ExA) {
        ExitStreet = ExS;
        ExitAvenue = ExA;
    }
    
    public int getX() {
        return ExitStreet;
    }
    
    public int getY() {
        return ExitAvenue;
    }
    
   public double Distance(int x, int y) {
       double distance = (Math.abs(this.getX() - x)) + (Math.abs(this.getY() - y));
       if(this.getY() != y && this.getX()%10 == x % 10){
           distance += 10;
       }
    return distance;
 }
}
