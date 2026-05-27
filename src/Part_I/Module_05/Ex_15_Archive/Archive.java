package Part_I.Module_05.Ex_15_Archive;

import Part_I.Module_05.Ex_14_Books.Book;

public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared){
            return true;
        }
        if (!(compared instanceof Archive)){
            return false;
        }
        Archive comparedConvert = (Archive) compared;
        return this.getIdentifier().equals(comparedConvert.getIdentifier());
    }

    @Override
    public String toString() {
        return getIdentifier() + ": " + getName();
    }
}

