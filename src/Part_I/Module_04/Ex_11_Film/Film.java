package Part_I.Module_04.Ex_11_Film;

public class Film {
    private String name;
    private int ageRating;

    public Film(String name, int ageRating) {
        this.name = name;
        this.ageRating = ageRating;
    }

    public String name(){
        return name;
    }

    public int ageRating(){
        return ageRating;
    }
}
