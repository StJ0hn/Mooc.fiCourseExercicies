package Part_I.Module_04.Ex_19_TelevisionPrograms;

public class TelevisionProgram {
    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return name + ", " + duration + " minutes";
    }
}
