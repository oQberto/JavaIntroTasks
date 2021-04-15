/*
Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры.
 */

package by.jonline.module4.agregation_and_composition.task3;

import java.util.List;

public class Nation {
    private String nationName;
    private int nationPopulation;
    private double nationArea;
    private List<Region> regions;
    private List<City> regionCentres;

    public Nation(String nationName, int nationPopulation, List<Region> regions) {
        this.nationName = nationName;
        this.nationPopulation = nationPopulation;
        this.regions = regions;
    }

    public String outputCapital(List<Region> regions) {
        for (Region region : regions) {
            for (City city : region.getCities()) {
                if (city.isCapital()) {
                    return city.getCityName();
                }
            }
        }
        return "";
    }

    public String outputNumberOfRegions(List<Region> regions) {
        return "Количество областей: " + regions.size();
    }

    public double nationArea(List<Region> regions) {
        for (Region region : regions) {
            nationArea += region.getRegionArea();
        }
        return nationArea;
    }

    public List<City> getRegionCentres(List<Region> regions) {
        for (Region region : regions) {
            for (City city : region.getCities()) {
                if (city.isRegionalCenter()) {
                    regionCentres.add(city);
                }
            }
        }
        return regionCentres;
    }

    public String getNationName() {
        return nationName;
    }

    public int getNationPopulation() {
        return nationPopulation;
    }

    public double getNationArea() {
        return nationArea;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public void setNationPopulation(int nationPopulation) {
        this.nationPopulation = nationPopulation;
    }

    public void setNationArea(double nationArea) {
        this.nationArea = nationArea;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}
