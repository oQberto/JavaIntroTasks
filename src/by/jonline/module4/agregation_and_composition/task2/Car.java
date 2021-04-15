/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */

package by.jonline.module4.agregation_and_composition.task2;

public class Car {
    private Wheel[] wheels;
    private Engine engine;
    private String carModel;
    private String color;
    private int fuelQuantity;

    public Car(Wheel[] wheels, Engine engine, String carModel, String color, int fuelQuantity) {
        this.wheels = wheels;
        this.engine = engine;
        this.carModel = carModel;
        this.color = color;
        this.fuelQuantity = fuelQuantity;
    }

    public String drive() {
        String go;
        for (Wheel wheel : this.wheels) {
            if (wheel != null) {
                go = "Поехали!";
            } else {
                go = "У машины не хватает колес!";
            }
        }

        if (this.engine != null) {
            go = "Поехали!";
        } else {
            go = "У машины не хватает двигателя!";
        }

        if (this.fuelQuantity == 0) {
            go = "У машины нет топлива!";
        }
        return go;
    }

    public String refuel(double addFuel) {
        if (this.fuelQuantity < 1) {
            this.fuelQuantity += addFuel;
        }
        return "Бак был заправлен на " + addFuel;
    }

    public String changeWheel(Wheel[] wheels) {
        int count = 0;
        for(Wheel wheel : wheels) {
            if (wheel.getWheelStrength() < 0.7) {
                count++;
            }
        }
        return "Заменено колес из-за поломки: " + count;
    }

    public String outputCarModel(String carModel) {
        return "Машина: " + carModel + " ";
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getColor() {
        return color;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelQuantity(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }
}
