package by.jonline.module4.agregation_and_composition.task2;

public class Wheel {
    private String wheelModel;
    private String wheelNumber;
    private double wheelDiameter;
    private double wheelStrength;
    private String typeOfRubber;

    public Wheel(String wheelModel, String wheelNumber, double wheelDiameter, double wheelStrength, String typeOfRubber) {
        this.wheelModel = wheelModel;
        this.wheelNumber = wheelNumber;
        this.wheelDiameter = wheelDiameter;
        this.wheelStrength = wheelStrength;
        this.typeOfRubber = typeOfRubber;
    }

    public String getWheelModel() {
        return wheelModel;
    }

    public String getWheelNumber() {
        return wheelNumber;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public double getWheelStrength() {
        return wheelStrength;
    }

    public String getTypeOfRubber() {
        return typeOfRubber;
    }

    public void setWheelModel(String wheelModel) {
        this.wheelModel = wheelModel;
    }

    public void setWheelNumber(String wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public void setWheelStrength(double wheelStrength) {
        this.wheelStrength = wheelStrength;
    }

    public void setTypeOfRubber(String typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }
}
