package Part_I.Module_05.Ex_06_OverloadedCounter;

public class Counter {
    private int startValue;

    public Counter (int startValue){
        this.startValue = startValue;
    }

    public Counter (){
        this.startValue = 0;
    }

    public int value(){
        return startValue;
    }

    public void increase (){
        startValue ++;
    }

    public void decrease(){
        startValue --;
    }

    public void increase(int increaseBy){
        startValue += increaseBy;
    }

    public void decrease(int decreaseBy){
        startValue -= decreaseBy;
    }

}
