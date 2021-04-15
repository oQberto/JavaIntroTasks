package by.jonline.module4.agregation_and_composition.task3;

public class District {
    private String districtName;
    private int districtPopulation;
    private double districtArea;

    public District(String districtName, int districtPopulation, double districtArea) {
        this.districtName = districtName;
        this.districtPopulation = districtPopulation;
        this.districtArea = districtArea;
    }

    public String getDistrictName() {
        return districtName;
    }

    public int getDistrictPopulation() {
        return districtPopulation;
    }

    public double getDistrictArea() {
        return districtArea;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public void setDistrictPopulation(int districtPopulation) {
        this.districtPopulation = districtPopulation;
    }

    public void setDistrictArea(double districtArea) {
        this.districtArea = districtArea;
    }
}
