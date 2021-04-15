package by.jonline.module4.agregation_and_composition.task5;

public class WellnessVoucher extends Tour{

    public WellnessVoucher(String numberOfDays, String food, String typeOfTransport, int costOfTravel) {
        super(numberOfDays, food, typeOfTransport, costOfTravel);
        this.type = "Wellness";
    }

    @Override
    public String toString() {
        return "Tour type: " + type + super.toString();
    }
}
