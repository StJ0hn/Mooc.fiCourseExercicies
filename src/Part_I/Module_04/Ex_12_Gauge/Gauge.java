package Part_I.Module_04.Ex_12_Gauge;

public class Gauge {
    private int value;
    public Gauge(){
        value = 0;
    }
    public void increase(){
        if (value < 5){
            value += 1;
        }
    }

    public void decrease(){
        if (value > 0){
            value -= 1;
        }
    }

    public int value(){
        return value;
    }

    public boolean full(){
        if (value == 5){
            return true;
        }
        else {
            return false;
        }
    }
}
