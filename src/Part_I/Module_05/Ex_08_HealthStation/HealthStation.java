package Part_I.Module_05.Ex_08_HealthStation;

public class HealthStation {
    private int countWeigh;

    public int weigh(Person person){
        countWeigh++;
        return person.getWeight();
    }

    public void feed(Person person){
        int personWeight = person.getWeight();
        personWeight++;
        person.setWeight(personWeight);
    }

    public int weighings(){
        return countWeigh;
    }
}
