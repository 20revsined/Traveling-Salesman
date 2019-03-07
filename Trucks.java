public class Trucks {
private boolean BuyOrRent; //buy is true, rent is false
private int BuyTruck;
private int RentTruck;
private double GasCharge;
private double miles;
private int maintainence;
private int NumTrucks;
private int DeliveryTime;
private int TravelTime;
private int NumPackages;
Streets s = new Streets();
Avenues a = new Avenues();
Workers w = new Workers();
private int s1;
private int a1;
private String str;

public Trucks() {
BuyOrRent = false;
BuyTruck = 100000;
RentTruck = 15000;
GasCharge = 5 * miles;
maintainence = 1000 * NumTrucks;
DeliveryTime = (60 * 1 / w.getNumWorkers() * NumPackages) / 3600;
TravelTime = ((200 * s.getX() * 1000) + (1000 * a.getY() * 1000) * 30) / 3600;
}

public Trucks(boolean BoR, int main, int s, int a, String str1) {
    BuyOrRent = BoR;
    maintainence = main;
    s1 = s;
    a1 = a;
    str = str1;
}

public boolean getBoR() {
    return BuyOrRent;
}

public int getBT() {
    return BuyTruck;
}

public int getRT() {
    return RentTruck;
}

public double getMiles() {
    return miles;
}

public double getGC() {
    return GasCharge;
}

public double getMaintainence() {
    return maintainence;
}

public int getNT() {
    return NumTrucks;
}

public int getNP() {
    return NumPackages;
}

public int getDT() {
    return DeliveryTime;
}

public int getTT() {
    return TravelTime;
}

public int getX() {
    return s1;
}

public int getY() {
    return a1;
}

public String getStr() {
    return str;
}

public void Position (int s, int a, String str) {
        s = 125;
        a = 22;
        str = "A";
    }
}
