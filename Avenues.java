public class Avenues {
    private int AvenueNumber;
private int AvenueLength;
private int AvenueSeparation;

public Avenues() {
AvenueNumber = 0;
AvenueLength = 1000;
AvenueSeparation = 1000;
}

public Avenues(int AN, int AL, int AS) {
    AvenueNumber = AN;
    AvenueLength = AL;
    AvenueSeparation = AS;
}

public int getY() {
    return AvenueNumber;
}

public int getAL() {
    return 1000;
}

public int getAS() {
    return 1000;
}



private double StreetDistance = AvenueSeparation * AvenueNumber;

private double AvenueNumber() {
return AvenueNumber;
}
}
