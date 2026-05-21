package Part_I.Module_05.Ex_04_FitByte;

public class Fitbyte {
    private int age;
    private int restHeartRate;

    public Fitbyte(int age, int restHeartRate){
        this.age = age;
        this.restHeartRate = restHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum){
        double maximumHeartRate = 206.3 - (0.711 * age);

        return (maximumHeartRate * restHeartRate) + (percentageOfMaximum) + restHeartRate;
    }
}
