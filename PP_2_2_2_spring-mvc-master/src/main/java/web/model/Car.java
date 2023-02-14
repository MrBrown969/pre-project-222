package web.model;

public class Car {
    private String carModel;
    private String carColor;
    private String carEngine;

    public Car(String carModel, String carColor, String carEngine) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.carEngine = carEngine;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }
}
