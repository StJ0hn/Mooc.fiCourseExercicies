package Part_I.Module_05.Ex_11_ComparingApartments;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (squares > compared.squares){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared){
        int absolutePrice = pricePerSquare * squares;
        int absolutePriceCompared = compared.pricePerSquare * compared.squares;
        if (absolutePrice > absolutePriceCompared){
            return absolutePrice - absolutePriceCompared;
        } else {
            return absolutePriceCompared - absolutePrice;
        }
    }

    public boolean moreExpensiveThan(Apartment compared){
        int absolutePrice = pricePerSquare * squares;
        int absolutePriceCompared = compared.pricePerSquare * compared.squares;
        if (absolutePrice > absolutePriceCompared){
            return true;
        } else {
            return false;
        }
    }

}
