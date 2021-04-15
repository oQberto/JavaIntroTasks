package by.jonline.module4.agregation_and_composition.task5;

public class Tour {
    public String type;
    private String numberOfDays;
    private String food;
    private String typeOfTransport;
    private int costOfTravel;

    public Tour(String numberOfDays, String food, String typeOfTransport, int costOfTravel) {
        this.numberOfDays = numberOfDays;
        this.food = food;
        this.typeOfTransport = typeOfTransport;
        this.costOfTravel = costOfTravel;
    }

    public String getType() {
        return type;
    }

    public String getNumberOfDays() {
        return numberOfDays;
    }

    public String getFood() {
        return food;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public int getCostOfTravel() {
        return costOfTravel;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumberOfDays(String numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public void setCostOfTravel(int costOfTravel) {
        this.costOfTravel = costOfTravel;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "type='" + type + '\'' +
                ", numberOfDays='" + numberOfDays + '\'' +
                ", food='" + food + '\'' +
                ", typeOfTransport='" + typeOfTransport + '\'' +
                ", costOfTravel=" + costOfTravel +
                '}';
    }
}
