public class BartComplex implements Position {
  private int Bart;
  private int street;
  private int avenue;
  int distance;
  Houses Houses = new Houses();
  
  public BartComplex() {
      Bart = 300;
      street = 2; //street entrance
      avenue = 3; //avenue entrance
  }
  
  public BartComplex(int B, int s, int a, int d) {
      Bart = B;
      street = s;
      avenue = a;
      distance = 0;
  }
  
  public double getBart() {
      return Bart;
  }
  
  public int getX() {
      return street;
  }
  
  public int getY() {
      return avenue;
  }
  
  public int getDistance() {
      return distance;
  }

   public double Distance(int x, int y) {
       double distance = (Math.abs(this.getX() - x)) + (Math.abs(this.getY() - y));
       if(this.getY() != y && this.getX()%10 == x % 10){
           distance += 10;
       }
    return distance;
 }
}
