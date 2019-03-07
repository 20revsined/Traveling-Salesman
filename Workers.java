public class Workers {
    private int regular;
    private int overtime;
    int rh; //regular hours worked
    int oh; //overtime hours worked
    private int NumWorkers = 1;
    
    public int getRegular() {
        return regular;
    }
    
    public int getOvertime() {
        return overtime;
    }
    
    public int getRH() {
        return rh;
    }
    
    public int getOH() {
        return oh;
    }
    
    public int getNumWorkers() {
        return NumWorkers;
    }
    
    public double Salary(double sr, double so) {
        if (rh <= 8) {
            sr = 30 * rh * NumWorkers;
        }
        
        else {
            so = 45 * oh * NumWorkers;
        }
        return sr + so;
    }
}
