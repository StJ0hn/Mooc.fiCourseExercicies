package Part_I.Module_05.Ex_14_Books;

import Part_I.Module_05.Ex_12_Song.Song;

public class Book {
    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared){
            return true;
        }
        if (!(compared instanceof Book)) {
            return false;
        }
        Book comparedConvert = (Book) compared;

        if (this.getName().equals(comparedConvert.getName()) && this.publicationYear == comparedConvert.getPublicationYear()){
            return true;
        }

        return false;
    }
}
