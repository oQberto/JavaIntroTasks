package by.jonline.module4.agregation_and_composition.task3;

import java.util.List;

public class City {
    private String cityName;
    private int cityPopulation;
    private double cityArea;
    private List<District> districts;
    private boolean capital;
    private boolean regionalCenter;

    public City(String cityName, int cityPopulation, double cityArea, List<District> districts, boolean capital, boolean regionalCenter) {
        this.cityName = cityName;
        this.cityPopulation = cityPopulation;
        this.cityArea = cityArea;
        this.districts = districts;
        this.capital = capital;
        this.regionalCenter = regionalCenter;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public double getCityArea() {
        return cityArea;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public boolean isCapital() {
        return capital;
    }

    public boolean isRegionalCenter() {
        return regionalCenter;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public int setCityPopulation(List<District> districts) {
        for (District district : districts) {
            this.cityPopulation += district.getDistrictPopulation();
        }
        return cityPopulation;
    }

    public void setCityArea(double cityArea) {
        this.cityArea = cityArea;
    }

    public double setCityArea(List<District> districts) {
        for (District district : districts) {
            this.cityArea += district.getDistrictArea();
        }
        return cityArea;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        this.regionalCenter = regionalCenter;
    }
}
