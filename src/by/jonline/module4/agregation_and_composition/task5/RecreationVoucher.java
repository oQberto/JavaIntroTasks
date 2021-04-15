package by.jonline.module4.agregation_and_composition.task5;

public class RecreationVoucher extends Tour{

    public RecreationVoucher(String numberOfDays, String food, String typeOfTransport, int costOfTravel) {
        super(numberOfDays, food, typeOfTransport, costOfTravel);
        this.type = "Recreation";
    }

    @Override
    public String toString() {
        return "Tour type: " + type + super.toString();
    }
}
