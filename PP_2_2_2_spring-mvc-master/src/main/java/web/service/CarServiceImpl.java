package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
private List <Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", "Green", "V1"));
        cars.add(new Car("Volga", "Red", "V2"));
        cars.add(new Car("Gazel", "Yellow", "V3"));
        cars.add(new Car("Opel", "Blue", "V4"));
        cars.add(new Car("Renault", "Grey", "V5"));

    }


    public List<Car> giveSeveralCars (int carCount) {
        List<Car> chosenCars = cars.stream().limit(carCount).toList();
        return chosenCars;
    }
}
