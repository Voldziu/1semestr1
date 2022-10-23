package TestPaczka;

public class Potegowanie {
    public static double Ptg(double x,int k) {

        double value=1;

        for (int i=1;i<=k;i++){
            value =value*x;
        }
        return value;
    }
}