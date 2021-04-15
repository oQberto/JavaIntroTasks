package by.jonline.module4.agregation_and_composition.task2;

public class Engine {
    private String engineModel;
    private String engineNumber;
    private int enginePower;

    public Engine(String engineModel, String engineNumber, int enginePower) {
        this.engineModel = engineModel;
        this.engineNumber = engineNumber;
        this.enginePower = enginePower;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
