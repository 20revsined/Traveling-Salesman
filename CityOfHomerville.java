public class CityOfHomerville {

    
    BartComplex Bart;
    LisaComplex Lisa;
    DistributionCenter ExS;
    DistributionCenter ExA;
    Houses house;
    int[] streets;
    int[] avenues;
    int i;

    public CityOfHomerville() {
        this.Bart = new BartComplex();
        this.Lisa = new LisaComplex();
        this.ExS = new DistributionCenter();
        this.ExA = new DistributionCenter();
        house = new Houses();
    }

    public int[] getX() {
        return streets;
    }

    public int[] getY() {
        return avenues;
    }

    public int getBartX() {
        return Bart.getX();
    }

    public int getBartY() {
        return Bart.getY();
    }

    public int getLisaX() {
        return Lisa.getX();
    }

    public int getLisaY() {
        return Lisa.getY();
    }


    public BartComplex getBart() {
        return Bart;
    }

    public LisaComplex getLisa() {
        return Lisa;
    }

    public DistributionCenter getExX() {
        return ExS;
    }

    public DistributionCenter getExY() {
        return ExA;
    }

    public static int Conversion(String str) {
        int letter = 0;
        if (str.equals("A")) {
            letter = 0;
        } else if (str.equals("B")) {
            letter = 1;
        } else if (str.equals("C")) {
            letter = 2;
        } else if (str.equals("D")) {
            letter = 3;
        } else if (str.equals("E")) {
            letter = 4;
        } else if (str.equals("F")) {
            letter = 5;
        } else if (str.equals("G")) {
            letter = 6;
        } else if (str.equals("H")) {
            letter = 7;
        } else if (str.equals("I")) {
            letter = 8;
        } else if (str.equals("J")) {
            letter = 9;
        }
        return letter;
    }

    public Position WhereAmI(int s, int a, String str) {
             Houses h = new Houses(s * 10, a, str + Conversion(str.substring(1)));
            return h;
    }
}
