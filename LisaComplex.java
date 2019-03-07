public class LisaComplex implements Position {
  private int Lisa;
  private int street;
  private int avenue;
    Houses Houses = new Houses();
  
  public LisaComplex() {
      Lisa = 500;
      street = 149; //street entrance
      avenue = 33; //avenue entrance
  }
  
  public LisaComplex(int L, int s, int a) {
      Lisa = L;
      street = s;
      avenue = a;
  }
  
  public double getLisa() {
      return Lisa;
  }
  
  public int getX() {
      return street;
  }
  
  public int getY() {
      return avenue;
  } 
   
   public double Distance(int x, int y) {
       double distance = (Math.abs(this.getX() - x)) + (Math.abs(this.getY() - y));
       if(this.getY() != y && this.getX()%10 == x % 10){
           distance += 10;
       }
    return distance;
 }
}
