public class Streets {

private int StreetNumber;
private double StreetLength;
private double StreetSeparation;

public Streets() {
StreetNumber = 0;
StreetLength = 1000;
StreetSeparation = 200;
}

public Streets(int SN, double SL, double SS) {
    StreetNumber = SN;
    StreetLength = SL;
    StreetSeparation = SS;
}

public int getX() {
    return StreetNumber;
}

public double getSL() {
    return 1000;
}

public double getSS() {
    return 200;
}



//private double StreetDistance = StreetSeparation * StreetNumber;

private double StreetNumber() {
return StreetNumber;
}
}
