import java.util.ArrayList;
import java.util.List;

public class NearestNeighborAlgorithm {

    private List<Position> array1;
    private List<Position> array2;
    private List<Position> arrayA;
    private List<Position> arrayB;
    private List<Position> arrayC;
    private List<Position> arrayD;
    private Houses list[] = new Houses[3];
    private double distance2;
    Position position;
    Position p1;
    Position p5;
    private double TotalDistance;
    private double TotalDistance1;
    private double distance;
    BartComplex bc;
    LisaComplex lc;

    DistributionCenter DC;

    public NearestNeighborAlgorithm(List<Position> a1) {
        array1 = a1;
        array2 = new ArrayList<Position>();
        distance2 = 0;
        TotalDistance = 0;
        TotalDistance1 = 0;
    }

    public List<Position> getArray1() {
        return array1;
    }

    public List<Position> getArray2() {
        return array2;
    }

    public double getDistance2() {
        return distance2;
    }

    public double getTotalDistance() {
        return TotalDistance;
    }

    public double getTotalDistance1() {
        return TotalDistance1;
    }

    public Houses[] getList() {
        return list;
    }

    public void Information() {
        p1 = new DistributionCenter();
        p5 = new DistributionCenter();
        array2.add(p1);
        int j = array1.size();
position = p1;
        for (int i = 0; i < j; i++) {
            if (array1.size() > 0) {
                distance = 10000000;
                
//System.out.println(position.getX() + ", " + position.getY());

                for (Position p : array1) {
                    distance2 = p.Distance(p1.getX(), p1.getY());
                    if (distance2 < distance) {
                        distance = distance2;
                        position = p;
                        
                    }
                }
                TotalDistance += distance;
                array2.add(position);
                array1.remove(position);
                p1 = position;
//       System.out.println(i);
//       System.out.println(p1.getX());
//       System.out.println(p1.getY());
//       System.out.println(TotalDistance)
//System.out.println(position.getX() + ", " + position.getY());
//System.out.println(distance);


            } else {
                System.out.println("oops!");
            }
        }

//        for(Position p: array2) {
//            System.out.println(p.getX());
//            
//        }
//        System.out.println(array2.get(array2.size() - 1).getX());
//            System.out.println(array2.get(array2.size() - 1).getY());
        TotalDistance1 = TotalDistance + array2.get(array2.size() - 1).Distance(p5.getX(), p5.getY());
////        System.out.println("FASDFSADFSADFAS " + TotalDistance1);
        array2.add(p5);
//        Trucks t1 = new Trucks();
//        Trucks t2 = new Trucks();
//        Trucks t3 = new Trucks();
//        Trucks t4 = new Trucks();
//        List<Position> positions1 = new ArrayList<Position>();
//        List<Position> positions2 = new ArrayList<Position>();
//        List<Position> positions3 = new ArrayList<Position>();
//        List<Position> positions4 = new ArrayList<Position>();
//
//        for (Position p : array1) {
//            if (p.getX() < 125) {
//                if (p.getY() < 25) {
//                    positions1.add(p);
//                } else {
//                    positions2.add(p);
//                }
//            } else {
//                if (p.getY() < 25) {
//                    positions3.add(p);
//                } else {
//                    positions4.add(p);
//                }
//            }
//        }
//
//        t1.setRoute(nn.getFastestRoute(positions1));
//        t2.setRoute(a.getFastestRoute(positions2));
//        t3.setRoute(a.getFastestRoute(positions3));
//        t4.setRoute(a.getFastestRoute(positions4));
//
//        int totalD = a.getTotalDistance();
//        int numOfComplexPackages = 0;
//        for (Position p : positions1) {
//            if ((p.getX() == bc.getX() && p.getY() == bc.getY())
//                    || (p.getX() == lc.getX() && p.getY() == lc.getY())) {
//                numOfComplexPackages++;
//            }
//        }
//        for (Position p : positions2) {
//            if ((p.getX() == bc.getX() && p.getY() == bc.getY())
//                    || (p.getX() == lc.getX() && p.getY() == lc.getY())) {
//                numOfComplexPackages++;
//            }
//        }
//        for (Position p : positions3) {
//            if ((p.getX() == bc.getX() && p.getY() == bc.getY())
//                    || (p.getX() == lc.getX() && p.getY() == lc.getY())) {
//                numOfComplexPackages++;
//            }
//        }
//        for (Position p : positions4) {
//            if ((p.getX() == bc.getX() && p.getY() == bc.getY())
//                    || (p.getX() == lc.getX() && p.getY() == lc.getY())) {
//                numOfComplexPackages++;
//            }
//        }
    }

    public double DistanceRoute() {
        return TotalDistance1 / 500; //mulitplied by 10 and divided by 5000 --> divided by 500 to make it more efficient
    }
}
