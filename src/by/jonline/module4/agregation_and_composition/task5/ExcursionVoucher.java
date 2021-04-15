package by.jonline.module4.agregation_and_composition.task5;

public class ExcursionVoucher extends Tour {

    public ExcursionVoucher(String type, String numberOfDays, String food, String typeOfTransport, int costOfTravel) {
        super(numberOfDays, food, typeOfTransport, costOfTravel);
        this.type = "Excursion";
    }

    @Override
    public String toString() {
        return "Tour type: " + type + super.toString();
    }
}
