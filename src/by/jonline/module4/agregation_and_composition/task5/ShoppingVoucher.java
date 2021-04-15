package by.jonline.module4.agregation_and_composition.task5;

public class ShoppingVoucher extends Tour{

    public ShoppingVoucher(String numberOfDays, String food, String typeOfTransport, int costOfTravel) {
        super(numberOfDays, food, typeOfTransport, costOfTravel);
        this.type = "Shopping";
    }

    @Override
    public String toString() {
        return "Tour type: " + type + super.toString();
    }
}
