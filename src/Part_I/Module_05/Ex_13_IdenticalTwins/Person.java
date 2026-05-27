package Part_I.Module_05.Ex_13_IdenticalTwins;


public class Person {
    private String name;
    private SimpleDate birthday;
    private int weight;
    private int height;

    public Person(String name, SimpleDate birthday, int weight, int height) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared){
            return true;
        }
        if (!(compared instanceof Person)) {
            return false;
        }
        Person comparedConvert = (Person) compared;

        if (this.name.equals(comparedConvert.name) && this.birthday.equals(comparedConvert.birthday) && this.weight == comparedConvert.weight && comparedConvert.height == this.height){
            return true;
        }

        return false;
    }
}
