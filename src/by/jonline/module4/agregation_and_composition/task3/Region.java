package by.jonline.module4.agregation_and_composition.task3;

import java.util.List;

public class Region {
    private String regionName;
    private int regionPopulation;
    private double regionArea;
    private List<City> cities;

    public Region(String regionName, int regionPopulation, double regionArea, List<City> cities) {
        this.regionName = regionName;
        this.regionPopulation = regionPopulation;
        this.regionArea = regionArea;
        this.cities = cities;
    }

    public void addCity(City city){
        cities.add(city);
    }

    public String getRegionName() {
        return regionName;
    }

    public int getRegionPopulation() {
        return regionPopulation;
    }

    public double getRegionArea() {
        return regionArea;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setRegionPopulation(int regionPopulation) {
        this.regionPopulation = regionPopulation;
    }

    public int setRegionPopulation(List<City> cities) {
        for (City city : cities) {
            this.regionPopulation += city.getCityPopulation();
        }
        return regionPopulation;
    }

    public void setRegionArea(double regionArea) {
        this.regionArea = regionArea;
    }

    public double setRegionArea(List<City> cities) {
        for (City city : cities) {
            this.regionArea += city.getCityArea();
        }
        return regionArea;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

}
